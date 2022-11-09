package com.cajueiro.urbanape.domain.repository;

import com.cajueiro.urbanape.dto.CadastroResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cajueiro.urbanape.domain.model.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("select new com.cajueiro.urbanape.dto.CadastroResponse (u.nome, c.numeroCartao) from Usuario u join u.cartoes c")
    public List<CadastroResponse> getJoinInformation();

}
