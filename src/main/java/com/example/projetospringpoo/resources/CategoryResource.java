package com.example.projetospringpoo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {

    @GetMapping
    public String test(){

        return "REST Funcionando";
    }
}
