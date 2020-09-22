package com.mateo9x.shopapp.controller;

import com.mateo9x.shopapp.model.Phone;
import com.mateo9x.shopapp.service.PhoneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PhoneContoller {

    private final PhoneService phoneService;

    @GetMapping("/phones")
    public List<Phone> getPhones(){
        return phoneService.getPhones();
    }
  /*  @GetMapping("/phones/{id}")
    public List<Phone> getSinglePhone(@PathVariable Long id){
        return phoneService.getSinglePhone(id);
    } */
}
