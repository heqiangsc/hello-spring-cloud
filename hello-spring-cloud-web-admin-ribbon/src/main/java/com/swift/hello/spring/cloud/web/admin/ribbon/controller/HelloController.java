package com.swift.hello.spring.cloud.web.admin.ribbon.controller;

import com.swift.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client/hello")
public class HelloController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/say")
    public String hello(String name) {
        return adminService.say(name);
    }
}
