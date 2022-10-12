package com.cajueiro.urbanape.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cajueiro.urbanape.domain.model.Usuario;
import com.cajueiro.urbanape.domain.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario findByid(Long id) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Usuario.class.getName(), null));
	}

	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	public Usuario update(Long id, Usuario obj) {
		Usuario newObj = findByid(id);
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());
		newObj.setSenha(obj.getSenha());
		newObj.setCartao(obj.getCartao());
		return usuarioRepository.save(newObj);
	}
	
	public void delete(Long id) {
		findByid(id);
		usuarioRepository.deleteById(id);
	}

	public Usuario create(Usuario obj) {
		obj.setId(null);
		return usuarioRepository.save(obj);
	}

}
