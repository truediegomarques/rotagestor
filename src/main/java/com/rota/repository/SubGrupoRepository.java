package com.rota.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rota.domain.Grupo;
import com.rota.domain.SubGrupo;

public interface SubGrupoRepository extends JpaRepository<SubGrupo, Long> {

	@Query("SELECT obj FROM SubGrupo obj where obj.grupo = :grupo")
	List<SubGrupo> listarPorSubGrupo(@Param("grupo") Grupo Grupo);

}
