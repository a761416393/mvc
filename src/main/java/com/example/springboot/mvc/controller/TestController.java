package com.example.springboot.mvc.controller;

import com.example.springboot.mvc.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/aspectj")
    public void testAspectJ(){
        testService.testService();
    }
}
