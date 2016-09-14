package com.lottery.province.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lottery.dao.province.ProvinceDao;
import com.lottery.domain.province.City;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;
import com.lottery.province.service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {

	@Autowired
	private ProvinceDao provinceDao;

	@Override
	public List<Province> getAllProvince() {
		return this.provinceDao.getAllProvince();
	}

	@Override
	public List<City> getAllCity() {
		return this.provinceDao.getAllCity();
	}

	@Override
	public List<District> getAllDistrict() {
		return this.provinceDao.getAllDistrict();
	}

}
