package com.lottery.province.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.province.ProvinceDao;
import com.lottery.domain.province.City;
import com.lottery.domain.province.Contellation;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;
import com.lottery.province.service.ProvinceService;

@Service
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

	@Override
	public List<City> getAllCityByProvinceId(Long provinceId) {
		return this.provinceDao.getAllCityByProvinceId(provinceId);
	}

	@Override
	public List<District> getAllDistrictByCityId(Long cityId) {
		return this.provinceDao.getAllDistrictByCityId(cityId);
	}

	@Override
	public List<Contellation> getAllContellation() {
		return this.provinceDao.getAllContellation();
	}

	@Override
	public Contellation getContellationByTime(String time) {
		return this.provinceDao.getContellationByTime(time);
	}

	@Override
	public City getCityById(Long id) {
		return this.provinceDao.getCityById(id);
	}

	@Override
	public District getDistrictById(Long id) {
		return this.provinceDao.getDistrictById(id);
	}

}
