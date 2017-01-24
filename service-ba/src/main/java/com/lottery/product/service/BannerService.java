package com.lottery.product.service;

import com.lottery.domain.ParamPage;
import com.lottery.domain.banner.BannerInfo;
import com.lottery.mutual.EasyUIMessage;

public interface BannerService {

	EasyUIMessage getBannerList(ParamPage param);

	void update(BannerInfo banner);

	void saveBanner(BannerInfo banner);

	void deleteBanner(Long id);
}
