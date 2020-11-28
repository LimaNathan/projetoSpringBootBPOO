package com.example.projetospringpoo.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.example.projetospringpoo.model.NamedEnity;
import com.fasterxml.jackson.annotation.JsonIgnore;

//@Entity é para que seja necessário criar uma tabela para a classe no banco de dados
@Entity
public class Product extends NamedEnity {
    private static final long serialVersionUID = 1L;

    private Double price;

    @JsonIgnore
    @ManyToMany // mutos para muitos
    @JoinTable(name = "PRODUCT_CATEGORY", joinColumns = @JoinColumn(name = "product_id"), // descrevendo como será no
                                                                                          // banco de dados
            inverseJoinColumns = @JoinColumn(name = "category_id")) // criando um relacioamento entre product_id e
                                                                    // category_id
    private List<Category> categorys = new ArrayList<>();

    public Product() {

    }

    public Product(String name, Double price) {

        super();
        this.setName(name);
        this.price = price;

    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }

}
