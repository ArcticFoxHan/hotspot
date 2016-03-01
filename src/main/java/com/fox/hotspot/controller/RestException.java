package com.fox.hotspot.controller;

import com.fox.hotspot.common.Common;

public class RestException extends RuntimeException {

	private static final long serialVersionUID = 4527194189352290581L;
	private int retCode = Common.RET_CODE_SYSTEM_ERR;

	public RestException() {
	}

	public RestException(String message) {
		super(message);
	}

	public RestException(int retCode, String message) {
		super(message);
		this.retCode = retCode;
	}

	public int getRetCode() {
		return retCode;
	}

	public void setRetCode(int retCode) {
		this.retCode = retCode;
	}
}
