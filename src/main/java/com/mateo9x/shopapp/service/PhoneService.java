package com.mateo9x.shopapp.service;

import com.mateo9x.shopapp.model.Phone;
import com.mateo9x.shopapp.repository.PhoneRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PhoneService {

    private final PhoneRepository phoneRepository;

    public List<Phone> getPhones(){
        return phoneRepository.findAll();
    }

    /* public Phone getSinglePhone(Long id){
        return phoneRepository.findById(id)
                .orElseThrow();
    } */
}
