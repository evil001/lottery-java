package com.lottery.province.service;

import java.util.List;

import com.lottery.domain.province.City;
import com.lottery.domain.province.Contellation;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;

public interface ProvinceService {

	List<Province> getAllProvince();

	List<City> getAllCityByProvinceId(Long provinceId);

	List<City> getAllCity();

	List<District> getAllDistrictByCityId(Long cityId);

	List<District> getAllDistrict();

	List<Contellation> getAllContellation();

	Contellation getContellationByTime(String time);

	City getCityById(Long id);

	District getDistrictById(Long id);
}
