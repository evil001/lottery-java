package com.lottery.mutual;

public class JsonpMessage {

	public static String jsonpMsg(String call, String str) {
		System.out.println(call.concat("(").concat(str).concat(")"));
		return call.concat("(").concat(str).concat(")");
	}
}
