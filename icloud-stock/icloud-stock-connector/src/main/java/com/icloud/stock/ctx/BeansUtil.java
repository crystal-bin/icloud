package com.icloud.stock.ctx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.icloud.stock.service.ICategoryService;
import com.icloud.stock.service.ICategoryStockService;
import com.icloud.stock.service.IStockDateHistoryService;
import com.icloud.stock.service.IStockService;

public class BeansUtil {
	private static ApplicationContext app;

	static {
		app = new ClassPathXmlApplicationContext(
				"spring/icloud-stock-service-ctx-min.xml");

	}

	public static IStockService getStockService() {
		return (IStockService) app.getBean("stockService");
	}

	public static ICategoryService getCategoryService() {
		return (ICategoryService) app.getBean("categoryService");
	}

	public static ICategoryStockService getCategoryStockService() {
		return (ICategoryStockService) app.getBean("categoryStockService");
	}

	public static IStockDateHistoryService getStockDateHistoryService() {
		return (IStockDateHistoryService) app
				.getBean("stockDateHistoryService");
	}
}
