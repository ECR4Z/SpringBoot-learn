package com.example.sb01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ECRZ
 * Data:2021-12
 * @Description:
 */
@RestController
public class MyController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello SpringBoot!";
    }
}
