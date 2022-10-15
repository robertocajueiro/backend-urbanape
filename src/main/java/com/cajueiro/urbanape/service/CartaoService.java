package com.cajueiro.urbanape.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cajueiro.urbanape.domain.model.Cartao;
import com.cajueiro.urbanape.domain.repository.CartaoRepository;

@Service
public class CartaoService {
	
	@Autowired
	private CartaoRepository cartaoRepository;

	public List<Cartao> findAll() {
		return cartaoRepository.findAll();
	}

	public Cartao create(Cartao obj) {
		obj.setId(null);
		return cartaoRepository.save(obj);
	}
	

}
