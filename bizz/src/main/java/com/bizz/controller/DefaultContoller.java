package com.bizz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultContoller {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
