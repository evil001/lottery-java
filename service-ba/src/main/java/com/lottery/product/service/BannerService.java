package com.lottery.product.service;

import com.lottery.domain.ParamPage;
import com.lottery.mutual.EasyUIMessage;

public interface BannerService {

	EasyUIMessage getBannerList(ParamPage param);
}
