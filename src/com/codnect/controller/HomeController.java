package com.codnect.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Burak Köken on 14.7.2017.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @RequestMapping("/register")
    public String showRegisterPage(){
        return "register";
    }

    @RequestMapping("/welcome")
    public String showWelcomePage(){
        return "welcome";
    }
}
