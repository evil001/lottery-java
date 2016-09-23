package com.lottery.ba.controller.province;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.province.City;
import com.lottery.domain.province.Contellation;
import com.lottery.domain.province.District;
import com.lottery.domain.province.Province;
import com.lottery.mutual.ClientMessage;
import com.lottery.province.service.ProvinceService;

@RestController
public class ProvinceController {

	@Autowired
	private ProvinceService provinceService;

	@RequestMapping("/province/all")
	public ClientMessage getAllProvince() {
		return ClientMessage.success(this.provinceService.getAllProvince());
	}

	@RequestMapping("/province/all/format")
	public List<Map<String, Object>> getFormatProvince() {
		List<Province> list = this.provinceService.getAllProvince();
		List<Map<String, Object>> listMap = new ArrayList<Map<String, Object>>();
		list.forEach(p -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", p.getId());
			map.put("provinceName", p.getProvinceName());
			listMap.add(map);
		});
		return listMap;
	}

	@RequestMapping("/city/{pId}")
	public ClientMessage getCityByProvinceId(@PathVariable(value = "pId") Long pId) {
		return ClientMessage.success(this.provinceService.getAllCityByProvinceId(pId));
	}

	@RequestMapping("/city/{pId}/format")
	public List<Map<String, Object>> getCityByProvinceIdFormat(@PathVariable("pId") Long pId) {
		List<City> cityList = this.provinceService.getAllCityByProvinceId(pId);
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		cityList.forEach(c -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", c.getId());
			map.put("cityName", c.getCityName());
			list.add(map);
		});
		return list;
	}

	@RequestMapping("/city/id/{id}")
	public ClientMessage getCityById(@PathVariable("id") Long id) {
		return ClientMessage.success(this.provinceService.getCityById(id));
	}

	@RequestMapping("/city/all")
	public ClientMessage getAllCity() {
		return ClientMessage.success(this.provinceService.getAllCity());
	}

	@RequestMapping("/city/all/format")
	public List<Map<String, Object>> getAllCityFormat() {
		List<City> cityList = this.provinceService.getAllCity();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		cityList.forEach(c -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", c.getId());
			map.put("cityName", c.getCityName());
			list.add(map);
		});
		return list;
	}

	@RequestMapping("/district/all")
	public ClientMessage getAllDistrict() {
		return ClientMessage.success(this.provinceService.getAllDistrict());
	}

	@RequestMapping("/district/all/format")
	public List<Map<String, Object>> getAllDistrictFormat() {
		List<District> districtList = this.provinceService.getAllDistrict();
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		districtList.forEach(d -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", d.getId());
			map.put("districtName", d.getDistrictName());
			resultList.add(map);
		});
		return resultList;
	}

	@RequestMapping("/district/id/{id}")
	public ClientMessage getDistrictById(@PathVariable("id") Long id) {
		return ClientMessage.success(this.provinceService.getDistrictById(id));
	}

	@RequestMapping("/district/{cId}")
	public ClientMessage getDistrictByCityId(@PathVariable(value = "cId") Long cId) {
		return ClientMessage.success(this.provinceService.getAllDistrictByCityId(cId));
	}

	@RequestMapping("/district/{cId}/format")
	public List<Map<String, Object>> getDistrictByCityIdFormat(@PathVariable("cId") Long cId) {
		List<District> districtList = this.provinceService.getAllDistrictByCityId(cId);
		List<Map<String, Object>> resultList = new ArrayList<Map<String, Object>>();
		districtList.forEach(d -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("id", d.getId());
			map.put("districtName", d.getDistrictName());
			resultList.add(map);
		});
		return resultList;
	}

	@RequestMapping("/contellation/all")
	public ClientMessage getAllContellation() {
		return ClientMessage.success(this.provinceService.getAllContellation());
	}

	@RequestMapping("/contellation/all/format")
	public List<Map<String, Object>> getAllContellationFormat() {
		List<Contellation> conList = this.provinceService.getAllContellation();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		conList.forEach(c -> {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("code", c.getCode());
			map.put("contellationName", c.getContellationName());
			list.add(map);
		});
		return list;
	}
}
