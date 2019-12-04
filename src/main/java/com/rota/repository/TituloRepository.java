package com.rota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rota.domain.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
