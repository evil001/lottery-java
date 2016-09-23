package com.lottery.user.service;

import com.lottery.domain.ParamPage;
import com.lottery.domain.user.UCUser;
import com.lottery.mutual.EasyUIMessage;

public interface UserService {

	void saveUser(UCUser user);

	EasyUIMessage getAllUser(ParamPage param);

	void updateUser(UCUser user);
}
