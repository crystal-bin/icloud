package com.icloud.stock.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/stock")
public class StockController {
	@RequestMapping("/stockMenu")
	// @ResponseBody
	// @RequestParam(required=true) String hotelId
	public ModelAndView stockMenu() {
		ModelAndView model = new ModelAndView("stock/stockMenu");
		// model.addObject("roomCatList", lvRoomCats);
		// model.addObject("bookingClassMap", lvBookingClassMap);
		// model.addObject("breakfastComp",BreakfastEnum.values());
		// model.addObject("dateListMap", lvDateWeekMap);
		// model.setViewName();
		return model;
	}

	@RequestMapping("/stockListMenu")
	public ModelAndView stockListMenu() {
		ModelAndView model = new ModelAndView("stock/stockList");
		return model;
	}

	@RequestMapping("/getStockMenu")
	@ResponseBody
	public String getStockMenu(String id) {
		System.out.println(id);
		return "你好1111 " + id;
	}

}
