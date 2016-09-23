package com.lottery.dao.province;

import java.util.List;

import com.lottery.domain.province.City;
import com.lottery.domain.province.Contellation;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;

public interface ProvinceDao {

	List<Province> getAllProvince();

	List<City> getAllCityByProvinceId(Long pId);

	City getCityById(Long id);

	List<City> getAllCity();

	List<District> getAllDistrictByCityId(Long cId);

	District getDistrictById(Long id);

	List<District> getAllDistrict();

	List<Contellation> getAllContellation();

	/**
	 * 通过时间匹配对应的时间
	 * 
	 * @param time
	 * @return
	 */
	Contellation getContellationByTime(String time);
}
