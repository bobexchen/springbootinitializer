package com.bobexchen.novajavagithub.controller;

import com.bobexchen.novajavagithub.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private HelloService helloService = null;

    @GetMapping("/get/hello")
    public String getHellos() {
        return helloService.getHellos();
    }
}
