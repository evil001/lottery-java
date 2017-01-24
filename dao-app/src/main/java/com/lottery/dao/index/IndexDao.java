package com.lottery.dao.index;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lottery.domain.index.Banner;

@Repository
public interface IndexDao {

	List<Banner> getBanner();
}
