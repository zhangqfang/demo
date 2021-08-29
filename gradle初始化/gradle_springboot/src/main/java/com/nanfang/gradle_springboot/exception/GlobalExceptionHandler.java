package com.nanfang.gradle_springboot.exception;

import com.nanfang.gradle_springboot.pojo.Result;
import com.nanfang.gradle_springboot.pojo.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类,SpringMVC提供的统一异常拦截器GlobalExceptionHandler来拦截异常
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     * 处理业务异常
     */
    @ExceptionHandler(value = PowerException.class)
    public Result handlePowerException(PowerException e) {
        return Result.errorMessage(e.getMessage(), e.getSatus(), null);
    }

    /**
     * 处理系统异常
     */
    @ExceptionHandler(value = Exception.class)
    public Result handleExpetion(Exception e){
        return Result.errorMessage(e.getMessage(), StatusCode.FAILURE.code(),null);
    }
}
