package com.rota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rota.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
