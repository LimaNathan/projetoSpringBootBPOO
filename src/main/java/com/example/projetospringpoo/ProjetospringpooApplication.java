package com.example.projetospringpoo;

import java.util.Arrays;

import com.example.projetospringpoo.domain.Category;
import com.example.projetospringpoo.repositories.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetospringpooApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(ProjetospringpooApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception{

		Category cat1 = new Category("Informatics");
		Category cat2 = new Category("Office");

		//para salvar em um só comando
		// método saveAll usando a classe arrays, que cria um array usando o que eu passar
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
	}
}
