package com.lottery.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lottery.dao.user.UserDao;
import com.lottery.domain.ParamPage;
import com.lottery.domain.user.UCUser;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void saveUser(UCUser user) {
		this.userDao.save(user);
	}

	@Override
	public EasyUIMessage getAllUser(ParamPage param) {
		PageHelper.startPage(param.getPage(), param.getRows());
		PageHelper.orderBy(param.getSort().concat(" ").concat(param.getOrder()));
		List<UCUser> userList = this.userDao.getAllUser();
		PageInfo<UCUser> pageInfo = new PageInfo<UCUser>(userList);
		return EasyUIMessage.easyJson(pageInfo.getTotal(), userList);
	}

	@Override
	public void updateUser(UCUser user) {
		this.userDao.update(user);
	}

}
