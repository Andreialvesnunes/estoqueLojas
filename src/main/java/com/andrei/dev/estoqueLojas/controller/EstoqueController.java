package com.andrei.dev.estoqueLojas.controller;

import com.andrei.dev.estoqueLojas.model.Produtos;
import com.andrei.dev.estoqueLojas.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@Controller
@RequestMapping(value = "/estoque")
public class ProdutosController {

    @Autowired
    EstoqueRepository repository;

    @GetMapping(value = "/cadastro")
    public void buscaProdutos(Produtos produtos){
        repository.findAll();
    }
}
