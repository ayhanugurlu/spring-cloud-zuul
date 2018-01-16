package com.au.example.goodbyeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ayhan.Ugurlu on 16/01/2018
 */
@RestController
public class GoodByeController {


    @RequestMapping()
    public String hello(){
        return  "hello";
    }
}
