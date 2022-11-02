package com.it.reggie.common;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/23 17:03
 **/

/**
 * 基于ThreadLocal封装工具类，用于保存和获取当前用户登录id
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}