package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

public class TotalPorProduto {
    private Integer id;
    private BigDecimal total;

    public TotalPorProduto(Integer id, BigDecimal total) {
        this.id = id;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
}