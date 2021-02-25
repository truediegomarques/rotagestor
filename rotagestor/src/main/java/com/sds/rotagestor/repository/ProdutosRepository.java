package com.sds.rotagestor.repository;

import com.sds.rotagestor.domain.Produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produto, Integer>{
    
}
    
