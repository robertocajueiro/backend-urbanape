package com.cajueiro.urbanape.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cajueiro.urbanape.domain.model.Cartao;
import com.cajueiro.urbanape.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
public class CartaoController {
	
	@Autowired
	private CartaoService cartaoService;
	
	@GetMapping
	public ResponseEntity<List<Cartao>> findAll(){
		List<Cartao> list = cartaoService.findAll();
		return ResponseEntity.ok().body(list);
	}

}
