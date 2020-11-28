package com.example.projetospringpoo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import com.example.projetospringpoo.model.NamedEnity;

@Entity // Informando que essa classe é uma entidade e precisa ser mantida no banco de
        // dados
public class Category extends NamedEnity {
    private static final long serialVersionUID = 1L;

    @ManyToMany(mappedBy = "categorys") // informando ao mapeamento muitos para muitos que ele já foi instanciando com o
                                        // nome "Categorys"
    private List<Product> products = new ArrayList<>();

    public Category() {

    }

    public Category(String name) {

        this.setName(name);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
