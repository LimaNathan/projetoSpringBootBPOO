package com.example.projetospringpoo.domain;

import java.io.Serializable;

import javax.persistence.Entity;

import com.example.projetospringpoo.model.NamedEnity;

@Entity // Informando que essa classe é uma entidade e precisa ser mantida no banco de dados
public class Category extends NamedEnity implements Serializable{


    private static final long serialVersionUID = 1L;
    
    public Category(){


    }

    public Category(String name){

        this.setName(name);
    }

}
