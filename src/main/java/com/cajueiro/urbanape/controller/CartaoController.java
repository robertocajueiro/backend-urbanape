package com.cajueiro.urbanape.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.cajueiro.urbanape.domain.model.Cartao;
import com.cajueiro.urbanape.service.CartaoService;

@RestController
@RequestMapping("/cartoes")
@CrossOrigin("*")
public class CartaoController {
	
	@Autowired
	private CartaoService cartaoService;
	
	@GetMapping
	public ResponseEntity<List<Cartao>> findAll(){
		List<Cartao> list = cartaoService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	public ResponseEntity<Cartao> create(@RequestBody Cartao obj){
		Cartao newObj = cartaoService.create(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newObj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
