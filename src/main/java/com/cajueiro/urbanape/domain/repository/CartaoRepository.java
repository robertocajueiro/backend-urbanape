package com.cajueiro.urbanape.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cajueiro.urbanape.domain.model.Cartao;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long>{

}
