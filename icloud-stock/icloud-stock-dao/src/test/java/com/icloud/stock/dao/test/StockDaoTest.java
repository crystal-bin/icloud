package com.icloud.stock.dao.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.icloud.stock.dao.ICategoryDao;
import com.icloud.stock.dao.IStockDao;
import com.icloud.stock.model.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring/icloud-stock-dao-ctx-min.xml" })
public class StockDaoTest {
	@Resource(name = "stockDao")
	private IStockDao stockDao;

	@Resource(name = "categoryDao")
	private ICategoryDao categoryDao;

	// // @Test
	// public void saveTest() {
	// for (int i = 0; i < 20; i++) {
	// Stock t = new Stock();
	// t.setStockCode("code" + i);
	// t.setStockName("新疆");
	// stockDao.save(t);
	// }
	// }

	@Test
	public void getId() {
		System.out.println("##############################3");
		Category category = categoryDao.getById(885);
		System.out.println(category);
		System.out.println("-------------------------");
	}

	// @Test
	// public void updateStockTest() {
	// List<Stock> list = stockDao.findAll();
	// if (list != null) {
	// Stock stock = list.get(0);
	// System.out.println(stock.getStockCode() + stock.getStockName());
	// stock.setStockCode("44444");
	// stockDao.update(stock);
	// Stock stock2 = stockDao.getById(stock.getId());
	//
	// // System.out.println(stock2.getId());
	// System.out.println(stock2.getStockCode() + stock2.getStockName());
	// }
	// }
	//
	// @Test
	// public void getStockTest() {
	// List<Stock> list = stockDao.findAll();
	// for (Stock stock : list) {
	// System.out.println(stock.getStockCode() + stock.getStockName());
	// }
	// System.out.println("--------------> ");
	// long count = stockDao.count();
	// System.out.println("count  == " + count);
	// }

}
