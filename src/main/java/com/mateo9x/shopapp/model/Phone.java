package com.mateo9x.shopapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Phone {
    @Id
    private Long id;
    private String brand;
    private String model;
    private String color;
}
