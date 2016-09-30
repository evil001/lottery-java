package com.lottery.dao.user;

import org.springframework.stereotype.Repository;

import com.lottery.domain.user.UCUser;

@Repository
public interface UserDao {

	UCUser getUserInfo(String email);
}
