package com.lottery.ba.controller.banner;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.ParamPage;
import com.lottery.domain.banner.BannerInfo;
import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.mutual.utils.DateUtil;
import com.lottery.product.service.BannerService;

@RestController
public class BannerController {

	@Autowired
	private BannerService bannerService;

	@RequestMapping("/cms/banner")
	public EasyUIMessage getBannerList(ParamPage param) {
		return this.bannerService.getBannerList(param);
	}

	@RequestMapping("/cms/banner/save")
	public ClientMessage saveBanner(String title, String url, Integer type, String imgUrl, String startTime,
			String endTime, Integer imgHeight, Integer imgWidth) throws ParseException {
		BannerInfo banner = new BannerInfo();
		banner.setTitle(title);
		banner.setUrl(url);
		banner.setStartTime(DateUtil.parseFull(startTime));
		banner.setEndTime(DateUtil.parseFull(endTime));
		banner.setType(type);
		banner.setImgUrl(imgUrl);
		banner.setImgWidth(imgWidth);
		banner.setImgHeight(imgHeight);
		this.bannerService.saveBanner(banner);
		return ClientMessage.success();
	}

	@RequestMapping("/cms/banner/del")
	public ClientMessage delBanner(Long id) {
		this.bannerService.deleteBanner(id);
		return ClientMessage.success();
	}

	@RequestMapping("/cms/banner/modify")
	public ClientMessage modify(Long id, Integer state, String title, String url, Integer type, String startTime,
			String endTime, Integer imgWidth, Integer imgHeight, String imgUrl) throws ParseException {
		BannerInfo banner = new BannerInfo();
		banner.setId(id);
		banner.setState(state);
		banner.setTitle(title);
		banner.setUrl(url);
		banner.setType(type);
		banner.setStartTime(DateUtil.parseFull(startTime));
		banner.setEndTime(DateUtil.parseFull(endTime));
		banner.setImgHeight(imgHeight);
		banner.setImgWidth(imgWidth);
		banner.setImgUrl(imgUrl);
		this.bannerService.update(banner);
		return ClientMessage.success();
	}
}
