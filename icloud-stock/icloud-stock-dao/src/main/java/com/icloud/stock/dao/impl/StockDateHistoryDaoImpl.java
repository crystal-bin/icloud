package com.icloud.stock.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.icloud.dao.impl.StockBaseDaoImpl;
import com.icloud.framework.util.ICloudUtils;
import com.icloud.stock.dao.IStockDateHistoryDao;
import com.icloud.stock.model.StockDateHistory;

@Repository("stockDateHistoryDao")
public class StockDateHistoryDaoImpl extends StockBaseDaoImpl<StockDateHistory>
		implements IStockDateHistoryDao {

	@Override
	public Date getMaxUpdateTime(Integer id) {
		String hql = "select max(createTime) from " + domainClass.getName()
				+ " x where stock_id = " + id;
		List list = getHibernateTemplate().find(hql);
		if (ICloudUtils.isEmpty(list)) {
			return null;
		} else {
			Date date = (Date) list.get(0);
			return date;
		}
	}

	@Override
	public void deleteByStockId(final Integer id) {
		this.deleteByProperty(STOCKID, id);
		// getHibernateTemplate().execute(
		// new HibernateCallback<StockDateHistory>() {
		// @Override
		// public StockDateHistory doInHibernate(Session session)
		// throws HibernateException, SQLException {
		// // TODO Auto-generated method stub
		// String hqlDelete = "delete " + domainClass.getName()
		// + " where stockId = " + id;
		// session.createQuery(hqlDelete).executeUpdate();
		// return null;
		// }
		//
		// });
	}

	@Override
	public List<StockDateHistory> findByStockId(Integer id) {
		// String hql = "from " + domainClass.getName() + " where stockId = " +
		// id
		// + " order by createTime desc";
		String[] params = { STOCKID };
		Integer[] values = { id };
		// return this.findByProperty(hql);
		return this.findByProperty(params, values, CREATETIME, false);
	}

	@Override
	public List<StockDateHistory> findByStockId(Integer id, int start, int limit) {
		String[] params = { STOCKID };
		Integer[] values = { id };
		return this.findByProperty(params, values, CREATETIME, false, start,
				limit);
	}
}
