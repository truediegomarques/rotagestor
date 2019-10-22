package com.rota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rota.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
