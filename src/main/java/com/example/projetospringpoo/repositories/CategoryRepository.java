package com.example.projetospringpoo.repositories;

import com.example.projetospringpoo.domain.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
