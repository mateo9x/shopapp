package com.mateo9x.shopapp.controller;

import com.mateo9x.shopapp.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;


    @RequestMapping("/")
    public String Home(){
        return homeService.Home();
    }
}
