package com.zhang.tx.dao;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.tx.dao
 * @date:2021/1/7
 */
public interface AccountDao {
    void transferByZs(Integer zs);

    void transferByLs(Integer zs);
}
