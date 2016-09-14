package com.lottery.api.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.mutual.verifycode.VerifyCodeUtils;

@RestController
@RequestMapping("/api")
public class ApiController {

	@RequestMapping("/checkCode/{w}/{h}/{rd}")
	public void getCaptcha(@PathVariable("w") String width, @PathVariable("h") String height,
			@PathVariable("rd") String rd, HttpServletRequest req, HttpServletResponse res)
			throws NumberFormatException, IOException {
		res.setHeader("Pragma", "No-cache");
		res.setHeader("Cache-Control", "no-cache");
		res.setHeader("Expires", "0");
		res.setContentType("image/jpeg");

		String verifyCode = VerifyCodeUtils.generateVerifyCode(Integer.parseInt(rd));
		req.getSession().setAttribute("checkCode", verifyCode.toLowerCase());
		VerifyCodeUtils.outputImage(Integer.parseInt(width), Integer.parseInt(height), res.getOutputStream(),
				verifyCode);
	}
}
