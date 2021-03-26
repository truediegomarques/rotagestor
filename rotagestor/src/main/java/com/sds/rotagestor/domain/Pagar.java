package com.sds.rotagestor.domain;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "pagar")
public class Pagar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpagar")
    private Integer idPagar;
    @Column(name = "idfornecedor")
    private Integer idFornecedor;
    @Lob
    @Column(name = "nr_docto",length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String nrDocto;
    @Column(name = "dt_entrada")
    @Temporal(TemporalType.DATE)
    private Date dtEntrada;
    @Column(name = "dt_emissao")
    @Temporal(TemporalType.DATE)
    private Date dtEmissao;
    @Column(name = "dt_vencto")
    @Temporal(TemporalType.DATE)
    private Date dtVencto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "vl_docto")
    private BigDecimal vlDocto;
    @Column(name = "idpc1")
    private Integer idPc1;
    @Lob
    @Column(name = "obs", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String obs;
    @Column(name = "dt_pagto")
    @Temporal(TemporalType.DATE)
    private Date dtPagto;
    @Column(name = "tipo")
    private String tipo;
    @Column(name = "ncheque")
    private String ncheque;
    @Column(name = "idbanco")
    private Integer idBanco;
    @Column(name = "idpedido")
    private Integer idPedido;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "idcheque")
    private Integer idCheque;
    @Column(name = "idnfentrada")
    private Integer idNfEntrada;
    @Column(name = "parcelado")
    private String parcelado;
    @Column(name = "loja")
    private Integer loja;
    @Column(name = "previsao")
    private String previsao;
    @Column(name = "idpc2")
    private Integer idPc2;
    @Column(name = "idtipocobranca")
    private Integer idTipoCobranca;
    @Column(name = "vldesconto")
    private BigDecimal vlDesconto;
    @Lob
    @Column(name = "historico", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String historico;
    @Column(name = "valorcheque")
    private BigDecimal valorcheque;
    @Column(name = "vl_complemento")
    private BigDecimal vlComplemento;
    @Column(name = "duplicata")
    private String duplicata;
    @Column(name = "vlacrescimo")
    private BigDecimal vlAcrescimo;
    @Column(name = "vlcustascartorio")
    private BigDecimal vlCustasCartorio;
    @Column(name = "vltotalpagar")
    private BigDecimal vlTotalPagar;
    @Column(name = "idsubcategoria")
    private Integer idsubcategoria;
    @Column(name = "idnfentrada_gnre")
    private Integer idNfEntradagnre;
    @Column(name = "tipopessoaid")
    private String tipoPessoaID;

    public Pagar() {
    }

    public Pagar(Integer idPagar) {
        this.idPagar = idPagar;
    }

    public Integer getIdPagar() {
        return idPagar;
    }

    public void setIdPagar(Integer idPagar) {
        this.idPagar = idPagar;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getNrDocto() {
        return nrDocto;
    }

    public void setNrDocto(String nrDocto) {
        this.nrDocto = nrDocto;
    }

    public Date getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(Date dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public Date getDtEmissao() {
        return dtEmissao;
    }

    public void setDtEmissao(Date dtEmissao) {
        this.dtEmissao = dtEmissao;
    }

    public Date getDtVencto() {
        return dtVencto;
    }

    public void setDtVencto(Date dtVencto) {
        this.dtVencto = dtVencto;
    }

    public BigDecimal getVlDocto() {
        return vlDocto;
    }

    public void setVlDocto(BigDecimal vlDocto) {
        this.vlDocto = vlDocto;
    }

    public Integer getIdPc1() {
        return idPc1;
    }

    public void setIdPc1(Integer idPc1) {
        this.idPc1 = idPc1;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getDtPagto() {
        return dtPagto;
    }

    public void setDtPagto(Date dtPagto) {
        this.dtPagto = dtPagto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNcheque() {
        return ncheque;
    }

    public void setNcheque(String ncheque) {
        this.ncheque = ncheque;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Integer getIdCheque() {
        return idCheque;
    }

    public void setIdCheque(Integer idCheque) {
        this.idCheque = idCheque;
    }

    public Integer getIdNfEntrada() {
        return idNfEntrada;
    }

    public void setIdNfEntrada(Integer idNfEntrada) {
        this.idNfEntrada = idNfEntrada;
    }

    public String getParcelado() {
        return parcelado;
    }

    public void setParcelado(String parcelado) {
        this.parcelado = parcelado;
    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public String getPrevisao() {
        return previsao;
    }

    public void setPrevisao(String previsao) {
        this.previsao = previsao;
    }

    public Integer getIdPc2() {
        return idPc2;
    }

    public void setIdPc2(Integer idPc2) {
        this.idPc2 = idPc2;
    }

    public Integer getIdTipoCobranca() {
        return idTipoCobranca;
    }

    public void setIdTipoCobranca(Integer idTipoCobranca) {
        this.idTipoCobranca = idTipoCobranca;
    }

    public BigDecimal getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(BigDecimal vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public BigDecimal getValorcheque() {
        return valorcheque;
    }

    public void setValorcheque(BigDecimal valorcheque) {
        this.valorcheque = valorcheque;
    }

    public BigDecimal getVlComplemento() {
        return vlComplemento;
    }

    public void setVlComplemento(BigDecimal vlComplemento) {
        this.vlComplemento = vlComplemento;
    }

    public String getDuplicata() {
        return duplicata;
    }

    public void setDuplicata(String duplicata) {
        this.duplicata = duplicata;
    }

    public BigDecimal getVlAcrescimo() {
        return vlAcrescimo;
    }

    public void setVlAcrescimo(BigDecimal vlAcrescimo) {
        this.vlAcrescimo = vlAcrescimo;
    }

    public BigDecimal getVlCustasCartorio() {
        return vlCustasCartorio;
    }

    public void setVlCustasCartorio(BigDecimal vlCustasCartorio) {
        this.vlCustasCartorio = vlCustasCartorio;
    }

    public BigDecimal getVlTotalPagar() {
        return vlTotalPagar;
    }

    public void setVlTotalPagar(BigDecimal vlTotalPagar) {
        this.vlTotalPagar = vlTotalPagar;
    }

    public Integer getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public Integer getIdNfEntradagnre() {
        return idNfEntradagnre;
    }

    public void setIdNfEntradagnre(Integer idNfEntradagnre) {
        this.idNfEntradagnre = idNfEntradagnre;
    }

    public String getTipoPessoaID() {
        return tipoPessoaID;
    }

    public void setTipoPessoaID(String tipoPessoaID) {
        this.tipoPessoaID = tipoPessoaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPagar != null ? idPagar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pagar)) {
            return false;
        }
        Pagar other = (Pagar) object;
        if ((this.idPagar == null && other.idPagar != null) || (this.idPagar != null && !this.idPagar.equals(other.idPagar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Pagar[ idPagar=" + idPagar + " ]";
    }
    
}
