package com.mateo9x.shopapp.controller;

import com.mateo9x.shopapp.service.HomeService;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    public HomeService homeService;

    public String Index(){
        return homeService.Index();
    }
}
