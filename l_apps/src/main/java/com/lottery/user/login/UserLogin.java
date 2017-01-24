package com.lottery.user.login;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lottery.controller.BaseController;
import com.lottery.mutual.JsonpMessage;
import com.lottery.mutual.constants.Constants;
import com.lottery.service.user.UserService;

@Controller
public class UserLogin extends BaseController {

	@Autowired
	private UserService userService;

	@Value("${wx.domain}")
	private String wxDomain;

	@ResponseBody
	@RequestMapping(value = "/wx/data")
	public Object wxUserLogin(String action, String name, String pwd, String flag, String vCode,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		String referer = request.getHeader("referer");
		String callBack = request.getParameter("callback");
		String sessionCode = (String) request.getSession().getAttribute(Constants.CHECK_CODE);
		URI uri = new URI(referer);
		if (referer == null || !uri.getHost().matches(wxDomain)) {
			map.put("state", 1);
			map.put("num", -7);
			return JsonpMessage.jsonpMsg(callBack, JSONObject.toJSONString(map));
		}
		response.setHeader("Access-Control-Allow-Origin", referer);
		response.setHeader("Access-Control-Allow-Headers", "Content-Type");
		response.setHeader("Access-Control-Allow-Methods", "GET");
		response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");
		map = this.userService.validLogin(name, pwd, flag, vCode, sessionCode);
		if (map == null) {
			map.put("state", 1);
			map.put("num", -8);
			return JsonpMessage.jsonpMsg(callBack, JSONObject.toJSONString(map));
		}
		return JsonpMessage.jsonpMsg(callBack, JSONObject.toJSONString(map));
	}
}
