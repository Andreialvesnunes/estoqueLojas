package com.andrei.dev.estoqueLojas.controller;

import com.andrei.dev.estoqueLojas.model.Produtos;
import com.andrei.dev.estoqueLojas.repository.ProdutoRepository;
import com.andrei.dev.estoqueLojas.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    EstoqueService estoqueService;

    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("API de estoque funcionando!");
    }

    @GetMapping(value = "/pesquisar")
    public List<Produtos> buscaProdutos(){
        return estoqueService.buscarProdutos();
    }

    @GetMapping(value = "/pesId/{id}")
    public Produtos buscarPorId(@PathVariable Long id){
        return estoqueService.buscarPorId(id);
    }

    @PostMapping("/cadastrar")
    public Produtos cadastrarProduto(@RequestBody Produtos produtos){
        return estoqueService.cadastrar(produtos);
    }

    @PutMapping("/atualizar/{id}")
    public Produtos atualizarProduto( @RequestBody Produtos produtos){
        return estoqueService.atualizarProduto(produtos);
    }
}
