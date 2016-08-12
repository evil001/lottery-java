package com.lottery.ba.controller.banner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.ParamPage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.BannerService;

@RestController
public class BannerController {

	@Autowired
	private BannerService bannerService;

	@RequestMapping("/cms/banner")
	public EasyUIMessage getBannerList(ParamPage param) {
		return this.bannerService.getBannerList(param);
	}
}
