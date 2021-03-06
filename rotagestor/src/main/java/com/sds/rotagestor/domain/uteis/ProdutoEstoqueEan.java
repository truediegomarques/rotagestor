package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

public class ProdutoEstoqueEan {

    private Integer idProduto;
    private String descricao;
    private String unidSaida;
    private BigDecimal venda1;
    private BigDecimal pcompra;
    private Long ean;
    private int idLoja;
    private BigDecimal estoqueAtual;
    

    public ProdutoEstoqueEan(Integer idProduto, String descricao, String unidSaida, BigDecimal venda1, BigDecimal pcompra, Long ean, int idLoja ,BigDecimal estoqueAtual) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.unidSaida = unidSaida;
        this.venda1 = venda1;
        this.ean = ean;
        this.idLoja = idLoja;
        this.estoqueAtual = estoqueAtual;
    }

    public ProdutoEstoqueEan(Integer idProduto, String descricao, String unidSaida, BigDecimal venda1, BigDecimal pcompra, Long ean, int idLoja) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.unidSaida = unidSaida;
        this.venda1 = venda1;
        this.ean = ean;
        this.idLoja = idLoja;
    }

    public ProdutoEstoqueEan(Integer idProduto, String descricao, String unidSaida, BigDecimal venda1, Long ean) {
        this.idProduto = idProduto;
        this.descricao = descricao;
        this.unidSaida = unidSaida;
        this.venda1 = venda1;
        this.ean = ean;
    }

    public Integer getIdProduto() {
        return idProduto;
    }
    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getUnidSaida() {
        return unidSaida;
    }
    public void setUnidSaida(String unidSaida) {
        this.unidSaida = unidSaida;
    }
    public BigDecimal getVenda1() {
        return venda1;
    }
    public void setVenda1(BigDecimal venda1) {
        this.venda1 = venda1;
    }
    public Long getEan() {
        return ean;
    }
    public void setEan(Long ean) {
        this.ean = ean;
    }
    public BigDecimal getEstoqueAtual() {
        return estoqueAtual;
    }
    public void setEstoqueAtual(BigDecimal estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public BigDecimal getPcompra() {
        return pcompra;
    }

    public void setPcompra(BigDecimal pcompra) {
        this.pcompra = pcompra;
    }   
    
    
    
}
