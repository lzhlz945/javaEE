package com.zhang.spring.autowire;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value ="dept")
@Data
public class Dept {
    @Value("zs")
    private String name;
    @Value("18")
    private Integer age;
}
