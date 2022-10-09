package com.cajueiro.urbanape.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 150)
	private String nome;
	
	@Column(nullable = false, length = 150)
	private String email;
	
	@Column(nullable = false, length = 150)
	private String senha;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Cartao> cartoes = new ArrayList<>();
	
	

}
