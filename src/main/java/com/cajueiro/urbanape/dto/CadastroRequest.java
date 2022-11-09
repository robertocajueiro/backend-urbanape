package com.cajueiro.urbanape.dto;

import com.cajueiro.urbanape.domain.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CadastroRequest {

    private Usuario usuario;
}
