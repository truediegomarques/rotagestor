package com.sds.rotagestor.domain;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "produto")
@NamedQueries({
    @NamedQuery(name = "Produto.findByEan", query = "SELECT p FROM Produto p WHERE p.ean = :ean")
    })
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto")
    private Integer idProduto;
    @Column(name = "sittrib")
    private Integer sitTrib;
    // @Max(value=?) @Min(value=?)//if you know range of your decimal fields
    // consider using these annotations to enforce field validation
    @Column(name = "Cofins")
    private BigDecimal cofins;
    @Column(name = "Pis")
    private BigDecimal pis;
    @Column(name = "Icms")
    private BigDecimal icms;
    @Column(name = "Ipi")
    private BigDecimal ipi;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "descrred")
    private String descrRed;
    @Column(name = "embentra")
    private BigDecimal embEntra;
    @Column(name = "embsaida")
    private BigDecimal embSaida;
    @Column(name = "unidentra")
    private String unidEntra;
    @Column(name = "unidsaida")
    private String unidSaida;
    @Column(name = "pesoproduto")
    private BigDecimal pesoProduto;
    @Column(name = "baixarqtdesaida")
    private Boolean baixarQtdeSaida;
    @Lob
    @Column(name = "Obs", length = 65535, columnDefinition = "TEXT")
    @Type(type = "text")
    private String obs;
    @Column(name = "Custo")
    private BigDecimal custo;
    @Column(name = "Venda1")
    private BigDecimal venda1;
    @Column(name = "Venda2")
    private BigDecimal venda2;
    @Column(name = "Venda3")
    private BigDecimal venda3;
    @Column(name = "Venda4")
    private BigDecimal venda4;
    @Column(name = "Margem")
    private BigDecimal margem;
    @Column(name = "Validade")
    private String validade;
    @Column(name = "Referencia")
    private Long referencia;
    @Column(name = "idgrupo")
    private Integer idGrupo;
    @Column(name = "idsubgrupo")
    private Integer idSubGrupo;
    @ManyToOne
    @JoinColumn(name = "idsubgrupo1")
    private SubGrupo1 subGrupo1;
    @Column(name = "idsituacao")
    private Integer idSituacao;
    @Column(name = "dtcadastro")
    @Temporal(TemporalType.DATE)
    private Date dtCadastro;
    @Column(name = "estmin")
    private BigDecimal estMin;
    @Column(name = "estmax")
    private BigDecimal estMax;
    @Column(name = "pesovariavel")
    private String pesoVariavel;
    @Column(name = "etiqueta")
    private String etiqueta;
    @Column(name = "plu")
    private Long plu;
    @Column(name = "Ean")
    private Long ean;
    @Column(name = "codassociado")
    private Long codAssociado;
    @Column(name = "classfiscal")
    private String classFiscal;
    @Column(name = "Iva")
    private BigDecimal iva;
    @Column(name = "redbase")
    private BigDecimal redBase;
    @Column(name = "codtrib")
    private String codTrib;
    @Column(name = "Vasilhame")
    private String vasilhame;
    @Column(name = "Tipo")
    private String tipo;
    @Lob
    @Column(name = "infadicional", length = 65535, columnDefinition = "TEXT")
    @Type(type = "text")
    private String infAdicional;
    @Column(name = "ean1")
    private String ean1;
    @Column(name = "prpromocao")
    private BigDecimal prPromocao;
    @Column(name = "dtiniciopromo")
    @Temporal(TemporalType.DATE)
    private Date dtInicioPromo;
    @Column(name = "dtfinalpromo")
    @Temporal(TemporalType.DATE)
    private Date dtFinalPromo;
    @Column(name = "formula")
    private String formula;
    @Column(name = "multiplicador")
    private String multiplicador;
    @Column(name = "vinculado")
    private String vinculado;
    @Column(name = "idfamilia")
    private Integer idFamilia;
    @Column(name = "tipoprod")
    private String tipoProd;
    @Column(name = "origemprod")
    private String origemProd;
    @Column(name = "tabicmsprod")
    private String tabIcmsProd;
    @Column(name = "expentrnf")
    private String expEntrNF;
    @Column(name = "tipopiscofins")
    private String tipoPisCofins;
    @Column(name = "sittribcompra")
    private Integer sitTribCompra;
    @Column(name = "icmscompra")
    private BigDecimal icmsCompra;
    @Column(name = "redbasevenda")
    private BigDecimal redBaseVenda;
    @Column(name = "CST_PIS")
    private String cstPis;
    @Column(name = "CCS_Apurada")
    private String cCSApurada;
    @Column(name = "idfabricante")
    private Integer idFabricante;
    @Column(name = "idtabelanutricao")
    private Integer idTabelaNutricao;
    @Column(name = "CST_PIS_SAIDA")
    private String cstPisSaida;
    @Column(name = "tabicmsprodentrada")
    private String tabIcmsProdEntrada;
    @Column(name = "pisentrada")
    private BigDecimal pisEntrada;
    @Column(name = "cofinsentrada")
    private BigDecimal cofinsEntrada;
    @Column(name = "multiplos")
    private Integer multiplos;
    @Column(name = "qtde_x")
    private String qtdeX;
    @Column(name = "qtde_y")
    private String qtdeY;
    @Column(name = "nat_receita")
    private String natReceita;
    @Column(name = "descricaoetq")
    private String descricaoetq;
    @Column(name = "bloqueiaprodcompra")
    private String bloqueiaprodcompra;
    @Column(name = "id_enderecoprod")
    private Integer idEnderecoprod;
    @Column(name = "produto_producao")
    private String produtoProducao;
    @Column(name = "bloqueiavenda")
    private String bloqueiavenda;
    @Column(name = "permitedesconto")
    private String permitedesconto;
    @Column(name = "pededescricaocomp")
    private String pededescricaocomp;
    @Column(name = "idproduto_Similar")
    private Integer idProdutoSimilar;
    @Column(name = "idproduto_Complemento")
    private Integer idProdutoComplemento;
    @Column(name = "pedesenha")
    private String pedeSenha;
    @Column(name = "produtovinculado")
    private String produtoVinculado;
    @Column(name = "alteraprecopdv")
    private String alteraprecopdv;
    @Column(name = "prod_sazonal")
    private String prodSazonal;
    @Column(name = "cst_ipi_saida")
    private String cstIpiSaida;
    @Column(name = "cst_ipi_entrada")
    private String cstIpiEntrada;
    @Column(name = "cargatributaria")
    private BigDecimal cargaTributaria;
    @Column(name = "vende_qtdevariavel")
    private String vendeqtdeVariavel;
    @Column(name = "pede_numeroserie")
    private String pedeNumeroserie;
    @Column(name = "calculaivaajustado")
    private String calculaIvaAjustado;
    @Column(name = "local_impressora")
    private String localImpressora;
    @Column(name = "pede_imei")
    private String pedeImei;
    @Column(name = "pede_sid")
    private String pedeSid;
    @Column(name = "idcomprador")
    private Integer idComprador;
    @Column(name = "coberturaestoque")
    private Integer coberturaestoque;
    @Column(name = "setorbalanca")
    private String setorBalanca;
    @Column(name = "nomesetorbalanca")
    private String nomesetorbalanca;
    @Column(name = "geraestoque")
    private String geraestoque;
    @Column(name = "idproduto_pretara")
    private Integer idprodutoPretara;
    @Column(name = "teclabalanca")
    private Integer teclabalanca;
    @Column(name = "rebaixopreco")
    private String rebaixopreco;
    @Column(name = "cargatributariafederal")
    private BigDecimal cargaTributariaFederal;
    @Column(name = "chaveNCM")
    private String chaveNCM;
    @Column(name = "iat")
    private String iat;
    @Column(name = "ippt")
    private String ippt;
    @Column(name = "curva_faturamento")
    private String curvaFaturamento;
    @Column(name = "curva_quantidade")
    private String curvaQuantidade;
    @Column(name = "curva_rentabilidade")
    private String curvaRentabilidade;
    @Column(name = "curva_grupo_fat")
    private String curvaGrupoFat;
    @Column(name = "curva_subgrupo_fat")
    private String curvaSubgrupoFat;
    @Column(name = "curva_subgrupo1_fat")
    private String curvaSubgrupo1Fat;
    @Column(name = "curva_grupo_rent")
    private String curvaGrupoRent;
    @Column(name = "curva_subgrupo_rent")
    private String curvaSubgrupoRent;
    @Column(name = "curva_subgrupo1_rent")
    private String curvaSubgrupo1Rent;
    @Column(name = "curva_grupo_quant")
    private String curvaGrupoQuant;
    @Column(name = "curva_subgrupo_quant")
    private String curvaSubgrupoQuant;
    @Column(name = "curva_subgrupo1_quant")
    private String curvaSubgrupo1Quant;
    @Column(name = "consignado")
    private String consignado;
    @Column(name = "produtowtr")
    private String produtoWTR;
    @Column(name = "tempo_preparo")
    private Integer tempoPreparo;
    @Column(name = "pedir_rg")
    private String pedirRg;
    @Column(name = "produto_pesquisa")
    private String produtoPesquisa;
    @Column(name = "produto_cotacao")
    private String produtoCotacao;
    @Column(name = "comissao")
    private BigDecimal comissao;
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Column(name = "cest")
    private String cest;
    @Column(name = "fecoep")
    private BigDecimal fecoep;
    @Lob
    @Column(name = "fotofullhd")
    private byte[] fotoFullHD;
    @Basic(optional = false)
    @Column(name = "servico", columnDefinition = "TINYINT(4)")
    private Integer servico;
    @Column(name = "comissaohabilitar")
    private Boolean comissaohabilitar;
    @Column(name = "enviarparasite")
    private Boolean enviarparasite;
    @Column(name = "usuario_alteracao")
    private String usuarioAlteracao;
    @Column(name = "ultima_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ultimaAlteracao;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idproduto")
    private List<ProdutoEstoque> estoque;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "idPRODUTO_PRECO")
    private List<ProdutoPreco> preco;

    public Produto() {
    }

    public Produto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Produto(Integer idProduto, Integer servico) {
        this.idProduto = idProduto;
        this.servico = servico;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getSitTrib() {
        return sitTrib;
    }

    public void setSitTrib(Integer sitTrib) {
        this.sitTrib = sitTrib;
    }

    public BigDecimal getCofins() {
        return cofins;
    }

    public void setCofins(BigDecimal cofins) {
        this.cofins = cofins;
    }

    public BigDecimal getPis() {
        return pis;
    }

    public void setPis(BigDecimal pis) {
        this.pis = pis;
    }

    public BigDecimal getIcms() {
        return icms;
    }

    public void setIcms(BigDecimal icms) {
        this.icms = icms;
    }

    public BigDecimal getIpi() {
        return ipi;
    }

    public void setIpi(BigDecimal ipi) {
        this.ipi = ipi;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescrRed() {
        return descrRed;
    }

    public void setDescrRed(String descrRed) {
        this.descrRed = descrRed;
    }

    public BigDecimal getEmbEntra() {
        return embEntra;
    }

    public void setEmbEntra(BigDecimal embEntra) {
        this.embEntra = embEntra;
    }

    public BigDecimal getEmbSaida() {
        return embSaida;
    }

    public void setEmbSaida(BigDecimal embSaida) {
        this.embSaida = embSaida;
    }

    public String getUnidEntra() {
        return unidEntra;
    }

    public void setUnidEntra(String unidEntra) {
        this.unidEntra = unidEntra;
    }

    public String getUnidSaida() {
        return unidSaida;
    }

    public void setUnidSaida(String unidSaida) {
        this.unidSaida = unidSaida;
    }

    public BigDecimal getPesoProduto() {
        return pesoProduto;
    }

    public void setPesoProduto(BigDecimal pesoProduto) {
        this.pesoProduto = pesoProduto;
    }

    public Boolean getBaixarQtdeSaida() {
        return baixarQtdeSaida;
    }

    public void setBaixarQtdeSaida(Boolean baixarQtdeSaida) {
        this.baixarQtdeSaida = baixarQtdeSaida;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    public BigDecimal getVenda1() {
        return venda1;
    }

    public void setVenda1(BigDecimal venda1) {
        this.venda1 = venda1;
    }

    public BigDecimal getVenda2() {
        return venda2;
    }

    public void setVenda2(BigDecimal venda2) {
        this.venda2 = venda2;
    }

    public BigDecimal getVenda3() {
        return venda3;
    }

    public void setVenda3(BigDecimal venda3) {
        this.venda3 = venda3;
    }

    public BigDecimal getVenda4() {
        return venda4;
    }

    public void setVenda4(BigDecimal venda4) {
        this.venda4 = venda4;
    }

    public BigDecimal getMargem() {
        return margem;
    }

    public void setMargem(BigDecimal margem) {
        this.margem = margem;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }

    public Long getReferencia() {
        return referencia;
    }

    public void setReferencia(Long referencia) {
        this.referencia = referencia;
    }

    public Integer getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(Integer idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Integer getIdSubGrupo() {
        return idSubGrupo;
    }

    public void setIdSubGrupo(Integer idSubGrupo) {
        this.idSubGrupo = idSubGrupo;
    }

    public SubGrupo1 getSubGrupo1() {
        return subGrupo1;
    }

    public void setSubGrupo1(SubGrupo1 subGrupo1) {
        this.subGrupo1 = subGrupo1;
    }

    public Integer getIdSituacao() {
        return idSituacao;
    }

    public void setIdSituacao(Integer idSituacao) {
        this.idSituacao = idSituacao;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public BigDecimal getEstMin() {
        return estMin;
    }

    public void setEstMin(BigDecimal estMin) {
        this.estMin = estMin;
    }

    public BigDecimal getEstMax() {
        return estMax;
    }

    public void setEstMax(BigDecimal estMax) {
        this.estMax = estMax;
    }

    public String getPesoVariavel() {
        return pesoVariavel;
    }

    public void setPesoVariavel(String pesoVariavel) {
        this.pesoVariavel = pesoVariavel;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Long getPlu() {
        return plu;
    }

    public void setPlu(Long plu) {
        this.plu = plu;
    }

    public Long getEan() {
        return ean;
    }

    public void setEan(Long ean) {
        this.ean = ean;
    }

    public Long getCodAssociado() {
        return codAssociado;
    }

    public void setCodAssociado(Long codAssociado) {
        this.codAssociado = codAssociado;
    }

    public String getClassFiscal() {
        return classFiscal;
    }

    public void setClassFiscal(String classFiscal) {
        this.classFiscal = classFiscal;
    }

    public BigDecimal getIva() {
        return iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public BigDecimal getRedBase() {
        return redBase;
    }

    public void setRedBase(BigDecimal redBase) {
        this.redBase = redBase;
    }

    public String getCodTrib() {
        return codTrib;
    }

    public void setCodTrib(String codTrib) {
        this.codTrib = codTrib;
    }

    public String getVasilhame() {
        return vasilhame;
    }

    public void setVasilhame(String vasilhame) {
        this.vasilhame = vasilhame;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getInfAdicional() {
        return infAdicional;
    }

    public void setInfAdicional(String infAdicional) {
        this.infAdicional = infAdicional;
    }

    public String getEan1() {
        return ean1;
    }

    public void setEan1(String ean1) {
        this.ean1 = ean1;
    }

    public BigDecimal getPrPromocao() {
        return prPromocao;
    }

    public void setPrPromocao(BigDecimal prPromocao) {
        this.prPromocao = prPromocao;
    }

    public Date getDtInicioPromo() {
        return dtInicioPromo;
    }

    public void setDtInicioPromo(Date dtInicioPromo) {
        this.dtInicioPromo = dtInicioPromo;
    }

    public Date getDtFinalPromo() {
        return dtFinalPromo;
    }

    public void setDtFinalPromo(Date dtFinalPromo) {
        this.dtFinalPromo = dtFinalPromo;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    public String getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(String multiplicador) {
        this.multiplicador = multiplicador;
    }

    public String getVinculado() {
        return vinculado;
    }

    public void setVinculado(String vinculado) {
        this.vinculado = vinculado;
    }

    public Integer getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Integer idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public String getOrigemProd() {
        return origemProd;
    }

    public void setOrigemProd(String origemProd) {
        this.origemProd = origemProd;
    }

    public String getTabIcmsProd() {
        return tabIcmsProd;
    }

    public void setTabIcmsProd(String tabIcmsProd) {
        this.tabIcmsProd = tabIcmsProd;
    }

    public String getExpEntrNF() {
        return expEntrNF;
    }

    public void setExpEntrNF(String expEntrNF) {
        this.expEntrNF = expEntrNF;
    }

    public String getTipoPisCofins() {
        return tipoPisCofins;
    }

    public void setTipoPisCofins(String tipoPisCofins) {
        this.tipoPisCofins = tipoPisCofins;
    }

    public Integer getSitTribCompra() {
        return sitTribCompra;
    }

    public void setSitTribCompra(Integer sitTribCompra) {
        this.sitTribCompra = sitTribCompra;
    }

    public BigDecimal getIcmsCompra() {
        return icmsCompra;
    }

    public void setIcmsCompra(BigDecimal icmsCompra) {
        this.icmsCompra = icmsCompra;
    }

    public BigDecimal getRedBaseVenda() {
        return redBaseVenda;
    }

    public void setRedBaseVenda(BigDecimal redBaseVenda) {
        this.redBaseVenda = redBaseVenda;
    }

    public String getCstPis() {
        return cstPis;
    }

    public void setCstPis(String cstPis) {
        this.cstPis = cstPis;
    }

    public String getCCSApurada() {
        return cCSApurada;
    }

    public void setCCSApurada(String cCSApurada) {
        this.cCSApurada = cCSApurada;
    }

    public Integer getIdFabricante() {
        return idFabricante;
    }

    public void setIdFabricante(Integer idFabricante) {
        this.idFabricante = idFabricante;
    }

    public Integer getIdTabelaNutricao() {
        return idTabelaNutricao;
    }

    public void setIdTabelaNutricao(Integer idTabelaNutricao) {
        this.idTabelaNutricao = idTabelaNutricao;
    }

    public String getCstPisSaida() {
        return cstPisSaida;
    }

    public void setCstPisSaida(String cstPisSaida) {
        this.cstPisSaida = cstPisSaida;
    }

    public String getTabIcmsProdEntrada() {
        return tabIcmsProdEntrada;
    }

    public void setTabIcmsProdEntrada(String tabIcmsProdEntrada) {
        this.tabIcmsProdEntrada = tabIcmsProdEntrada;
    }

    public BigDecimal getPisEntrada() {
        return pisEntrada;
    }

    public void setPisEntrada(BigDecimal pisEntrada) {
        this.pisEntrada = pisEntrada;
    }

    public BigDecimal getCofinsEntrada() {
        return cofinsEntrada;
    }

    public void setCofinsEntrada(BigDecimal cofinsEntrada) {
        this.cofinsEntrada = cofinsEntrada;
    }

    public Integer getMultiplos() {
        return multiplos;
    }

    public void setMultiplos(Integer multiplos) {
        this.multiplos = multiplos;
    }

    public String getQtdeX() {
        return qtdeX;
    }

    public void setQtdeX(String qtdeX) {
        this.qtdeX = qtdeX;
    }

    public String getQtdeY() {
        return qtdeY;
    }

    public void setQtdeY(String qtdeY) {
        this.qtdeY = qtdeY;
    }

    public String getNatReceita() {
        return natReceita;
    }

    public void setNatReceita(String natReceita) {
        this.natReceita = natReceita;
    }

    public String getDescricaoetq() {
        return descricaoetq;
    }

    public void setDescricaoetq(String descricaoetq) {
        this.descricaoetq = descricaoetq;
    }

    public String getBloqueiaprodcompra() {
        return bloqueiaprodcompra;
    }

    public void setBloqueiaprodcompra(String bloqueiaprodcompra) {
        this.bloqueiaprodcompra = bloqueiaprodcompra;
    }

    public Integer getIdEnderecoprod() {
        return idEnderecoprod;
    }

    public void setIdEnderecoprod(Integer idEnderecoprod) {
        this.idEnderecoprod = idEnderecoprod;
    }

    public String getProdutoProducao() {
        return produtoProducao;
    }

    public void setProdutoProducao(String produtoProducao) {
        this.produtoProducao = produtoProducao;
    }

    public String getBloqueiavenda() {
        return bloqueiavenda;
    }

    public void setBloqueiavenda(String bloqueiavenda) {
        this.bloqueiavenda = bloqueiavenda;
    }

    public String getPermitedesconto() {
        return permitedesconto;
    }

    public void setPermitedesconto(String permitedesconto) {
        this.permitedesconto = permitedesconto;
    }

    public String getPededescricaocomp() {
        return pededescricaocomp;
    }

    public void setPededescricaocomp(String pededescricaocomp) {
        this.pededescricaocomp = pededescricaocomp;
    }

    public Integer getIdProdutoSimilar() {
        return idProdutoSimilar;
    }

    public void setIdProdutoSimilar(Integer idProdutoSimilar) {
        this.idProdutoSimilar = idProdutoSimilar;
    }

    public Integer getIdProdutoComplemento() {
        return idProdutoComplemento;
    }

    public void setIdProdutoComplemento(Integer idProdutoComplemento) {
        this.idProdutoComplemento = idProdutoComplemento;
    }

    public String getPedeSenha() {
        return pedeSenha;
    }

    public void setPedeSenha(String pedeSenha) {
        this.pedeSenha = pedeSenha;
    }

    public String getProdutoVinculado() {
        return produtoVinculado;
    }

    public void setProdutoVinculado(String produtoVinculado) {
        this.produtoVinculado = produtoVinculado;
    }

    public String getAlteraprecopdv() {
        return alteraprecopdv;
    }

    public void setAlteraprecopdv(String alteraprecopdv) {
        this.alteraprecopdv = alteraprecopdv;
    }

    public String getProdSazonal() {
        return prodSazonal;
    }

    public void setProdSazonal(String prodSazonal) {
        this.prodSazonal = prodSazonal;
    }

    public String getCstIpiSaida() {
        return cstIpiSaida;
    }

    public void setCstIpiSaida(String cstIpiSaida) {
        this.cstIpiSaida = cstIpiSaida;
    }

    public String getCstIpiEntrada() {
        return cstIpiEntrada;
    }

    public void setCstIpiEntrada(String cstIpiEntrada) {
        this.cstIpiEntrada = cstIpiEntrada;
    }

    public BigDecimal getCargaTributaria() {
        return cargaTributaria;
    }

    public void setCargaTributaria(BigDecimal cargaTributaria) {
        this.cargaTributaria = cargaTributaria;
    }

    public String getVendeqtdeVariavel() {
        return vendeqtdeVariavel;
    }

    public void setVendeqtdeVariavel(String vendeqtdeVariavel) {
        this.vendeqtdeVariavel = vendeqtdeVariavel;
    }

    public String getPedeNumeroserie() {
        return pedeNumeroserie;
    }

    public void setPedeNumeroserie(String pedeNumeroserie) {
        this.pedeNumeroserie = pedeNumeroserie;
    }

    public String getCalculaIvaAjustado() {
        return calculaIvaAjustado;
    }

    public void setCalculaIvaAjustado(String calculaIvaAjustado) {
        this.calculaIvaAjustado = calculaIvaAjustado;
    }

    public String getLocalImpressora() {
        return localImpressora;
    }

    public void setLocalImpressora(String localImpressora) {
        this.localImpressora = localImpressora;
    }

    public String getPedeImei() {
        return pedeImei;
    }

    public void setPedeImei(String pedeImei) {
        this.pedeImei = pedeImei;
    }

    public String getPedeSid() {
        return pedeSid;
    }

    public void setPedeSid(String pedeSid) {
        this.pedeSid = pedeSid;
    }

    public Integer getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Integer idComprador) {
        this.idComprador = idComprador;
    }

    public Integer getCoberturaestoque() {
        return coberturaestoque;
    }

    public void setCoberturaestoque(Integer coberturaestoque) {
        this.coberturaestoque = coberturaestoque;
    }

    public String getSetorBalanca() {
        return setorBalanca;
    }

    public void setSetorBalanca(String setorBalanca) {
        this.setorBalanca = setorBalanca;
    }

    public String getNomesetorbalanca() {
        return nomesetorbalanca;
    }

    public void setNomesetorbalanca(String nomesetorbalanca) {
        this.nomesetorbalanca = nomesetorbalanca;
    }

    public String getGeraestoque() {
        return geraestoque;
    }

    public void setGeraestoque(String geraestoque) {
        this.geraestoque = geraestoque;
    }

    public Integer getIdprodutoPretara() {
        return idprodutoPretara;
    }

    public void setIdprodutoPretara(Integer idprodutoPretara) {
        this.idprodutoPretara = idprodutoPretara;
    }

    public Integer getTeclabalanca() {
        return teclabalanca;
    }

    public void setTeclabalanca(Integer teclabalanca) {
        this.teclabalanca = teclabalanca;
    }

    public String getRebaixopreco() {
        return rebaixopreco;
    }

    public void setRebaixopreco(String rebaixopreco) {
        this.rebaixopreco = rebaixopreco;
    }

    public BigDecimal getCargaTributariaFederal() {
        return cargaTributariaFederal;
    }

    public void setCargaTributariaFederal(BigDecimal cargaTributariaFederal) {
        this.cargaTributariaFederal = cargaTributariaFederal;
    }

    public String getChaveNCM() {
        return chaveNCM;
    }

    public void setChaveNCM(String chaveNCM) {
        this.chaveNCM = chaveNCM;
    }

    public String getIat() {
        return iat;
    }

    public void setIat(String iat) {
        this.iat = iat;
    }

    public String getIppt() {
        return ippt;
    }

    public void setIppt(String ippt) {
        this.ippt = ippt;
    }

    public String getCurvaFaturamento() {
        return curvaFaturamento;
    }

    public void setCurvaFaturamento(String curvaFaturamento) {
        this.curvaFaturamento = curvaFaturamento;
    }

    public String getCurvaQuantidade() {
        return curvaQuantidade;
    }

    public void setCurvaQuantidade(String curvaQuantidade) {
        this.curvaQuantidade = curvaQuantidade;
    }

    public String getCurvaRentabilidade() {
        return curvaRentabilidade;
    }

    public void setCurvaRentabilidade(String curvaRentabilidade) {
        this.curvaRentabilidade = curvaRentabilidade;
    }

    public String getCurvaGrupoFat() {
        return curvaGrupoFat;
    }

    public void setCurvaGrupoFat(String curvaGrupoFat) {
        this.curvaGrupoFat = curvaGrupoFat;
    }

    public String getCurvaSubgrupoFat() {
        return curvaSubgrupoFat;
    }

    public void setCurvaSubgrupoFat(String curvaSubgrupoFat) {
        this.curvaSubgrupoFat = curvaSubgrupoFat;
    }

    public String getCurvaSubgrupo1Fat() {
        return curvaSubgrupo1Fat;
    }

    public void setCurvaSubgrupo1Fat(String curvaSubgrupo1Fat) {
        this.curvaSubgrupo1Fat = curvaSubgrupo1Fat;
    }

    public String getCurvaGrupoRent() {
        return curvaGrupoRent;
    }

    public void setCurvaGrupoRent(String curvaGrupoRent) {
        this.curvaGrupoRent = curvaGrupoRent;
    }

    public String getCurvaSubgrupoRent() {
        return curvaSubgrupoRent;
    }

    public void setCurvaSubgrupoRent(String curvaSubgrupoRent) {
        this.curvaSubgrupoRent = curvaSubgrupoRent;
    }

    public String getCurvaSubgrupo1Rent() {
        return curvaSubgrupo1Rent;
    }

    public void setCurvaSubgrupo1Rent(String curvaSubgrupo1Rent) {
        this.curvaSubgrupo1Rent = curvaSubgrupo1Rent;
    }

    public String getCurvaGrupoQuant() {
        return curvaGrupoQuant;
    }

    public void setCurvaGrupoQuant(String curvaGrupoQuant) {
        this.curvaGrupoQuant = curvaGrupoQuant;
    }

    public String getCurvaSubgrupoQuant() {
        return curvaSubgrupoQuant;
    }

    public void setCurvaSubgrupoQuant(String curvaSubgrupoQuant) {
        this.curvaSubgrupoQuant = curvaSubgrupoQuant;
    }

    public String getCurvaSubgrupo1Quant() {
        return curvaSubgrupo1Quant;
    }

    public void setCurvaSubgrupo1Quant(String curvaSubgrupo1Quant) {
        this.curvaSubgrupo1Quant = curvaSubgrupo1Quant;
    }

    public String getConsignado() {
        return consignado;
    }

    public void setConsignado(String consignado) {
        this.consignado = consignado;
    }

    public String getProdutoWTR() {
        return produtoWTR;
    }

    public void setProdutoWTR(String produtoWTR) {
        this.produtoWTR = produtoWTR;
    }

    public Integer getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(Integer tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public String getPedirRg() {
        return pedirRg;
    }

    public void setPedirRg(String pedirRg) {
        this.pedirRg = pedirRg;
    }

    public String getProdutoPesquisa() {
        return produtoPesquisa;
    }

    public void setProdutoPesquisa(String produtoPesquisa) {
        this.produtoPesquisa = produtoPesquisa;
    }

    public String getProdutoCotacao() {
        return produtoCotacao;
    }

    public void setProdutoCotacao(String produtoCotacao) {
        this.produtoCotacao = produtoCotacao;
    }

    public BigDecimal getComissao() {
        return comissao;
    }

    public void setComissao(BigDecimal comissao) {
        this.comissao = comissao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public BigDecimal getFecoep() {
        return fecoep;
    }

    public void setFecoep(BigDecimal fecoep) {
        this.fecoep = fecoep;
    }

    public byte[] getFotoFullHD() {
        return fotoFullHD;
    }

    public void setFotoFullHD(byte[] fotoFullHD) {
        this.fotoFullHD = fotoFullHD;
    }

    public Integer getServico() {
        return servico;
    }

    public void setServico(Integer servico) {
        this.servico = servico;
    }

    public Boolean getComissaohabilitar() {
        return comissaohabilitar;
    }

    public void setComissaohabilitar(Boolean comissaohabilitar) {
        this.comissaohabilitar = comissaohabilitar;
    }

    public Boolean getEnviarparasite() {
        return enviarparasite;
    }

    public void setEnviarparasite(Boolean enviarparasite) {
        this.enviarparasite = enviarparasite;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProduto != null ? idProduto.hashCode() : 0);
        return hash;
    }

    public List<ProdutoEstoque> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<ProdutoEstoque> estoque) {
        this.estoque = estoque;
    }

    public List<ProdutoPreco> getPreco() {
        return preco;
    }

    public void setPreco(List<ProdutoPreco> preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.idProduto == null && other.idProduto != null)
                || (this.idProduto != null && !this.idProduto.equals(other.idProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.Produto[ idProduto=" + idProduto + " ]";
    }

}
