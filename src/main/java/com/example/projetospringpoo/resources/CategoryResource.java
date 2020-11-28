package com.example.projetospringpoo.resources;

import com.example.projetospringpoo.domain.Category;
import com.example.projetospringpoo.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

                                                                                /*endPoint é o que fica após
                                                                                  o endereço padrão/base da aplicação web
                                                                                */

@RestController
//infroma que este é o endPoint que vai ser usado para acessar esta classe
@RequestMapping(value = "/category") 
public class CategoryResource {

  //@Autowired é para não necessitar instanciar o valor no objeto
  @Autowired
  private CategoryService service;
  
  //Para a aplicação saber quando chamar este método, é necessário passar o id junto
  @GetMapping(value = "/{id}")
  //ResponseEntity serve para retornar uma resposta HTTP que só entende requisição e resposta(Request e Response)
  //O tipo de objeto a retornar é "Category"
  public ResponseEntity<Category> find(@PathVariable Integer id){
    
   Category obj = service.find(id);
   return ResponseEntity.ok().body(obj);

  }
   
  
  
  }
