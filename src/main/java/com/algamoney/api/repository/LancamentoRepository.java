package com.algamoney.api.repository;

import com.algamoney.api.model.Lancamento;
import com.algamoney.api.repository.lancamento.LancamentoRepositoryQuery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery{
    
}
