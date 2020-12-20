package com.mateo9x.shopapp.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;


@Data
@Entity
public class Cart {
    @Id
    private Long id;
    @ManyToMany
    Set<Phone> phoneSet;
}
