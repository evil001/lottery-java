package com.lottery.dao.atten;

import org.springframework.stereotype.Repository;

import com.lottery.domain.atten.Attention;

@Repository
public interface AttentionDao {

	void saveAtten(Attention atten);
}
