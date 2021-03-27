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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.hibernate.annotations.Type;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "parcelapagar")

public class ParcelaPagar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparcelapagar")
    private Integer idParcelaPagar;
    @ManyToOne
    @JoinColumn(name = "idfornecedor")
    private Fornecedor fornecedor;
    @Basic(optional = false)
    @Column(name = "idpagar")
    private int idPagar;
    @Lob
    @Column(name = "doc", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String doc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor")
    private BigDecimal valor;
    @Column(name = "venc")
    @Temporal(TemporalType.DATE)
    private Date venc;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "duplicata")
    private String duplicata;
    @Column(name = "bordero")
    @JsonInclude(value = Include.NON_NULL)
    private Integer bordero;
    @Column(name = "vldesconto")
    private BigDecimal vldesconto;
    @Lob
    @Column(name = "historico", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String historico;
    @Column(name = "dt_pagto")
    @Temporal(TemporalType.DATE)
    private Date dtPagto;
    @Column(name = "idbanco")
    @JsonInclude(value = Include.NON_NULL)
    private Integer idBanco;
    @Column(name = "Nocheque")
    @JsonInclude(value = Include.NON_NULL)
    private Integer noCheque;
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "formaentrada")
    private String formaentrada;
    @Column(name = "tipobaixabordero")
    private String tipoBaixaBordero;
    @Column(name = "codigo_agrupamento")
    private Integer codigoAgrupamento;
    @Lob
    @Column(name = "codigobarra", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    @JsonInclude(value = Include.NON_NULL)
    private String codigobarra;
    @Column(name = "vl_juros")
    private BigDecimal vlJuros;
    @Column(name = "vl_multa")
    private BigDecimal vlMulta;
    @Column(name = "vl_acrescimo")
    private BigDecimal vlAcrescimo;
    @Column(name = "acrescimo")
    private BigDecimal acrescimo;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @Lob
    @Column(name = "obs_bordero", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    @JsonInclude(value = Include.NON_NULL)
    private String obsBordero;
    @Column(name = "tipopessoaid")
    @JsonInclude(value = Include.NON_NULL)
    private String tipoPessoaID;
   
    public ParcelaPagar() {
    }

    public Integer getIdParcelaPagar() {
        return idParcelaPagar;
    }

    public void setIdParcelaPagar(Integer idParcelaPagar) {
        this.idParcelaPagar = idParcelaPagar;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getIdPagar() {
        return idPagar;
    }

    public void setIdPagar(int idPagar) {
        this.idPagar = idPagar;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getVenc() {
        return venc;
    }

    public void setVenc(Date venc) {
        this.venc = venc;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDuplicata() {
        return duplicata;
    }

    public void setDuplicata(String duplicata) {
        this.duplicata = duplicata;
    }

    public Integer getBordero() {
        return bordero;
    }

    public void setBordero(Integer bordero) {
        this.bordero = bordero;
    }

    public BigDecimal getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(BigDecimal vldesconto) {
        this.vldesconto = vldesconto;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public Date getDtPagto() {
        return dtPagto;
    }

    public void setDtPagto(Date dtPagto) {
        this.dtPagto = dtPagto;
    }

    public Integer getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(Integer idBanco) {
        this.idBanco = idBanco;
    }

    public Integer getNoCheque() {
        return noCheque;
    }

    public void setNoCheque(Integer noCheque) {
        this.noCheque = noCheque;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFormaentrada() {
        return formaentrada;
    }

    public void setFormaentrada(String formaentrada) {
        this.formaentrada = formaentrada;
    }

    public String getTipoBaixaBordero() {
        return tipoBaixaBordero;
    }

    public void setTipoBaixaBordero(String tipoBaixaBordero) {
        this.tipoBaixaBordero = tipoBaixaBordero;
    }

    public Integer getCodigoAgrupamento() {
        return codigoAgrupamento;
    }

    public void setCodigoAgrupamento(Integer codigoAgrupamento) {
        this.codigoAgrupamento = codigoAgrupamento;
    }

    public String getCodigobarra() {
        return codigobarra;
    }

    public void setCodigobarra(String codigobarra) {
        this.codigobarra = codigobarra;
    }

    public BigDecimal getVlJuros() {
        return vlJuros;
    }

    public void setVlJuros(BigDecimal vlJuros) {
        this.vlJuros = vlJuros;
    }

    public BigDecimal getVlMulta() {
        return vlMulta;
    }

    public void setVlMulta(BigDecimal vlMulta) {
        this.vlMulta = vlMulta;
    }

    public BigDecimal getVlAcrescimo() {
        return vlAcrescimo;
    }

    public void setVlAcrescimo(BigDecimal vlAcrescimo) {
        this.vlAcrescimo = vlAcrescimo;
    }

    public BigDecimal getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(BigDecimal acrescimo) {
        this.acrescimo = acrescimo;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getObsBordero() {
        return obsBordero;
    }

    public void setObsBordero(String obsBordero) {
        this.obsBordero = obsBordero;
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
        hash += (idParcelaPagar != null ? idParcelaPagar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParcelaPagar)) {
            return false;
        }
        ParcelaPagar other = (ParcelaPagar) object;
        if ((this.idParcelaPagar == null && other.idParcelaPagar != null) || (this.idParcelaPagar != null && !this.idParcelaPagar.equals(other.idParcelaPagar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Parcelapagar[ idParcelaPagar=" + idParcelaPagar + " ]";
    }
    
}
