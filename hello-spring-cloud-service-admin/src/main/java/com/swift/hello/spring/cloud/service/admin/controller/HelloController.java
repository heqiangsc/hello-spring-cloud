package com.swift.hello.spring.cloud.service.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping("/say")
    public String say(String name) {
        return "hello, " + name;
    }
}
