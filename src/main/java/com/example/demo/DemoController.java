package com.example.demo;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;

@Controller
public class DemoController {
    @Mapping("/hello")
    public String hello(@Param(defaultValue = "world") String name) {
        return String.format("Hello %s!", name);
    }


    @Mapping("/")
    public String hi(){
        return "hi，可以访问{ip}:{port}/hello?name=qwer";
    }

    @Mapping("/err")
    public Integer err(@Param String name){
        Integer len = name.length();
        String s = null;
        if(len>5){
            s = "1234";
        }
        return s.length();
    }

}