package com.zhang.tx.service.impl;

import com.zhang.tx.dao.AccountDao;
import com.zhang.tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.tx.service.impl
 * @date:2021/1/7
 */
@Service

public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;
    //转账业务
   /* @Transactional(propagation = Propagation.REQUIRED,
                   isolation = Isolation.REPEATABLE_READ,
                   rollbackFor = {Exception.class}
                   )*/
    @Override
    public void transfer() {
        //zs转给ls 100

        //zs账户减少100

            Integer zs=100;
            accountDao.transferByZs(zs);

            int a=10/0;
            //ls账户增加100
            accountDao.transferByLs(zs);


    }
}
