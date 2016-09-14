package com.lottery.dao.user;

import com.lottery.domain.user.UCUser;

public interface UserDao {

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	void save(UCUser user);
}
