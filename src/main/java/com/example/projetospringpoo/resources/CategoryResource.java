package com.example.projetospringpoo.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetospringpoo.domain.Category;

                                                                                /*endPoint é o que fica após
                                                                                  o endereço padrão/base da aplicação web
                                                                                */

@RestController
@RequestMapping(value = "/category") //infroma que este é o endPoint que vai ser usado para acessar esta classe
public class CategoryResource {

    // para mapear os dados dessa lista no "/category" informado acima
    @GetMapping
    public List<Category> test(){               

        //criando uma lista de categorias para ser adicionada a "/categoriy"
        List<Category> categorys = new ArrayList<>();
        Category cat1 = new Category("Office");
        Category cat2 = new Category("Informatics");

        //adicionando o conteúdo das variáveis cat1 e cat2 a lista
        categorys.add(cat1);
        categorys.add(cat2);

        return categorys;


    }
}
