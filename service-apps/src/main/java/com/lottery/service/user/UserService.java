package com.lottery.service.user;

import java.util.Map;

public interface UserService {

	Map<String, Object> validLogin(String name, String pwd, String flag, String vCode, String sessionCode)
			throws Exception;
}
