package com.example.demo.error;

import org.springframework.stereotype.Component;

@Component
public interface BaseErrorInfoInterface {
    /** 错误码*/
	String getResultCode();
	
	/** 错误描述*/
	 String getResultMsg();
}