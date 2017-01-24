package com.lottery.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseController {

	/**
	 * 查询所有cookie信息
	 * 
	 * @param req
	 * @param res
	 */
	public void showCookies(HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		if (null != cookies) {
			for (Cookie cookie : cookies) {
				System.out.println("name:" + cookie.getName() + ",value:" + cookie.getValue());
			}
		}
	}

	/**
	 * 通过KEY获取cookie信息
	 * 
	 * @param key
	 * @param req
	 * @param res
	 * @return
	 */
	public String getCookie(String key, HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(key)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * 通过前缀获取cookie信息
	 * 
	 * @param key
	 * @param req
	 * @param res
	 * @return
	 */
	public String getCookiePrefix(String key, HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().startsWith(key)) {
					return cookie.getValue();
				}
			}
		}
		return null;
	}

	/**
	 * 获取cookie的key
	 * 
	 * @param key
	 * @param req
	 * @param res
	 * @return
	 */
	public String getCookieKey(String key, HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().startsWith(key)) {
					return cookie.getName();
				}
			}
		}
		return null;
	}

	/**
	 * cookie添加
	 * 
	 * @param res
	 * @param name
	 * @param value
	 */
	public void addCookie(HttpServletResponse res, String name, String value) {
		Cookie cookie = new Cookie(name.trim(), value.trim());
		cookie.setMaxAge(60 * 60 * 24 * 7);
		cookie.setPath("/");
		cookie.setDomain("yyyg.com");
		res.addCookie(cookie);
	}

	/**
	 * 编辑cookie
	 * 
	 * @param req
	 * @param res
	 * @param name
	 * @param value
	 */
	public void editCookie(HttpServletRequest req, HttpServletResponse res, String name, String value) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(name)) {
					cookie.setValue(value);
					cookie.setDomain("yyyg.com");
					cookie.setPath("/");
					cookie.setMaxAge(60 * 60 * 24 * 7);
					res.addCookie(cookie);
					break;
				}
			}
		}
	}

	/**
	 * 删除cookie
	 * 
	 * @param key
	 * @param req
	 * @param res
	 */
	public void delCookie(String key, HttpServletRequest req, HttpServletResponse res) {
		Cookie[] cookies = req.getCookies();
		if (cookies != null) {
			for (Cookie cookie : cookies) {
				if (cookie.getName().equals(key)) {
					cookie.setValue(null);
					cookie.setMaxAge(0);
					cookie.setPath("/");
					cookie.setDomain("yyyg.com");
					res.addCookie(cookie);
					break;
				}
			}
		}
	}
}
