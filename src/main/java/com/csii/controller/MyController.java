package com.csii.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther:niulipeng
 * @Date:2021/1/10
 * @Description:com.csii.controller
 * @Version:1.0
 */
@RestController
public class MyController {
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
