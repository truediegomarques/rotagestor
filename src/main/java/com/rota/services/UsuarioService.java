package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.rota.domain.Usuario;
import com.rota.repository.UsuarioRepository;
import com.rota.services.exceptions.UsuarioExisteException;
import com.rota.services.exceptions.UsuarioNaoEncontradoException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repo;

	@Autowired
	private BCryptPasswordEncoder pe;

	public List<Usuario> listar() {
		return (List<Usuario>) repo.findAll();
	}

	public Usuario salvar(Usuario usuario) {
		if (usuario.getId() != null) {
			Optional<Usuario> us = repo.findById(usuario.getId());

			if (!us.isEmpty()) {
				throw new UsuarioExisteException("O usuário já existe");
			}

		}

		if (usuario != null) {
			usuario.setSenha(pe.encode(usuario.getSenha()));
		}
		
		return repo.save(usuario);
	}

	public Usuario buscar(Long id) {
		Optional<Usuario> usuario = repo.findById(id);

		if (usuario.isEmpty()) {
			throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
		}

		return usuario.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new UsuarioNaoEncontradoException("O usuário não foi encontrado");
		}

	}

	public void atualizar(Usuario usuario) {
		verificarExistencia(usuario);
		usuario.setSenha(buscar(usuario.getId()).getSenha());
		repo.save(usuario);

	}

	private void verificarExistencia(Usuario usuario) {
		buscar(usuario.getId());
	}

}
