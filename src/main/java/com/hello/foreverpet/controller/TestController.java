package com.hello.foreverpet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/")
    public String test() {
        // codedeploy log 확인용
        return "Hello Foreverpet!! ";
    }
}
