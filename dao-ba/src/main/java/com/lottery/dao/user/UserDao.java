package com.lottery.dao.user;

import java.util.List;

import com.lottery.domain.user.UCUser;

public interface UserDao {

	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	void save(UCUser user);

	/**
	 * 查询所有用户
	 * 
	 * @return
	 */
	List<UCUser> getAllUser();

	/**
	 * 更新
	 * 
	 * @param user
	 */
	void update(UCUser user);
}
