package com.lottery.ba.controller.module;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/module")
public class ModuleController {

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String addProduct() {
		return "module/main_add_pro";
	}
}
