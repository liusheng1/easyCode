package com.example.demo.constants;

public interface Constants {
	// 响应请求成功code
	String HTTP_RES_CODE_200_VALUE = "success";
	// 系统错误
	String HTTP_RES_CODE_400_VALUE = "请求的数据格式不符";
	String HTTP_RES_CODE_403_VALUE = "权限不足";
	String HTTP_RES_CODE_401_VALUE = "请求的数字签名不匹配!";
	String HTTP_RES_CODE_404_VALUE = "未找到该资源";
	String HTTP_RES_CODE_500_VALUE = "服务器内部错误!";
	String HTTP_RES_CODE_503_VALUE = "服务器正忙，请稍后再试!";
	// 响应请求成功code
	String HTTP_RES_CODE_200 = "200";
	// 系统错误
	String HTTP_RES_CODE_400 = "400";
	String HTTP_RES_CODE_403 = "403";
	String HTTP_RES_CODE_401 = "401";
	String HTTP_RES_CODE_404 = "404";
	String HTTP_RES_CODE_503 = "503";
	String HTTP_RES_CODE_500 = "500";
	// 未关联QQ账号
	String HTTP_RES_CODE_201 = "201";
	// 发送邮件
	String MSG_EMAIL = "email";
	// 会员token
	String TOKEN_MEMBER = "TOKEN_MEMBER";
	// 用户有效期 90天
	Long TOKEN_MEMBER_TIME = (long) (60 * 60 * 24 * 90);
	int COOKIE_TOKEN_MEMBER_TIME = (60 * 60 * 24 * 90);
	// cookie 会员 totoken 名称
	String COOKIE_MEMBER_TOKEN = "cookie_member_token";
	// 微信注册码存放rediskey
	String WEIXINCODE_KEY = "weixin.code";
	// 微信注册码有效期30分钟
	Long WEIXINCODE_TIMEOUT = 1800L;

	// 用户信息不存在
	Integer HTTP_RES_CODE_EXISTMOBILE_203 = 203;

	// token
	String MEMBER_TOKEN_KEYPREFIX = "ls.shop.login";

	// 安卓的登陆类型
	String MEMBER_LOGIN_TYPE_ANDROID = "Android";
	// IOS的登陆类型
	String MEMBER_LOGIN_TYPE_IOS = "IOS";

	// PC的登陆类型
	String MEMBER_LOGIN_TYPE_PC = "PC";

	// 登陆超时时间 有效期 90天
	Long MEMBRE_LOGIN_TOKEN_TIME = 77776000L;
	// 用户信息不存在
	Integer HTTP_RES_CODE_NOTUSER_203 = 203;

    String HTTP_RES_CODE_405 = "405";
	String HTTP_RES_CODE_405_VALUE ="Method Not Allowed" ;
}
