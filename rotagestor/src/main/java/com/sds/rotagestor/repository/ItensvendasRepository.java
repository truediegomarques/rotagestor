package com.sds.rotagestor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

import com.sds.rotagestor.domain.Itensvenda;
import com.sds.rotagestor.domain.uteis.TicketMedio;
import com.sds.rotagestor.domain.uteis.TotalPorProduto;
import com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1;
import com.sds.rotagestor.domain.uteis.VendaPorCaixa;


public interface ItensvendasRepository extends JpaRepository<Itensvenda, Integer> {

    
    @Query(value = "SELECT p FROM Itensvenda p WHERE p.datamov BETWEEN :dtinicio AND :dtfim")
    List<Itensvenda> periodo(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);
	
    // Problema solucionado por: Jose Vitor- que não fez nada
    @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorProduto(p.produto.idProduto,SUM(p.valor)) FROM  Itensvenda p " +
    "WHERE  p.datamov  BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.idProduto",
     nativeQuery = false)
    List<TotalPorProduto> periodoTotalProdutoOLD(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);

    
    @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorProduto(p.produto.idProduto,SUM(p.valor))"+
    " FROM  Itensvenda p" +
    " WHERE  p.produto.idProduto = :idproduto AND p.datamov  BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.idProduto",
     nativeQuery = false)
    List<TotalPorProduto> periodoTotalProduto(
        @Param("idproduto") Integer idproduto,
        @Param("dtinicio") Date dtinicio, 
        @Param("dtfim") Date dtfim);


    @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1(p.produto.subGrupo1.idsubgrupo1,p.produto.subGrupo1.nome,SUM(p.valor))"+
    " FROM  Itensvenda p" +
    " WHERE  p.datamov BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.subGrupo1.idsubgrupo1",
     nativeQuery = false)
    List<TotalPorSubGrupo1> periodoTotalSubgrupo1(
        @Param("dtinicio") Date dtinicio, 
        @Param("dtfim") Date dtfim);

    @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1(p.produto.subGrupo1.subgrupo.idsubgrupo,p.produto.subGrupo1.subgrupo.nome"+
    ",SUM(p.valor)) FROM  Itensvenda p " +
    "WHERE  p.datamov  BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.subGrupo1.subgrupo.idsubgrupo",
     nativeQuery = false)
    List<TotalPorSubGrupo1> periodoTotalSubgrupo(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);

    @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1(p.produto.subGrupo1.subgrupo.grupo.IDGRUPO,p.produto.subGrupo1.subgrupo.grupo.NOME"+
    ",SUM(p.valor)) FROM  Itensvenda p " +
    "WHERE  p.datamov  BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.subGrupo1.subgrupo.grupo.IDGRUPO",
     nativeQuery = false)
    List<TotalPorSubGrupo1> periodoTotalGrupo(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);

    @Query(value="SELECT new com.sds.rotagestor.domain.uteis.TicketMedio(p.loja, count(distinct p.cupom), SUM(p.valor)) FROM  Itensvenda p " +
    "WHERE p.situacao = 'A' AND p.loja = :lj AND p.datamov BETWEEN :dtinicio AND :dtfim GROUP BY p.loja",
     nativeQuery = false)
    List<TicketMedio> ticketMedio(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim,  @Param("lj") int lj);

    @Query(value="SELECT new com.sds.rotagestor.domain.uteis.VendaPorCaixa(p.loja, p.venda.idnumcaixa, SUM(p.valor)) FROM Itensvenda p "+
    "WHERE  p.datamov  BETWEEN :dtinicio AND :dtfim AND p.loja = :lj " +
    "group by p.venda.loja, p.venda.idnumcaixa",
     nativeQuery = false)
    List<VendaPorCaixa> vendaPorCaixa(
        @Param("dtinicio") Date dtinicio, 
        @Param("dtfim") Date dtfim,  
        @Param("lj") int lj);
}