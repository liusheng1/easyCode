/*
package com.example.demo.error;


import com.example.demo.base.BaseResponse;
import com.example.demo.constants.Constants;
import org.omg.CORBA.portable.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ControllerAdvice
public class ExceptionHandle {

    public static final Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    private static final Map<String, String> EMPTY_DATA = new HashMap<>();

    @ResponseBody
    @ExceptionHandler(value = Exception.class) // 处理所有异常
    public BaseResponse exceptionGet(Exception e) {
        logger.error("Exception for handle ", e);
        // 自定义类，项目中用作API统一响应模板
        BaseResponse jsonView;
        if (e instanceof ApplicationException) { // 项目中用到的自定义异常
            jsonView = new BaseResponse();
            jsonView.setData(EMPTY_DATA);
            ApplicationException applicationException = (ApplicationException) e;
            jsonView.setCode(applicationException.hashCode());
            jsonView.setMsg(applicationException.getMessage());
        } else if (e instanceof ConstraintViolationException) {
            ConstraintViolationException applicationException = (ConstraintViolationException) e;
            Set<ConstraintViolation<?>> violations = applicationException.getConstraintViolations();
            StringBuilder stringBuilder = new StringBuilder();
            for (ConstraintViolation<?> item : violations) {
                stringBuilder.append("[" + item.getMessage() + "]");
            }
            String msg = stringBuilder.toString();
            logger.error("ConstraintViolation msg is : " + msg);
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_500, msg, EMPTY_DATA);
        } else if (e instanceof MethodArgumentNotValidException) {
            MethodArgumentNotValidException applicationException = (MethodArgumentNotValidException) e;
            List<ObjectError> allErrors = applicationException.getBindingResult().getAllErrors();
            StringBuilder stringBuilder = new StringBuilder();
            for (ObjectError error : allErrors) {
                stringBuilder.append("[" + error.getDefaultMessage() + "]");
            }
            String msg = stringBuilder.toString();
            logger.error("ArgumentNotValid  msg is : " + msg);
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_500, msg, EMPTY_DATA);
        } else if (e instanceof MissingServletRequestParameterException) {
            MissingServletRequestParameterException applicationException = (MissingServletRequestParameterException) e;
            String parameterName = applicationException.getParameterName();
            String parameterType = applicationException.getParameterType();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder
                    .append("parameter " + parameterName + " is null " + " , expect: " + parameterType);
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof HttpMediaTypeNotSupportedException) {
            HttpMediaTypeNotSupportedException applicationException = (HttpMediaTypeNotSupportedException) e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(applicationException.getContentType().getSubtype());
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof HttpRequestMethodNotSupportedException) {
            HttpRequestMethodNotSupportedException applicationException = (HttpRequestMethodNotSupportedException) e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(applicationException.getMethod());
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof NoHandlerFoundException) {
            NoHandlerFoundException applicationException = (NoHandlerFoundException) e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(
                    applicationException.getHttpMethod() + " --> " + applicationException.getRequestURL());
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof MethodArgumentTypeMismatchException) {
            MethodArgumentTypeMismatchException applicationException = (MethodArgumentTypeMismatchException) e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(
                    "parameter " + applicationException.getName() + " is not type of " + applicationException
                            .getRequiredType().getSimpleName());
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof HttpMessageNotReadableException) {
            HttpMessageNotReadableException applicationException = (HttpMessageNotReadableException) e;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(applicationException.getMessage());
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else if (e instanceof BindException) {
            BindException applicationException = (BindException) e;
            BindingResult bindingResult = applicationException.getBindingResult();
            FieldError fieldError = bindingResult.getFieldError();
            String field = fieldError.getField();
            // String code = fieldError.getCode();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(field);
            String msg = stringBuilder.toString();
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400, msg, EMPTY_DATA);
        } else {
            jsonView = new BaseResponse(Constants.HTTP_RES_CODE_400,null, EMPTY_DATA);
        }
        return jsonView;
    }
}
*/
