package com.baeldung.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping("new/login")
    public String login(){
        return "login";
    }
}
