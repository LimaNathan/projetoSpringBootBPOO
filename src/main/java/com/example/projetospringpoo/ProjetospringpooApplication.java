package com.example.projetospringpoo;

import java.util.Arrays;

import com.example.projetospringpoo.domain.Category;
import com.example.projetospringpoo.domain.Product;
import com.example.projetospringpoo.repositories.CategoryRepository;
import com.example.projetospringpoo.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetospringpooApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetospringpooApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception{


		//Instanciando os objetos
		Category cat1 = new Category("Informatics");
		Category cat2 = new Category("Office");
		
		Product p1 = new Product("Computer", 2000.0);
		Product p2 = new Product("Printer", 800.0);
		Product p3 = new Product("Mouse", 80.0);


		//passando para as categorias os seus respectivos produtos
		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProducts().addAll(Arrays.asList(p2));
		
		//informando aos produtos em quais categorias eles se encontram atualmente
		p1.getCategorys().addAll(Arrays.asList(cat1));
		p2.getCategorys().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorys().addAll(Arrays.asList(cat1));

		//para salvar em um só comando
		// método saveAll usando a classe arrays, que cria um array usando o que eu passar
		categoryRepository.saveAll(Arrays.asList(cat1, cat2));
		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}
}
