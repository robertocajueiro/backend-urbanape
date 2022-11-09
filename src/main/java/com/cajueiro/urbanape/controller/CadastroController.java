package com.cajueiro.urbanape.controller;

import com.cajueiro.urbanape.domain.model.Cartao;
import com.cajueiro.urbanape.domain.model.Usuario;
import com.cajueiro.urbanape.domain.repository.CartaoRepository;
import com.cajueiro.urbanape.domain.repository.UsuarioRepository;
import com.cajueiro.urbanape.dto.CadastroRequest;
import com.cajueiro.urbanape.dto.CadastroResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadastroController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CartaoRepository cartaoRepository;

    @PostMapping("/cadastroUsuarios")
    public Usuario cadastroUsuario(@RequestBody CadastroRequest request){
        return usuarioRepository.save(request.getUsuario());
    }

    @GetMapping("/findAllUsuarios")
    public List<Usuario> findAllUsuarios(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/listarCartoesUsuarios")
    public List<CadastroResponse> informacaoUsuario(){
        return usuarioRepository.getJoinInformation();
    }
}