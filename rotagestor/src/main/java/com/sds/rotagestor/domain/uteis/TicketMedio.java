package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

public class TicketMedio {

    private Integer loja;
    private Long cupons;
    private BigDecimal valor;
    private BigDecimal media;

    public TicketMedio() {
    }

    public TicketMedio(Integer loja, Long cupons, BigDecimal valor) {
        this.loja = loja;
        this.cupons = cupons;
        this.valor = valor;

    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public Long getCupons() {
        return cupons;
    }

    public void setCupons(Long cupons) {
        this.cupons = cupons;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getMedia() {
        return media;
    }

    public void setMedia(BigDecimal media) {
        this.media = media;
    }

 
    
    
    

    
}
