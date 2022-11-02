package com.it.test;

import org.junit.jupiter.api.Test;

/**
 * @Description:
 * @Author: gw
 * @Date: 2022/10/27 11:56
 **/
public class UploadFileTest {
    @Test
    public void test1() {
        String fileName = "63467jip.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
