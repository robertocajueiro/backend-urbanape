package com.cajueiro.urbanape.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.cajueiro.urbanape.domain.enums.TipoCartao;

import lombok.Data;

@Entity
@Data
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 150)
	private Long numeroCartao;
	
	@Column(nullable = false, length = 150)
	private boolean status;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private Usuario usuario;
	
	@Enumerated(EnumType.STRING)
	private TipoCartao tipoCartao;

}
