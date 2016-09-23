package com.lottery.ba.controller.user;

import java.text.ParseException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.domain.ParamPage;
import com.lottery.domain.province.Contellation;
import com.lottery.domain.user.UCUser;
import com.lottery.mutual.ClientMessage;
import com.lottery.mutual.EasyUIMessage;
import com.lottery.mutual.utils.DateUtil;
import com.lottery.province.service.ProvinceService;
import com.lottery.user.service.UserService;

/**
 * 用户中心
 * 
 * @author tangxiaojun
 *
 */
@RestController
public class UCMangerController {

	@Autowired
	private ProvinceService provinceService;

	@Autowired
	private UserService userService;

	@RequestMapping("/uc/save")
	public ClientMessage saveUser(UCUser user, String birth) throws ParseException {
		int birthY = DateUtil.getDateY_M_D(birth, "y");
		int birthM = DateUtil.getDateY_M_D(birth, "m");
		int birthD = DateUtil.getDateY_M_D(birth, "d");
		user.setBirthY(birthY);
		user.setBirthM(birthM);
		user.setBirthD(birthD);
		user.setState(1);
		user.setCreateAt(new Date());
		Contellation con = this.provinceService.getContellationByTime(birthM + "." + birthD);
		user.setConstellationId(con.getCode());
		this.userService.saveUser(user);
		return ClientMessage.success();
	}

	@RequestMapping("/uc/user/all")
	public EasyUIMessage getUser(ParamPage param) {
		return this.userService.getAllUser(param);
	}

	@RequestMapping("/uc/user/update")
	public ClientMessage updateUser(UCUser user, String birth) throws ParseException {
		user.setBirthY(DateUtil.getDateY_M_D(birth, "y"));
		user.setBirthM(DateUtil.getDateY_M_D(birth, "m"));
		user.setBirthD(DateUtil.getDateY_M_D(birth, "d"));
		user.setUpdateAt(new Date());
		this.userService.updateUser(user);
		return ClientMessage.success();
	}

	@RequestMapping("/uc/user/del")
	public ClientMessage delUser(Long id) {
		UCUser user = new UCUser();
		user.setId(id);
		user.setState(0);
		user.setUpdateAt(new Date());
		this.userService.updateUser(user);
		return ClientMessage.success();
	}
}
