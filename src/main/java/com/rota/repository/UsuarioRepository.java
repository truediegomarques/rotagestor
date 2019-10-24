package com.rota.repository;

import org.springframework.data.repository.CrudRepository;

import com.rota.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
