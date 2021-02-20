package com.sds.rotagestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.rotagestor.domain.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Integer>{

}
