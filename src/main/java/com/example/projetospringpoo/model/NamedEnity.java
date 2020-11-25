package com.example.projetospringpoo.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class NamedEnity extends BaseEnity implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
