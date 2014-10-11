package com.icloud.front.stock.bussiness;

import java.util.List;

import org.junit.Test;

import com.icloud.front.stock.StockBussinessTest;
import com.icloud.front.stock.pojo.BaseStockMenu;
import com.icloud.front.stock.pojo.StockMenuBean;
import com.icloud.stock.model.constant.StockEnum.BaseCategory;

public class StockCommonBussiessTest extends StockBussinessTest {
	@Test
	public void testGetMenu() {
		List<BaseStockMenu> baseMenu = stockCommonBussiness.getBaseMenu();
	}

	@Test
	public void testGetMenus() {
		List<StockMenuBean> list = stockCommonBussiness
				.getStockMenuBean(BaseCategory.ZHENGJIANHUI.getType());
		int i = 0;
		for (StockMenuBean bean : list) {
			System.out.println(bean.getName());
			System.out.println("------");
			for (BaseStockMenu menu : bean.getMenus()) {
				System.out.print(menu.getName() + " ");
				i++;
			}
			System.out.println();
			System.out.println("###############");
		}
		System.out.println("count = " + i);
	}
}
