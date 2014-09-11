package com.icloud.mongo.dao.impl;

import java.io.File;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.bson.types.ObjectId;

import com.github.jmkgreen.morphia.Datastore;
import com.icloud.mongo.Constants;
import com.icloud.mongo.dao.IImageBasicDao;
import com.icloud.mongo.entity.ImageEntity;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFS;
import com.mongodb.gridfs.GridFSDBFile;
import com.mongodb.gridfs.GridFSInputFile;

public class ImageBasicDaoImpl implements IImageBasicDao {

	public GridFS grfs;

	// public GridFS grfsContract;

	@Resource
	public Datastore datastore;

	@Override
	public void setDatastore(Datastore ds) {
		this.datastore = ds;
	}

	// @PostConstruct
	// public void initGridFS() throws Exception {
	// grfs = new GridFS(datastore.getDB(), Constants.GRIDFS_PICTURE_BUCKET);
	// // grfsContract = new GridFS(datastore.getDB(),
	// // Constants.GRIDFS_CONTRACT_BUCKET);
	// }

	@Override
	public ObjectId saveImage(File img, String filename, Long version)
			throws IOException {
		GridFSInputFile gFile = grfs.createFile(img);
		gFile.setFilename(filename);
		gFile.put(Constants.IMAGE_VERSION_PROPERTY_KEY, version);
		gFile.save();
		return (ObjectId) gFile.getId();
	}

	@Override
	public Long getCurrentVersion(String filename) {
		GridFSDBFile gFile = grfs.findOne(filename);
		if (gFile == null) {
			return null;
		}
		return (Long) gFile.get(Constants.IMAGE_VERSION_PROPERTY_KEY);
	}

	@Override
	public void removeImage(String mediaTypeId) {
		DBObject dbo = new BasicDBObject();
		dbo.put(Constants.MEDIATYPE_ID, mediaTypeId);
		grfs.remove(dbo);
	}

	@Override
	public void removeImageById(String mediaId) {
		DBObject dbo = new BasicDBObject();
		dbo.put(Constants.MEDIA_ID, mediaId);
		grfs.remove(dbo);
	}

	@Override
	public ImageEntity getImage(String filename) {
		GridFSDBFile gFile = grfs.findOne(filename);
		if (gFile == null) {
			return null;
		}

		ImageEntity ie = new ImageEntity();
		ie.setInputStream(gFile.getInputStream());
		ie.setVersion((Long) gFile.get(Constants.IMAGE_VERSION_PROPERTY_KEY));

		return ie;
	}

	@Override
	public ObjectId saveBlankImage(String filename, long version) {
		GridFSInputFile gFile = grfs.createFile(new byte[] {});
		gFile.setFilename(filename);
		gFile.put(Constants.IMAGE_VERSION_PROPERTY_KEY, version);
		gFile.save();
		return (ObjectId) gFile.getId();
	}
}
