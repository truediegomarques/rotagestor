package com.rota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rota.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
