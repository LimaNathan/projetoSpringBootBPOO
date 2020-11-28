package com.example.projetospringpoo.services;

import java.util.Optional;

import com.example.projetospringpoo.domain.Category;
import com.example.projetospringpoo.repositories.CategoryRepository;

public class CategoryService {

    
    private CategoryRepository repository;

	//este método serve para desacoplar uma camada da outra
	//para que este tipo de "service" seja feito somente nesta camada
	// @Autowired
	public Category find(Integer id) {
		//retorna a entidade pelo ID
        Optional<Category>obj = repository.findById(id);
		/*
			Boa pratica
		trasnformar o objeto em um tipo de ponteiro "Optional"
		serve para dar mais benefícios para tratar exceções
		
		*/

		//orElse(null) = para retornar uma referência nula, para ser melhor interpretado pelo sistema
		return obj.orElse(null);
	}
    
}
