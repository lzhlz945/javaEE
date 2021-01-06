package com.zhang.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.aop.config
 * @date:2021/1/6
 */
@Configuration
@ComponentScan(value = {"com.zhang.aop"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AspectJConfig {
}
