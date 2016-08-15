package com.lottery.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lottery.dao.banner.BannerDao;
import com.lottery.domain.ParamPage;
import com.lottery.domain.banner.BannerInfo;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.product.service.BannerService;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerDao bannerDao;

	@Override
	public EasyUIMessage getBannerList(ParamPage param) {
		PageHelper.startPage(param.getPage(), param.getRows());
		PageHelper.orderBy(param.getSort().concat(" ").concat(param.getOrder()));
		List<BannerInfo> list = this.bannerDao.getBannerList();
		PageInfo<BannerInfo> page = new PageInfo<BannerInfo>();
		return EasyUIMessage.easyJson(page.getTotal(), list);
	}

	@Override
	public void saveBanner(BannerInfo banner) {
		this.bannerDao.saveBanner(banner);
	}

}
