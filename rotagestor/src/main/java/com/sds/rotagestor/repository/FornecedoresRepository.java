package com.sds.rotagestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sds.rotagestor.domain.Fornecedor;

public interface FornecedoresRepository extends JpaRepository<Fornecedor, Integer>{
  
}
