package com.cajueiro.urbanape.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cajueiro.urbanape.domain.model.TipoCartao;

@Repository
public interface TipoCartaoRepository extends JpaRepository<TipoCartao, Long>{

}
