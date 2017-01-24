package com.lottery.service.index.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.index.IndexDao;
import com.lottery.domain.index.Banner;
import com.lottery.service.index.IndexService;

@Service
public class IndexServiceImpl implements IndexService {

	@Autowired
	private IndexDao indexDao;

	@Override
	public List<Banner> getBanner() {
		return this.indexDao.getBanner();
	}

}
