package com.mateo9x.shopapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class HomeService {


    public String Home(){
        return "home";
    }
}
