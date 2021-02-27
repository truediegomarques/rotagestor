/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "cliente")

public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcliente")
    private Integer idCliente;
    @Column(name = "nome")
    private String nome;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "endereco")
    private String endereco;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "bairro")
    private String bairro;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cidade")
    private String cidade;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "uf")
    private String uf;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cep")
    private String cep;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cpf")
    private String cpf;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "rg")
    private String rg;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fone")
    private String fone;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "celular")
    private String celular;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "credito")
    private String credito;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "limite")
    private BigDecimal limite;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "dt_nasc")
    private String dtNasc;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "autorizado")
    private String autorizado;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "empresa")
    private String empresa;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fone_emp")
    private String foneEmp;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "salario")
    private BigDecimal salario;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ref1")
    private String ref1;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fone1")
    private String fone1;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ref2")
    private String ref2;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fone2")
    private String fone2;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ref3")
    private String ref3;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fone3")
    private String fone3;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "est_civil")
    private String estCivil;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "conjuge")
    private String conjuge;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "filiacao")
    private String filiacao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "etiqueta")
    private String etiqueta;
    @JsonInclude(value = Include.NON_NULL)
    @Lob
    @Column(name = "obs", length = 65535, columnDefinition="TEXT")
    @Type(type="text")
    private String obs;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "rfpessoal1")
    private String rfpessoal1;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "rfpessoal2")
    private String rfpessoal2;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "parente1")
    private String parente1;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "parente2")
    private String parente2;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "telref1")
    private String telref1;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "telref2")
    private String telref2;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "orgao")
    private String orgao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "nomebanco")
    private String nomeBanco;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "numbanco")
    private String numBanco;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "agencia")
    private String agencia;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "conta")
    private String conta;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tipo")
    private String tipo;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "dtabertura")
    private String dtAbertura;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "spc")
    private Boolean spc;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "advogado")
    private Boolean advogado;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "usado")
    private BigDecimal usado;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tipoend")
    private String tipoend;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "numero")
    private String numero;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "complemento")
    private String complemento;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "codmunicipio")
    private Integer codmunicipio;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "empresa_convenio")
    private Integer empresaConvenio;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "limite_ch")
    private BigDecimal limiteCh;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "credito_ch")
    private String creditoCh;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "usado_ch")
    private BigDecimal usadoCh;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "carencia")
    private Integer carencia;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tipofidelidade")
    private Integer tipofidelidade;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "pontuacao")
    private Integer pontuacao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "loja")
    private Integer loja;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tabelapreco")
    private Integer tabelapreco;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "idtipocliente")
    private Integer idtipocliente;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "finalizadoras")
    private String finalizadoras;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "email")
    private String email;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "fantasia")
    private String fantasia;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "vencimento")
    private String vencimento;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "numerocartao")
    private String numerocartao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "senhacartao")
    private String senhacartao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "nomeentrega")
    private String nomeEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tipoendentrega")
    private String tipoEndEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "enderecoentrega")
    private String enderecoEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "numeroentrega")
    private String numeroEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cepentrega")
    private String cepEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "bairroentrega")
    private String bairroEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cidadeentrega")
    private String cidadeentrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ufentrega")
    private String ufentrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "nomecob")
    private String nomecob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "tipoendcob")
    private String tipoendcob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "enderecocob")
    private String enderecocob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "numerocob")
    private String numerocob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cepcob")
    private String cepcob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "bairrocob")
    private String bairrocob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cidadecob")
    private String cidadecob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ufcob")
    private String ufcob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "usuario")
    private String usuario;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "mensagem")
    private String mensagem;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "diascalcvencconvenio")
    private String diasCalcVencConvenio;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "condicaocalcvencimento")
    private String condicaoCalcVencimento;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "melhordiacompra")
    private String melhordiacompra;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "segundapessoaautorizada")
    private String segundaPessoaAutorizada;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "opsn")
    private String opsn;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "complementoentrega")
    private String complementoEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "complementocob")
    private String complementoCob;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "matricula")
    private String matricula;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "status_cadastro")
    private Boolean statusCadastro;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ativa_desconto_icms_nf")
    private String ativaDescontoIcmsNf;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "status_cliente")
    private Boolean statusCliente;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cargo")
    private String cargo;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "desconto")
    private BigDecimal desconto;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "descontoprodutopromocao")
    private String descontoProdutoPromocao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "descontogeral")
    private String descontoGeral;
    @JsonInclude(value = Include.NON_NULL)
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "condicaopagamento")
    private Integer condicaoPagamento;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "melhorhoraentrega")
    private String melhorHoraEntrega;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "controlalimiteclienteporcentagem")
    private String controlaLimiteClientePorcentagem;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "Limiteliberaracimapercentual")
    private BigDecimal limiteLiberarAcimaPercentual;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "cUF")
    private String cUF;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "paisibge")
    private String paisIbge;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "extrangeiro")
    private Boolean extrangeiro;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "vendedorID")
    private Integer vendedorID;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "usuario_alteracao")
    private String usuarioAlteracao;
    @JsonInclude(value = Include.NON_NULL)
    @Column(name = "ultima_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAlteracao;
  
    
    //@OneToMany(cascade = CascadeType.ALL, mappedBy = "iDCliente")
    //private List<Os> osList;

    public Cliente() {
    }

    public Cliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFoneEmp() {
        return foneEmp;
    }

    public void setFoneEmp(String foneEmp) {
        this.foneEmp = foneEmp;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getFone3() {
        return fone3;
    }

    public void setFone3(String fone3) {
        this.fone3 = fone3;
    }

    public String getEstCivil() {
        return estCivil;
    }

    public void setEstCivil(String estCivil) {
        this.estCivil = estCivil;
    }

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }

    public String getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(String filiacao) {
        this.filiacao = filiacao;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getRfpessoal1() {
        return rfpessoal1;
    }

    public void setRfpessoal1(String rfpessoal1) {
        this.rfpessoal1 = rfpessoal1;
    }

    public String getRfpessoal2() {
        return rfpessoal2;
    }

    public void setRfpessoal2(String rfpessoal2) {
        this.rfpessoal2 = rfpessoal2;
    }

    public String getParente1() {
        return parente1;
    }

    public void setParente1(String parente1) {
        this.parente1 = parente1;
    }

    public String getParente2() {
        return parente2;
    }

    public void setParente2(String parente2) {
        this.parente2 = parente2;
    }

    public String getTelref1() {
        return telref1;
    }

    public void setTelref1(String telref1) {
        this.telref1 = telref1;
    }

    public String getTelref2() {
        return telref2;
    }

    public void setTelref2(String telref2) {
        this.telref2 = telref2;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getNumBanco() {
        return numBanco;
    }

    public void setNumBanco(String numBanco) {
        this.numBanco = numBanco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDtAbertura() {
        return dtAbertura;
    }

    public void setDtAbertura(String dtAbertura) {
        this.dtAbertura = dtAbertura;
    }

    public Boolean getSpc() {
        return spc;
    }

    public void setSpc(Boolean spc) {
        this.spc = spc;
    }

    public Boolean getAdvogado() {
        return advogado;
    }

    public void setAdvogado(Boolean advogado) {
        this.advogado = advogado;
    }

    public BigDecimal getUsado() {
        return usado;
    }

    public void setUsado(BigDecimal usado) {
        this.usado = usado;
    }

    public String getTipoend() {
        return tipoend;
    }

    public void setTipoend(String tipoend) {
        this.tipoend = tipoend;
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

    public Integer getEmpresaConvenio() {
        return empresaConvenio;
    }

    public void setEmpresaConvenio(Integer empresaConvenio) {
        this.empresaConvenio = empresaConvenio;
    }

    public BigDecimal getLimiteCh() {
        return limiteCh;
    }

    public void setLimiteCh(BigDecimal limiteCh) {
        this.limiteCh = limiteCh;
    }

    public String getCreditoCh() {
        return creditoCh;
    }

    public void setCreditoCh(String creditoCh) {
        this.creditoCh = creditoCh;
    }

    public BigDecimal getUsadoCh() {
        return usadoCh;
    }

    public void setUsadoCh(BigDecimal usadoCh) {
        this.usadoCh = usadoCh;
    }

    public Integer getCarencia() {
        return carencia;
    }

    public void setCarencia(Integer carencia) {
        this.carencia = carencia;
    }

    public Integer getTipofidelidade() {
        return tipofidelidade;
    }

    public void setTipofidelidade(Integer tipofidelidade) {
        this.tipofidelidade = tipofidelidade;
    }

    public Integer getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(Integer pontuacao) {
        this.pontuacao = pontuacao;
    }

    public Integer getLoja() {
        return loja;
    }

    public void setLoja(Integer loja) {
        this.loja = loja;
    }

    public Integer getTabelapreco() {
        return tabelapreco;
    }

    public void setTabelapreco(Integer tabelapreco) {
        this.tabelapreco = tabelapreco;
    }

    public Integer getIdtipocliente() {
        return idtipocliente;
    }

    public void setIdtipocliente(Integer idtipocliente) {
        this.idtipocliente = idtipocliente;
    }

    public String getFinalizadoras() {
        return finalizadoras;
    }

    public void setFinalizadoras(String finalizadoras) {
        this.finalizadoras = finalizadoras;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getSenhacartao() {
        return senhacartao;
    }

    public void setSenhacartao(String senhacartao) {
        this.senhacartao = senhacartao;
    }

    public String getNomeEntrega() {
        return nomeEntrega;
    }

    public void setNomeEntrega(String nomeEntrega) {
        this.nomeEntrega = nomeEntrega;
    }

    public String getTipoEndEntrega() {
        return tipoEndEntrega;
    }

    public void setTipoEndEntrega(String tipoEndEntrega) {
        this.tipoEndEntrega = tipoEndEntrega;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public String getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(String numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public String getCepEntrega() {
        return cepEntrega;
    }

    public void setCepEntrega(String cepEntrega) {
        this.cepEntrega = cepEntrega;
    }

    public String getBairroEntrega() {
        return bairroEntrega;
    }

    public void setBairroEntrega(String bairroEntrega) {
        this.bairroEntrega = bairroEntrega;
    }

    public String getCidadeentrega() {
        return cidadeentrega;
    }

    public void setCidadeentrega(String cidadeentrega) {
        this.cidadeentrega = cidadeentrega;
    }

    public String getUfentrega() {
        return ufentrega;
    }

    public void setUfentrega(String ufentrega) {
        this.ufentrega = ufentrega;
    }

    public String getNomecob() {
        return nomecob;
    }

    public void setNomecob(String nomecob) {
        this.nomecob = nomecob;
    }

    public String getTipoendcob() {
        return tipoendcob;
    }

    public void setTipoendcob(String tipoendcob) {
        this.tipoendcob = tipoendcob;
    }

    public String getEnderecocob() {
        return enderecocob;
    }

    public void setEnderecocob(String enderecocob) {
        this.enderecocob = enderecocob;
    }

    public String getNumerocob() {
        return numerocob;
    }

    public void setNumerocob(String numerocob) {
        this.numerocob = numerocob;
    }

    public String getCepcob() {
        return cepcob;
    }

    public void setCepcob(String cepcob) {
        this.cepcob = cepcob;
    }

    public String getBairrocob() {
        return bairrocob;
    }

    public void setBairrocob(String bairrocob) {
        this.bairrocob = bairrocob;
    }

    public String getCidadecob() {
        return cidadecob;
    }

    public void setCidadecob(String cidadecob) {
        this.cidadecob = cidadecob;
    }

    public String getUfcob() {
        return ufcob;
    }

    public void setUfcob(String ufcob) {
        this.ufcob = ufcob;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDiasCalcVencConvenio() {
        return diasCalcVencConvenio;
    }

    public void setDiasCalcVencConvenio(String diasCalcVencConvenio) {
        this.diasCalcVencConvenio = diasCalcVencConvenio;
    }

    public String getCondicaoCalcVencimento() {
        return condicaoCalcVencimento;
    }

    public void setCondicaoCalcVencimento(String condicaoCalcVencimento) {
        this.condicaoCalcVencimento = condicaoCalcVencimento;
    }

    public String getMelhordiacompra() {
        return melhordiacompra;
    }

    public void setMelhordiacompra(String melhordiacompra) {
        this.melhordiacompra = melhordiacompra;
    }

    public String getSegundaPessoaAutorizada() {
        return segundaPessoaAutorizada;
    }

    public void setSegundaPessoaAutorizada(String segundaPessoaAutorizada) {
        this.segundaPessoaAutorizada = segundaPessoaAutorizada;
    }

    public String getOpsn() {
        return opsn;
    }

    public void setOpsn(String opsn) {
        this.opsn = opsn;
    }

    public String getComplementoEntrega() {
        return complementoEntrega;
    }

    public void setComplementoEntrega(String complementoEntrega) {
        this.complementoEntrega = complementoEntrega;
    }

    public String getComplementoCob() {
        return complementoCob;
    }

    public void setComplementoCob(String complementoCob) {
        this.complementoCob = complementoCob;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Boolean getStatusCadastro() {
        return statusCadastro;
    }

    public void setStatusCadastro(Boolean statusCadastro) {
        this.statusCadastro = statusCadastro;
    }

    public String getAtivaDescontoIcmsNf() {
        return ativaDescontoIcmsNf;
    }

    public void setAtivaDescontoIcmsNf(String ativaDescontoIcmsNf) {
        this.ativaDescontoIcmsNf = ativaDescontoIcmsNf;
    }

    public Boolean getStatusCliente() {
        return statusCliente;
    }

    public void setStatusCliente(Boolean statusCliente) {
        this.statusCliente = statusCliente;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public String getDescontoProdutoPromocao() {
        return descontoProdutoPromocao;
    }

    public void setDescontoProdutoPromocao(String descontoProdutoPromocao) {
        this.descontoProdutoPromocao = descontoProdutoPromocao;
    }

    public String getDescontoGeral() {
        return descontoGeral;
    }

    public void setDescontoGeral(String descontoGeral) {
        this.descontoGeral = descontoGeral;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Integer getCondicaoPagamento() {
        return condicaoPagamento;
    }

    public void setCondicaoPagamento(Integer condicaoPagamento) {
        this.condicaoPagamento = condicaoPagamento;
    }

    public String getMelhorHoraEntrega() {
        return melhorHoraEntrega;
    }

    public void setMelhorHoraEntrega(String melhorHoraEntrega) {
        this.melhorHoraEntrega = melhorHoraEntrega;
    }

    public String getControlaLimiteClientePorcentagem() {
        return controlaLimiteClientePorcentagem;
    }

    public void setControlaLimiteClientePorcentagem(String controlaLimiteClientePorcentagem) {
        this.controlaLimiteClientePorcentagem = controlaLimiteClientePorcentagem;
    }

    public BigDecimal getLimiteLiberarAcimaPercentual() {
        return limiteLiberarAcimaPercentual;
    }

    public void setLimiteLiberarAcimaPercentual(BigDecimal limiteLiberarAcimaPercentual) {
        this.limiteLiberarAcimaPercentual = limiteLiberarAcimaPercentual;
    }

    public String getCUF() {
        return cUF;
    }

    public void setCUF(String cUF) {
        this.cUF = cUF;
    }

    public String getPaisIbge() {
        return paisIbge;
    }

    public void setPaisIbge(String paisIbge) {
        this.paisIbge = paisIbge;
    }

    public Boolean getExtrangeiro() {
        return extrangeiro;
    }

    public void setExtrangeiro(Boolean extrangeiro) {
        this.extrangeiro = extrangeiro;
    }

    public Integer getVendedorID() {
        return vendedorID;
    }

    public void setVendedorID(Integer vendedorID) {
        this.vendedorID = vendedorID;
    }

    public String getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(String usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
    }

    public Date getUltimaAlteracao() {
        return ultimaAlteracao;
    }

    public void setUltimaAlteracao(Date ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }
    
    /*
    public List<Os> getOsList() {
        return osList;
    }

    public void setOsList(List<Os> osList) {
        this.osList = osList;
    }*/

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCliente != null ? idCliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idCliente == null && other.idCliente != null) || (this.idCliente != null && !this.idCliente.equals(other.idCliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Cliente[ idCliente=" + idCliente + " ]";
    }
    
}
