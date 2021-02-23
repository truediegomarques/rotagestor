package com.sds.rotagestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

import com.sds.rotagestor.domain.Itensvenda;

public interface ItensvendasRepository extends JpaRepository<Itensvenda, Integer> {

    @Query(value="SELECT p FROM Itensvenda p WHERE p.datamov BETWEEN :dtinicio AND :dtfim")
    List<Itensvenda> periodo(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);
	

}