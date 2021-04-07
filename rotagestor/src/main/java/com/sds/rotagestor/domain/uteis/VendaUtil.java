package com.sds.rotagestor.domain.uteis;

import java.math.BigDecimal;

import com.sds.rotagestor.domain.Cliente;

public class VendaUtil {
    
    private Integer idItensVenda;
    private Integer ecf;
    private Integer cupom;
    private BigDecimal valor;
    private Cliente cliente;
    
    public Integer getIdItensVenda() {
        return idItensVenda;
    }
    public void setIdItensVenda(Integer idItensVenda) {
        this.idItensVenda = idItensVenda;
    }
    public Integer getEcf() {
        return ecf;
    }
    public void setEcf(Integer ecf) {
        this.ecf = ecf;
    }
    public Integer getCupom() {
        return cupom;
    }
    public void setCupom(Integer cupom) {
        this.cupom = cupom;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
