package com.algamoney.api.repository;

import com.algamoney.api.model.Lancamento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
    
}
