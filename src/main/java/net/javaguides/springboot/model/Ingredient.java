package net.javaguides.springboot.model;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ingredients")
public class Ingredient {

    @Column(name = "name", nullable = false)
    private String name;


    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    @Autowired
    public String getName() {
        return name;
    }
}
