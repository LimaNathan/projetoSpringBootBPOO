package com.example.projetospringpoo.services;

import java.util.Optional;

import com.example.projetospringpoo.domain.Category;
import com.example.projetospringpoo.repositories.CategoryRepository;
import com.example.projetospringpoo.services.exception.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository repository;

    public Category find(Integer id){

        Optional<Category> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
            "Object not found: " + id + " Tipo: " + Category.class.getName()));
    }
}

