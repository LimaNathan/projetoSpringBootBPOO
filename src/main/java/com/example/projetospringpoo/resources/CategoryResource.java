package com.example.projetospringpoo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetospringpoo.domain.Category;


@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @GetMapping
    public List<Category> test(){               

        List<Category> categorys = new ArrayList<>();
        Category cat1 = new Category("Office");
        Category cat2 = new Category("Informatics");

        categorys.add(cat1);
        categorys.add(cat2);

        return categorys;


    }
}
