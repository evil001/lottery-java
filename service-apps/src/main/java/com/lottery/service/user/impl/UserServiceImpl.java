package com.lottery.service.user.impl;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.lottery.dao.user.UserDao;
import com.lottery.domain.user.UCUser;
import com.lottery.mutual.utils.EncryptUtil;
import com.lottery.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	private int flag = 0;

	@Value("${wx.private.key}")
	private String privateKey;

	@Override
	public Map<String, Object> validLogin(String name, String pwd, String flag, String vCode, String sessionCode)
			throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println(privateKey);
		UCUser user = this.userDao.getUserInfo(name);
		if (user == null) {
			map.put("state", 1);
			map.put("num", -2);
			return map;
		}
		System.out.println(EncryptUtil.MD5(pwd).toLowerCase());
		if (!user.getPass().equals(EncryptUtil.MD5(pwd).toLowerCase())) {
			map.put("state", 1);
			map.put("num", -1);
			this.flag = this.flag + 1;
			if (this.flag > 1) {
				map.put("str", "1");
			}
			return map;
		}

		if (this.flag == 1 && !vCode.equals(sessionCode)) {
			map.put("state", 1);
			map.put("num", -6);
			return map;
		}
		map.put("state", 0);
		map.put("num", 1);
		map.put("mb", user.getMobilePhone());
		map.put("sign", EncryptUtil.sign(user.getMobilePhone().getBytes("UTF-8"), privateKey));
		return map;
	}

	public static void main(String[] args) throws UnsupportedEncodingException, Exception {
		String mb = "13000000000";
		String pk = "MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAIWz4JK7Cz4Hass99zXxOSIDiJXq3UGd/WwUp9DVyVkJ8caK9vfkdT4pABMJYRPclrrvFXRY7EkTDGiCKV3C5p+TACt3mQctFIAiiboWp5OQXmtKFUsHojBBjVgkbfZWPgp3ocPW2ByzBlXdhu6U1qKvdPDJ2sdybrByVwWBqxVJAgMBAAECgYAePIisBjrLo1fGcNQIUe4uwAfSh5PT9AvMtnshIkfvp+0Sjni9pN/S1+jZZUSb/kXkLo92iWmeOP2UYOND/gCzf8r+42satVMVL1URAFJVdO/Ktpp0U747Dr9x1QMvBf6f3l8eiAUYgKmDV4IyY4aA8ayNervDXAR0wHvWm6Y+FQJBAMlkJusOZtFixhOsPtSW2iT85mGj44xBC3smj4oRCIbM0UPpYW4Z5dLPOwpuuAN3e5Ueb3dbqH3f4sv5vvWf2vMCQQCp9QerEAoK/9fClY1EUoC+JdkFBsw7EDCFV++u869q/WT9Fi1lhPsHoakZpQXPw0rR5480Ysq8qpCOmqTqyaXTAkEAlgL9HmAW5Gcv5l2KW66WhbDAJwD+MW4OEEiz6QMxF8AfLPf9tBakY7grYWUBustYicYm/4CN7F1FweyherL9UwJAKb/iYVgwT2FnvAoGyMjHjW44sG5qDvw8HxVp8H02Ez8p5q3i+vQ+wjIpGv6Zvd7Ia2XJnOHD0bLIje9ZIb/lNwJBAMZMRe4TteUMbvr6/WeOuMV5naPE6+ns8e3UpkAtXE1hzomCVYtbm3KfUZrmoBHN96987oTsvYvuQgFJ0eD2QsA=";
		System.out.println(EncryptUtil.sign(mb.getBytes("UTF-8"), pk));
	}
}
