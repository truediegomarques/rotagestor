package com.sds.rotagestor.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "cadastrocaixa")
public class Cadastrocaixa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCadastrocaixa")
    private Integer iDCadastroCaixa;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Tipo")
    private String tipo;
    @Column(name = "idtipolancamento")
    private Integer idTipoLancamento;
    @Column(name = "IDtipolancemento")
    private Integer iDTipoLancemento;

    public Cadastrocaixa() {
    }

    public Cadastrocaixa(Integer iDCadastroCaixa) {
        this.iDCadastroCaixa = iDCadastroCaixa;
    }

    public Cadastrocaixa(Integer iDCadastroCaixa, String nome) {
        this.iDCadastroCaixa = iDCadastroCaixa;
        this.nome = nome;
    }

    public Integer getIDCadastroCaixa() {
        return iDCadastroCaixa;
    }

    public void setIDCadastroCaixa(Integer iDCadastroCaixa) {
        this.iDCadastroCaixa = iDCadastroCaixa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getIdTipoLancamento() {
        return idTipoLancamento;
    }

    public void setIdTipoLancamento(Integer idTipoLancamento) {
        this.idTipoLancamento = idTipoLancamento;
    }

    public Integer getIDTipoLancemento() {
        return iDTipoLancemento;
    }

    public void setIDTipoLancemento(Integer iDTipoLancemento) {
        this.iDTipoLancemento = iDTipoLancemento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCadastroCaixa != null ? iDCadastroCaixa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastrocaixa)) {
            return false;
        }
        Cadastrocaixa other = (Cadastrocaixa) object;
        if ((this.iDCadastroCaixa == null && other.iDCadastroCaixa != null)
                || (this.iDCadastroCaixa != null && !this.iDCadastroCaixa.equals(other.iDCadastroCaixa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Cadastrocaixa[ iDCadastroCaixa=" + iDCadastroCaixa + " ]";
    }

}
