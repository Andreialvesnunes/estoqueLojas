package com.andrei.dev.estoqueLojas.repository;

import com.andrei.dev.estoqueLojas.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EstoqueRepository extends JpaRepository<Produtos, Long> {
}
