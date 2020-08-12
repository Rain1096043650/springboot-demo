package com.demo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class HelloService {

    @Value("${druids.username}")
    private String name;

    public void test(){
        System.out.println(name);
    }
}
