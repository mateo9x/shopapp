package com.mateo9x.shopapp.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;


@Getter
@Setter
@Entity
public class Phone {
    @Id
    private Long id;

    @ManyToMany(mappedBy = "phoneSet")
    Set<Cart> cartSet;

    private String brand;
    private String model;
    private String color;

}
