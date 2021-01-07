package com.zhang.dao.impl;

import com.zhang.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.dao.impl
 * @date:2021/1/7
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void transferByZs(Integer zs) {
        //zs账户减少100
        String sql="update Account set money=money-? where name='zs'";
        jdbcTemplate.update(sql,zs);
    }

    @Override
    public void transferByLs(Integer zs) {
        //ls账户增加100
        String sql="update Account set money=money+? where name='ls'";
        jdbcTemplate.update(sql,zs);
    }
}
