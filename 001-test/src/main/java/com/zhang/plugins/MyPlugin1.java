package com.zhang.plugins;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;

import java.sql.Statement;
import java.util.Properties;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.plugins
 * @date:2020/12/28
 */
@Intercepts({
        @Signature(type = StatementHandler.class,method = "parameterize",args = Statement.class )
})
public class MyPlugin1 implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object proceed = invocation.proceed();

        return proceed;
    }

    @Override
    public Object plugin(Object o) {
        //四大对象都会去掉的方法
        //返回为当前target创建的动态代理
        Object wrap = Plugin.wrap(o, this);
        return wrap;
    }

    @Override
    public void setProperties(Properties properties) {

        System.out.println("插件参数："+properties);
    }
}
