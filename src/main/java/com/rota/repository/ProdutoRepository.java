package com.rota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rota.domain.Produto;
import com.rota.domain.SubGrupo;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	@Query("SELECT obj FROM Produto obj where obj.subGrupo = :subGrupo")
	List<Produto> listarPorSubGrupo(@Param("subGrupo") SubGrupo subGrupo);
	

}
