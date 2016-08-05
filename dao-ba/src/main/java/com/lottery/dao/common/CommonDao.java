package com.lottery.dao.common;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonDao<T> {

	Integer getObject(@Param("tbName") String tbName);
}
