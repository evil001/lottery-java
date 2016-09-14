package com.lottery.province.service;

import java.util.List;

import com.lottery.domain.province.City;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;

public interface ProvinceService {

	List<Province> getAllProvince();

	List<City> getAllCity();

	List<District> getAllDistrict();
}
