package com.example.demo.Models;

import org.springframework.stereotype.Component;

@Component

public class BusinessService {
     

    public HelloWorld getHelloWorld() {
        HelloWorld hd = new HelloWorld();
        return hd;
    }

}
