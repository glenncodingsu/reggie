package com.it.reggie.common;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/24 11:28
 **/

/**
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }
}
