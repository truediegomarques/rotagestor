package com.sds.rotagestor.repository;

import java.util.List;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProdutosRepository extends JpaRepository<Produto, Integer>{
   

    @Query(value = "SELECT new com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan(p.idProduto, p.descricao, p.unidSaida, p.venda1, p.ean)" +
    " FROM Produto p WHERE p.idSituacao = 1 AND p.ean = :codbarras", nativeQuery = false)
    List<ProdutoEstoqueEan> pesquisaPorEan(@Param("codbarras") Long codbarras);



    /**
     * 
     *  @Query(value="SELECT  new com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1(p.produto.subGrupo1.subgrupo.grupo.IDGRUPO,p.produto.subGrupo1.subgrupo.grupo.NOME"+
    ",SUM(p.valor)) FROM  Itensvenda p " +
    "WHERE  p.datamov  BETWEEN :dtinicio AND :dtfim GROUP BY p.produto.subGrupo1.subgrupo.grupo.IDGRUPO",
     nativeQuery = false)
    List<TotalPorSubGrupo1> periodoTotalGrupo(@Param("dtinicio") Date dtinicio, @Param("dtfim") Date dtfim);
     * 
     rivate Integer idProduto;
    private String descricao;
    private String unidSaida;
    private BigDecimal venda1;
    private Long ean;
    private BigDecimal estoqueAtual;
     * 
     * 
     */


}
    