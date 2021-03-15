package com.zhang.mvc.pojo;

/**
 * @author: create by zhl
 * @version: v1.0
 * @description: com.zhang.mvc.pojo
 * @date:2021/1/15
 */
public class Adress {
    private String city;
    private String province;


    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
