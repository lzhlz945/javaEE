package com.zhang.log42;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.log42
 * @date:2021/1/7
 */
public class LogTest {
    private static final Logger log=LoggerFactory.getLogger(LogTest.class);

    public static void main(String[] args) {
        log.info("1111111");
        log.warn("1231111");
    }
}
