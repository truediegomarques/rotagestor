package com.sds.rotagestor.repository;

import java.util.Date;
import java.util.List;

import com.sds.rotagestor.domain.ParcelaPagar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParcelasPagarRepository extends JpaRepository<ParcelaPagar, Integer>{

    @Query(value="SELECT  p FROM  ParcelaPagar p "+
    " WHERE  p.situacao = :status AND p.venc BETWEEN :dtinicio AND :dtfim",
     nativeQuery = false)
    List<ParcelaPagar> parcelaaberto(
        @Param("status") String status,
        @Param("dtinicio") Date dtinicio, 
        @Param("dtfim") Date dtfim);


}
