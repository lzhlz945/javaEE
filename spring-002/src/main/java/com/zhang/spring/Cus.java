package com.zhang.spring;

import lombok.Data;

//@Data
public class Cus {
    private String cname;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
