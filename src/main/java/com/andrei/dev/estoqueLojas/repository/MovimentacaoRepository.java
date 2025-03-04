package com.andrei.dev.estoqueLojas.repository;

import com.andrei.dev.estoqueLojas.model.Movimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
}
