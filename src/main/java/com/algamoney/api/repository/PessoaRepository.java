package com.algamoney.api.repository;

import com.algamoney.api.model.Pessoa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
    
}
