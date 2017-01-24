package com.lottery.site.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lottery.controller.BaseController;

@Controller
public class IndexController extends BaseController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getIndex() {
		return "index/index";
	}
}
