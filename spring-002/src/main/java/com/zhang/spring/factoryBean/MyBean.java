package com.zhang.spring.factoryBean;

import com.zhang.spring.Cus;
import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Cus> {
    @Override
    public Cus getObject() throws Exception {
        Class<?> aClass = Class.forName("com.zhang.spring.Cus");
        Cus o = (Cus) aClass.newInstance();
         o.setCname("hahah");
        return o;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
