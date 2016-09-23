package com.lottery.user.login;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserLogin {

	@RequestMapping("/wx/passport/userLogin")
	public Map<String, Object> wxUserLogin() {

	}
}
