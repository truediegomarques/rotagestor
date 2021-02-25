package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

public class TotalPorSubGrupo1 {
    
    private Integer idSubGrupo1;
    private String nome;
    private BigDecimal total;

    public TotalPorSubGrupo1(Integer idSubGrupo1, String nome, BigDecimal total) {
        this.idSubGrupo1 = idSubGrupo1;
        this.nome = nome;
        this.total = total;
    }

    public TotalPorSubGrupo1(Integer idSubGrupo1, BigDecimal total) {
        this.idSubGrupo1 = idSubGrupo1;
        this.total = total;
    }

    public Integer getIdSubGrupo1() {
        return idSubGrupo1;
    }

    public void setIdSubGrupo1(Integer idSubGrupo1) {
        this.idSubGrupo1 = idSubGrupo1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }   

}
