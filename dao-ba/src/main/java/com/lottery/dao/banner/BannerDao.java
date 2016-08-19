package com.lottery.dao.banner;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lottery.domain.banner.BannerInfo;

@Repository
public interface BannerDao {

	List<BannerInfo> getBannerList();

	void saveBanner(BannerInfo banner);

	void updateBanner(BannerInfo banner);
}
