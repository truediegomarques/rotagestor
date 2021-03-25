package com.sds.rotagestor.repository;

import java.util.List;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProdutosRepository extends JpaRepository<Produto, Integer>{
   
    /**
    @Query(value = "SELECT new com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan(p.idProduto, p.descricao, p.unidSaida, p.venda1, p.ean)" +
    " FROM Produto p"+
    " WHERE p.idSituacao = 1 AND p.ean = :codbarras", nativeQuery = false)
    List<ProdutoEstoqueEan> pesquisaPorEan(@Param("codbarras") Long codbarras);
     */

    @Query(value = "SELECT new com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan(p.idProduto, p.descricao, p.unidSaida, p.venda1, p.ean, e.idLoja, e.estoqueAtual)" +
    " FROM Produto p"+
    " INNER JOIN ProdutoEstoque e on e.idProduto = p.idProduto"+ 
    " WHERE p.idSituacao = 1 AND p.ean = :codbarras AND e.idLoja = :loja", nativeQuery = false)
    List<ProdutoEstoqueEan> pesquisaPorEan(@Param("codbarras") Long codbarras, @Param("loja") int loja);
}
    