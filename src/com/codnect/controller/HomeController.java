package com.codnect.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

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

    @RequestMapping("/notFoundPage")
    public String showNotFoundPage(){
        return "NotFoundPage";
    }

    @RequestMapping(value = {"/settings"})
    public String showSettingsPage(){
        return "settings";
    }

}
