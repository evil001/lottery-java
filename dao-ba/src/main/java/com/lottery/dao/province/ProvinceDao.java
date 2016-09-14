package com.lottery.dao.province;

import java.util.List;

import com.lottery.domain.province.City;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;

public interface ProvinceDao {

	List<Province> getAllProvince();

	List<City> getAllCity();

	List<District> getAllDistrict();
}
