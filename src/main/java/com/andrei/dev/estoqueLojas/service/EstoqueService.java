package com.andrei.dev.estoqueLojas.service;

import com.andrei.dev.estoqueLojas.model.Produtos;
import com.andrei.dev.estoqueLojas.repository.MovimentacaoRepository;
import com.andrei.dev.estoqueLojas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.List;
import java.util.Optional;

@Service
public class EstoqueService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    MovimentacaoRepository movimentacaoRepository;

    public Produtos buscarPorId(Long id){
        Produtos produtos = new Produtos();

        produtos.setNome(produtos.getNome());
        produtos.setQuantidade(produtos.getQuantidade());
        return produtoRepository.findById(id).orElseThrow(()-> new ResourceAccessException("ID não encontrado"));
    }

    public List<Produtos> buscarProdutos(){
        return produtoRepository.findAll();
    }

    public Produtos cadastrar(Produtos produtos){
        return produtoRepository.save(produtos);
    }

    public Produtos atualizarProduto(Produtos produtos){

        var entity = produtoRepository.findById(produtos.getId()).orElseThrow(()-> new ResourceAccessException("ID não encontrado"));

        entity.setQuantidade(produtos.getQuantidade());
        entity.setNome(produtos.getNome());

        return produtoRepository.save(produtos);
    }


}
