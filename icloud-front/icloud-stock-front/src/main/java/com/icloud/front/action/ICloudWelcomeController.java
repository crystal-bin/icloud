package com.icloud.front.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ICloudWelcomeController {
	@RequestMapping("/index")
	public String helloWorld() {
		/**
		 * 入口
		 */
		return "forward:/stock/stockMenu";
	}
}
