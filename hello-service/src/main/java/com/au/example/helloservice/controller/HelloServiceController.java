package com.au.example.helloservice.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayhan.Ugurlu on 16/01/2018
 */
@RestController
public class HelloServiceController {


    @RequestMapping
    public String hello(@RequestHeader("x-location") String loc) {
        return "hello" + "from" + loc;
    }
}
