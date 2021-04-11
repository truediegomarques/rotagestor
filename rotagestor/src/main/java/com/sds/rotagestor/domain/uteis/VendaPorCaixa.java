package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

public class VendaPorCaixa {

    private Integer loja;
    private Integer numCaixa;
    private BigDecimal valor;
    
    public VendaPorCaixa(Integer loja, Integer numCaixa, BigDecimal valor) {
        this.loja = loja;
        this.numCaixa = numCaixa;
        this.valor = valor;
    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public Integer getNumCaixa() {
        return numCaixa;
    }

    public void setNumCaixa(Integer numCaixa) {
        this.numCaixa = numCaixa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
    
}