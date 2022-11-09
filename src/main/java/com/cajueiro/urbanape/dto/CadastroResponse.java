package com.cajueiro.urbanape.dto;

import com.cajueiro.urbanape.domain.model.Cartao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CadastroResponse {

    private String nome;
    private Long numeroCartao;
}
