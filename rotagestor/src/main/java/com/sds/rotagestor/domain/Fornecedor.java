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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import org.hibernate.annotations.Type;



/**
 *
 * @author diego
 */
@Entity
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDFORNECEDOR")
    private Integer idfornecedor;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "FANTASIA")
    private String fantasia;
    @Column(name = "RAMO")
    @JsonInclude(value = Include.NON_NULL)
    private String ramo;
    @Column(name = "TELEFONE")
    @JsonInclude(value = Include.NON_NULL)
    private String telefone;
    @Column(name = "FAX")
    @JsonInclude(value = Include.NON_NULL)
    private String fax;
    @Column(name = "ENDERECO")
    @JsonInclude(value = Include.NON_NULL)
    private String endereco;
    @Column(name = "BAIRRO")
    @JsonInclude(value = Include.NON_NULL)
    private String bairro;
    @Column(name = "CIDADE")
    @JsonInclude(value = Include.NON_NULL)
    private String cidade;
    @Column(name = "UF")
    @JsonInclude(value = Include.NON_NULL)
    private String uf;
    @Column(name = "CEP")
    @JsonInclude(value = Include.NON_NULL)
    private String cep;
    @Column(name = "CPF_CGC")
    @JsonInclude(value = Include.NON_NULL)
    private String cpfCgc;
    @Column(name = "RG_IE")
    @JsonInclude(value = Include.NON_NULL)
    private String rgIe;
    @Column(name = "CONDICAOFAT")
    @JsonInclude(value = Include.NON_NULL)
    private Integer condicaofat;
    @Lob
    @Column(name = "obs", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String obs;
    @Column(name = "EMAIL")
    @JsonInclude(value = Include.NON_NULL)
    private String email;
    @Column(name = "CONTATO")
    @JsonInclude(value = Include.NON_NULL)
    private String contato;
    @Column(name = "Entrega")
    @JsonInclude(value = Include.NON_NULL)
    private Integer entrega;
    @Column(name = "Vendedor")
    @JsonInclude(value = Include.NON_NULL)
    private String vendedor;
    @Column(name = "NUMERO")
    @JsonInclude(value = Include.NON_NULL)
    private String numero;
    @Column(name = "COMPLEMENTO")
    @JsonInclude(value = Include.NON_NULL)
    private String complemento;
    @Column(name = "CODMUNICIPIO")
    @JsonInclude(value = Include.NON_NULL)
    private Integer codmunicipio;
    @Column(name = "TIPOEND")
    @JsonInclude(value = Include.NON_NULL)
    private String tipoend;
    @Column(name = "DTCADASTRO")
    @Temporal(TemporalType.DATE)
    @JsonInclude(value = Include.NON_NULL)
    private Date dtcadastro;
    @Column(name = "habilitacotacao")
    @JsonInclude(value = Include.NON_NULL)
    private String habilitaCotacao;
    @Column(name = "classificacao")
    @JsonInclude(value = Include.NON_NULL)
    private String classificacao;
    @Column(name = "Simples")
    @JsonInclude(value = Include.NON_NULL)
    private String simples;
    @Column(name = "diasvisita")
    @JsonInclude(value = Include.NON_NULL)
    private String diasVisita;
    @Column(name = "cfop_fornecedor")
    @JsonInclude(value = Include.NON_NULL)
    private String cfopFornecedor;
    @Column(name = "tipofornecedor")
    @JsonInclude(value = Include.NON_NULL)
    private String tipoFornecedor;
    @Column(name = "Autorizado")
    @JsonInclude(value = Include.NON_NULL)
    private String autorizado;
    @Column(name = "ativa_desconto_icms_nf")
    @JsonInclude(value = Include.NON_NULL)
    private String ativaDescontoIcmsNf;
    @Column(name = "atualizacusto")
    @JsonInclude(value = Include.NON_NULL)
    private String atualizacusto;
    @Column(name = "emailpedido")
    @JsonInclude(value = Include.NON_NULL)
    private String emailPedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorminimocompra")
    @JsonInclude(value = Include.NON_NULL)
    private BigDecimal valorMinimoCompra;
    @Column(name = "frete")
    @JsonInclude(value = Include.NON_NULL)
    private BigDecimal frete;
    @Column(name = "permite_credito_icms")
    @JsonInclude(value = Include.NON_NULL)
    private String permiteCreditoIcms;
    @Column(name = "aliquota_simples")
    @JsonInclude(value = Include.NON_NULL)
    private BigDecimal aliquotaSimples;
    @Column(name = "cuf")
    @JsonInclude(value = Include.NON_NULL)
    private String cUF;

    public Fornecedor() {
    }

    public Fornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public Integer getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(Integer idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpfCgc() {
        return cpfCgc;
    }

    public void setCpfCgc(String cpfCgc) {
        this.cpfCgc = cpfCgc;
    }

    public String getRgIe() {
        return rgIe;
    }

    public void setRgIe(String rgIe) {
        this.rgIe = rgIe;
    }

    public Integer getCondicaofat() {
        return condicaofat;
    }

    public void setCondicaofat(Integer condicaofat) {
        this.condicaofat = condicaofat;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Integer getEntrega() {
        return entrega;
    }

    public void setEntrega(Integer entrega) {
        this.entrega = entrega;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCodmunicipio() {
        return codmunicipio;
    }

    public void setCodmunicipio(Integer codmunicipio) {
        this.codmunicipio = codmunicipio;
    }

    public String getTipoend() {
        return tipoend;
    }

    public void setTipoend(String tipoend) {
        this.tipoend = tipoend;
    }

    public Date getDtcadastro() {
        return dtcadastro;
    }

    public void setDtcadastro(Date dtcadastro) {
        this.dtcadastro = dtcadastro;
    }

    public String getHabilitaCotacao() {
        return habilitaCotacao;
    }

    public void setHabilitaCotacao(String habilitaCotacao) {
        this.habilitaCotacao = habilitaCotacao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getSimples() {
        return simples;
    }

    public void setSimples(String simples) {
        this.simples = simples;
    }

    public String getDiasVisita() {
        return diasVisita;
    }

    public void setDiasVisita(String diasVisita) {
        this.diasVisita = diasVisita;
    }

    public String getCfopFornecedor() {
        return cfopFornecedor;
    }

    public void setCfopFornecedor(String cfopFornecedor) {
        this.cfopFornecedor = cfopFornecedor;
    }

    public String getTipoFornecedor() {
        return tipoFornecedor;
    }

    public void setTipoFornecedor(String tipoFornecedor) {
        this.tipoFornecedor = tipoFornecedor;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public String getAtivaDescontoIcmsNf() {
        return ativaDescontoIcmsNf;
    }

    public void setAtivaDescontoIcmsNf(String ativaDescontoIcmsNf) {
        this.ativaDescontoIcmsNf = ativaDescontoIcmsNf;
    }

    public String getAtualizacusto() {
        return atualizacusto;
    }

    public void setAtualizacusto(String atualizacusto) {
        this.atualizacusto = atualizacusto;
    }

    public String getEmailPedido() {
        return emailPedido;
    }

    public void setEmailPedido(String emailPedido) {
        this.emailPedido = emailPedido;
    }

    public BigDecimal getValorMinimoCompra() {
        return valorMinimoCompra;
    }

    public void setValorMinimoCompra(BigDecimal valorMinimoCompra) {
        this.valorMinimoCompra = valorMinimoCompra;
    }

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

    public String getPermiteCreditoIcms() {
        return permiteCreditoIcms;
    }

    public void setPermiteCreditoIcms(String permiteCreditoIcms) {
        this.permiteCreditoIcms = permiteCreditoIcms;
    }

    public BigDecimal getAliquotaSimples() {
        return aliquotaSimples;
    }

    public void setAliquotaSimples(BigDecimal aliquotaSimples) {
        this.aliquotaSimples = aliquotaSimples;
    }

    public String getCUF() {
        return cUF;
    }

    public void setCUF(String cUF) {
        this.cUF = cUF;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedor != null ? idfornecedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedor)) {
            return false;
        }
        Fornecedor other = (Fornecedor) object;
        if ((this.idfornecedor == null && other.idfornecedor != null) || (this.idfornecedor != null && !this.idfornecedor.equals(other.idfornecedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Fornecedor[ idfornecedor=" + idfornecedor + " ]";
    }
    
}
