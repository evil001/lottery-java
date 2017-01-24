package com.lottery.service.atten.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.dao.atten.AttentionDao;
import com.lottery.domain.atten.Attention;
import com.lottery.service.atten.AttenService;

@Service
public class AttenServiceImpl implements AttenService {

	@Autowired
	private AttentionDao attentionDao;

	@Override
	public void saveAtten(Attention atten) {
		atten.setState(1);
		atten.setCreateAt(new Date());
		this.attentionDao.saveAtten(atten);
	}

}
