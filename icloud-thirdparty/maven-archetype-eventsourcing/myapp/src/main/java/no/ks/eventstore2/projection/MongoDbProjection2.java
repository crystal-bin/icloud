package no.ks.eventstore2.projection;

import akka.actor.ActorRef;
import com.mongodb.*;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;
import no.ks.eventstore2.store.MongoDbStore;
import org.apache.commons.io.IOUtils;

public abstract class MongoDbProjection2 extends ProjectionSnapshot {

	private MongoDbStore store;
	private GridFS gridFS;

	private static String nodename = System.getProperty("nodename") != null ? System
			.getProperty("nodename") : "local";

	public MongoDbProjection2(ActorRef eventStore, MongoClient client) {
		super(eventStore);
		this.store = new MongoDbStore(client, nodename + "_SnapshotRepository");
		gridFS = new GridFS(store.getDb(), nodename + "_snapshot_data");
		store.getCollection("snapshot").ensureIndex(
				new BasicDBObject("dataVersion", 1).append("projectionId", 1));
	}

	@Override
	public void preStart() {
		super.preStart();
		loadSnapshot();
	}

	@Override
	public void saveSnapshot() {
		log.info("{} Saving snapshot for event {}", getClass().getSimpleName(),
				latestJournalidReceived);

		try {
			DBCollection collection = store.getCollection("snapshot");
			if (latestJournalidReceived != null) {
				DBObject update = new BasicDBObject("_id", getId())
						.append("jid", latestJournalidReceived)
						.append("dataVersion", getSnapshotDataVersion())
						.append("projectionId", getAggregateRootId());

				collection.save(update);

				saveDataToGridFS();

				log.info("{} Saved snapshot for event {}", getClass()
						.getSimpleName(), latestJournalidReceived);
			}
		} catch (Exception e) {
			log.error("Failed to write snapshot", e);
		}
	}

	@Override
	public void loadSnapshot() {
		log.info("{} loading snapshot for event {}", getAggregateRootId(),
				latestJournalidReceived);

		DBCursor dbObjects = null;
		try {
			DBCollection collection = store.getCollection("snapshot");
			BasicDBObject query = new BasicDBObject("projectionId",
					getAggregateRootId()).append("dataVersion",
					getSnapshotDataVersion());

			dbObjects = collection.find(query);

			if (dbObjects.hasNext()) {
				DBObject next = dbObjects.next();
				String latestJournalIdSnapshoted = (String) next.get("jid");

				BasicDBObject fileQuery = new BasicDBObject("_id", getId());
				GridFSDBFile file = gridFS.findOne(fileQuery);
				if (file != null) {
					deSerializeData(IOUtils.toByteArray(file.getInputStream()));
				}

				if (latestJournalIdSnapshoted != null) {
					latestJournalidReceived = latestJournalIdSnapshoted;
					log.info("loaded snapshot for event {}",
							latestJournalidReceived);
				}
			}
		} catch (Exception e) {
			log.error("Failed to load snapshot for {}", getClass()
					.getSimpleName(), e);
			latestJournalidReceived = null;
		} finally {
			if (dbObjects != null) {
				dbObjects.close();
			}
		}
	}

	protected void saveDataToGridFS() {
		gridFS.remove(new BasicDBObject("_id", getId()));

		GridFSInputFile file = gridFS.createFile(serializeData());
		file.setId(getId());
		file.save();
	}

	private String getId() {
		return "v_" + getSnapshotDataVersion() + "_"
				+ this.getClass().getName();
	}

	protected abstract byte[] serializeData();

	protected abstract void deSerializeData(byte[] bytes);

	/**
	 * Data version this projection uses
	 *
	 * @return
	 */
	protected abstract String getSnapshotDataVersion();

	/**
	 * Data id
	 */

	protected abstract String getAggregateRootId();

}
