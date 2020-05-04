package com.example.demo.error;

import com.example.demo.base.BaseApiService;
import com.example.demo.base.BaseResponse;
import com.example.demo.constants.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class GlobalExceptionHandler extends BaseApiService {
	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	/**
	 * 处理自定义的业务异常
	 * @param req
	 * @param e
	 * @return
	 */
    @ExceptionHandler(value = BizException.class)
	public BaseResponse bizExceptionHandler(HttpServletRequest req, BizException e){
    	logger.error("发生业务异常！原因是：{}",e.getErrorMsg());
    	return setResultError(e.getErrorCode(),e.getErrorMsg());
    }

	/**
	 * 处理404的异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = NoHandlerFoundException.class)
	public BaseResponse notFoundExceptionHandler(HttpServletRequest req, NoHandlerFoundException e){
		logger.error("找不到资源的原因:",e);
		logger.error("fjkjkfddfjk");
		return setResultError(Constants.HTTP_RES_CODE_404,Constants.HTTP_RES_CODE_404_VALUE);
	}

	/**
	 * 处理空指针的异常
	 * @param req
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value =NullPointerException.class)
	public BaseResponse exceptionHandler(HttpServletRequest req, NullPointerException e){
		logger.error("发生空指针异常！原因是:",e);
		return setResultError(Constants.HTTP_RES_CODE_400,Constants.HTTP_RES_CODE_400_VALUE);
	}

	/**
	 * 405 - Method Not Allowed
	 * 带有@ResponseStatus注解的异常类会被ResponseStatusExceptionResolver 解析
	 */
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public BaseResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
		logger.error("找不到资源的原因:",e);
		return setResultError(Constants.HTTP_RES_CODE_405,Constants.HTTP_RES_CODE_405_VALUE);
	}
    /**
        * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
	public BaseResponse exceptionHandler(HttpServletRequest req, Exception e){
    	logger.error("未知异常！原因是:",e);
       	return setResultError(Constants.HTTP_RES_CODE_500,Constants.HTTP_RES_CODE_500_VALUE);
    }
}