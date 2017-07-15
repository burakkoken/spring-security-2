package com.codnect.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Burak Köken on 14.7.2017.
 */
@Controller
public class HomeController {

    private static final Logger logger = Logger.getLogger(HomeController.class);

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

    @RequestMapping("/settings")
    public String showSettingsPage(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentUserName = authentication.getName();

        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        Set<GrantedAuthority> authorityList = (Set<GrantedAuthority>) userDetails.getAuthorities();
        for(Object authority : authorityList){
            logger.info("authority : " + authority);
        }

        return "settings";
    }

    @RequestMapping("/profile")
    public String showProfilePage(){

        return "profile";
    }

    @RequestMapping("/pageList")
    public String showPageListPage(@RequestParam(defaultValue = "0") String page, ModelMap modelMap){
        List list = new ArrayList();
        list.add("item 1");
        list.add("item 2");
        list.add("item 3");
        list.add("item 4");
        list.add("item 5");
        list.add("item 6");
        list.add("item 7");
        list.add("item 8");


        int pageNumber = 1;
        try {
            pageNumber = Integer.parseInt(page);
        }
        catch (Exception e){

        }


        PagedListHolder pagedListHolder = new PagedListHolder(list);
        pagedListHolder.setPage(pageNumber - 1);
        pagedListHolder.setPageSize(2);

        /* pagination */
        int pageCount = pagedListHolder.getPageCount();
        int currentPage = pagedListHolder.getPage() + 1;

        int beginIndex = Math.max(1, currentPage - 2);
        int endIndex = Math.min(beginIndex + 5, pageCount);

        if(pageCount <= 5){
            beginIndex = 1;
            endIndex = pageCount;
        }
        else{
            int element = endIndex - currentPage;
            if(element < 3){
                beginIndex = currentPage - 5 + element;
            }
        }

        modelMap.addAttribute("beginIndex", beginIndex);
        modelMap.addAttribute("endIndex",endIndex);
        modelMap.addAttribute("pageListHolder", pagedListHolder);

        return "pageList";
    }

}
