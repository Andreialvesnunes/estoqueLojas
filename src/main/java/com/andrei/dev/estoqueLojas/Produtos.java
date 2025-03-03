package com.andrei.dev.estoqueLojas;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 100)
    private String nome;
    @Column(nullable = false)
    private int quantidade;

    public Produtos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produtos produtos = (Produtos) o;
        return quantidade == produtos.quantidade && Objects.equals(id, produtos.id) && Objects.equals(nome, produtos.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, quantidade);
    }
}
