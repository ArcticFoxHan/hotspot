package com.fox.hotspot.lib;

import java.util.LinkedHashMap;
import java.util.Map;

public class Utils {

	public static Map<String, Object> getResultMap(int retCode, String retMsg) {
		Map<String, Object> attributes = new LinkedHashMap<String, Object>();
		attributes.put("ret_code", retCode);
		attributes.put("ret_msg", retMsg);
		return attributes;
	}

	public static Map<String, Object> getResultMap(int retCode, String retMsg,
			Object result) {
		Map<String, Object> attributes = new LinkedHashMap<String, Object>();
		attributes.put("ret_code", retCode);
		attributes.put("ret_msg", retMsg);
		attributes.put("result", result);
		return attributes;
	}
}
