package com.example.demo.base;

import lombok.Data;


@Data
public class BaseResponse<T> {

	/**
	 * 返回码
	 */
	private String code;
	/**
	 * 消息
	 */
	private String msg;
	
	/**
	 * 返回
	 */
	private T data;
	// 分页

	public BaseResponse() {

	}
	public BaseResponse(String msg) {
		super();
		this.msg = msg;
	}

	public BaseResponse(String code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

}
