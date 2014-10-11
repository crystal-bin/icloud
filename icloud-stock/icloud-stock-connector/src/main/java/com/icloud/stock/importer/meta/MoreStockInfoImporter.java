package com.icloud.stock.importer.meta;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.icloud.framework.file.TextFile;
import com.icloud.stock.ctx.BaseServiceImporter;
import com.icloud.stock.model.Category;
import com.icloud.stock.model.CategoryStock;
import com.icloud.stock.model.Stock;
import com.icloud.stock.model.constant.StockEnum.BaseCategory;
import com.icloud.stock.model.constant.StockEnum.StockLocation;

/**
 *
 * @author jiangningcui
 *
 */
public class MoreStockInfoImporter extends BaseServiceImporter {

	public void importMetaInfo() {
		String filePath = "/home/jiangningcui/workspace/mygithub/icloud/icloud-data/xueqiu/processed/jichufenlei.txt";
		importFile(filePath, BaseCategory.BASE);
	}

	public void importFile(String filePath, BaseCategory baseCategory) {
		List<String> content = getContent(filePath);
		/**
		 * 类别
		 */
		Map<String, Category> categoryMap = new HashMap<String, Category>();
		for (String str : content) {
			Category category = getCategory(str, baseCategory);
			if (categoryMap.get(category.getCategoryName()) == null) {
				List<Category> tmpList = categoryService.findByProperies(
						"categoryName", category.getCategoryName());
				System.out.println(tmpList.get(0).getCategoryName());
				if (tmpList == null || tmpList.size() == 0) {
					categoryService.save(category);
					categoryMap.put(category.getCategoryName(), category);
				} else {
					categoryMap.put(category.getCategoryName(), tmpList.get(0));
				}
			}
		}
		System.out.println("---------------------");
		// Map<String, Stock> stockMap = new HashMap<String, Stock>();
		int count = content.size();
		int i = 0;
		for (String str : content) {
			Stock stock = getStockInfo(str);
			List<Stock> tmpList = stockService.findByProperies("stockCode",
					stock.getStockCode());
			if (tmpList == null || tmpList.size() == 0) {
				stockService.save(stock);
				System.out.println(stock.getStockCode());
			} else {
				stock = tmpList.get(0);
				if (tmpList.size() != 1) {
					System.out.println(stock.getStockCode());
				}
			}

			i++;
			if (i % 100 == 0) {
				System.out.println(i + "  " + count);
			}

			// 找一下类别
			Category category = getCategory(str, baseCategory);
			category = categoryMap.get(category.getCategoryName());
			CategoryStock cs = new CategoryStock();
			cs.setCategory(category);
			cs.setStock(stock);
			categoryStockService.save(cs);
		}
		System.out.println("------------------end");
	}

	public List<String> getContent(String filePath) {
		TextFile textFile = new TextFile(filePath);
		List<String> list = new ArrayList<String>();
		for (String text : textFile) {
			list.add(text);
		}
		return list;
	}

	public Category getCategory(String pair, BaseCategory base) {
		String[] tokens = pair.trim().split(" ");
		Category category = new Category();
		category.setCategoryCategoryType(base.getType());
		category.setCategoryName(tokens[2]);
		category.setCategoryRank(1.0d);
		return category;
	}

	public Stock getStockInfo(String pair) {
		String[] tokens = null;
		tokens = pair.trim().split(" ");
		Stock stock = new Stock();
		stock.setCreateTime(new Date());
		stock.setUpdateTime(new Date());
		stock.setStockAllCode(tokens[0]);
		stock.setStockName(tokens[1]);
		stock.setStockLocation(getLocation(tokens[0]));
		stock.setStockCode(getCode(tokens[0]));
		return stock;
	}

	public static String getLocation(String code) {
		code = code.toLowerCase();
		if (code.startsWith("sz")) {
			return StockLocation.SZX.getLocation();
		}
		return StockLocation.SHA.getLocation();
	}

	public static String getCode(String code) {
		code = code.toLowerCase();
		code = code.replace("sz", "").replace("sh", "");
		return code;
	}

	public static void main(String[] args) {
		MoreStockInfoImporter importer = new MoreStockInfoImporter();
		importer.importMetaInfo();
		// importer.importXueqiuInfo();

	}
}
