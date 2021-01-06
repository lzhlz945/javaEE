package com.zhang.spring.service.impl;

import com.zhang.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.spring.service.impl
 * @date:2021/1/6
 */
@Service(value = "userServiceImpl1")
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("实现类的add....");
    }
}
