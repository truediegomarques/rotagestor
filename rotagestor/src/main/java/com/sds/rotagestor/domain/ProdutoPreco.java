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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "produto_preco")
public class ProdutoPreco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPRODUTO_PRECO")
    private Integer idPRODUTOPRECO;
    @Column(name = "IDPRODUTO")
    private int idproduto;
    @Basic(optional = false)
    @Column(name = "ID_LOJA")
    private int idLoja;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CUSTO")
    private BigDecimal custo;
    @Column(name = "CUSTO_MEDIO")
    private BigDecimal custoMedio;
    @Column(name = "CUSTO_REPOSICAO")
    private BigDecimal custoReposicao;
    @Column(name = "VENDA1")
    private BigDecimal venda1;
    @Column(name = "VENDA2")
    private BigDecimal venda2;
    @Column(name = "VENDA3")
    private BigDecimal venda3;
    @Column(name = "VENDA4")
    private BigDecimal venda4;
    @Column(name = "PRPROMOCAO")
    private BigDecimal prpromocao;
    @Column(name = "DTINICIOPROMO")
    @Temporal(TemporalType.DATE)
    private Date dtiniciopromo;
    @Column(name = "DTFINALPROMO")
    @Temporal(TemporalType.DATE)
    private Date dtfinalpromo;
    @Column(name = "CUSTO_ANTERIOR")
    private BigDecimal custoAnterior;
    @Column(name = "VENDA1_ANTERIOR")
    private BigDecimal venda1Anterior;
    @Column(name = "VENDA2_ANTERIOR")
    private BigDecimal venda2Anterior;
    @Column(name = "VENDA3_ANTERIOR")
    private BigDecimal venda3Anterior;
    @Column(name = "VENDA4_ANTERIOR")
    private BigDecimal venda4Anterior;
    @Column(name = "PRPROMOCAO_ANT")
    private BigDecimal prpromocaoAnt;
    @Column(name = "PRECO_PENDENTE_NF")
    private BigDecimal precoPendenteNf;
    @Column(name = "DATA_ULT_REAJUSTE")
    @Temporal(TemporalType.DATE)
    @JsonInclude(content = Include.NON_NULL)
    private Date dataUltReajuste;
    @Column(name = "Margem1Fixa")
    private BigDecimal margem1Fixa;
    @Column(name = "MARGEM")
    private BigDecimal margem;
    @Column(name = "MARGEM_ANT")
    private BigDecimal margemAnt;
    @Column(name = "IDFAMILIA")
    private Integer idfamilia;
    @Column(name = "FLAG_PROMOCAO")
    @JsonInclude(content = Include.NON_NULL)
    private String flagPromocao;
    @Column(name = "PENDENTE_NOTA")
    @JsonInclude(content = Include.NON_NULL)
    private Integer pendenteNota;
    @Column(name = "PENDENTE_FORNECEDOR")
    @JsonInclude(content = Include.NON_NULL)
    private Integer pendenteFornecedor;
    @Column(name = "PENDENTE")
    private String pendente;
    @Column(name = "custozero")
    private BigDecimal custozero;
    @Column(name = "Data_Reajuste_Etq")
    @Temporal(TemporalType.DATE)
    @JsonInclude(content = Include.NON_NULL)
    private Date dataReajusteEtq;
    @Column(name = "Margem2Fixa")
    private BigDecimal margem2Fixa;
    @Column(name = "MARGEM2")
    private BigDecimal margem2;
    @Column(name = "Margem3Fixa")
    private BigDecimal margem3Fixa;
    @Column(name = "MARGEM3")
    private BigDecimal margem3;
    @Column(name = "Margem4Fixa")
    private BigDecimal margem4Fixa;
    @Column(name = "MARGEM4")
    private BigDecimal margem4;
    @Column(name = "bonificacao")
    private String bonificacao;
    @Column(name = "usuario")
    @JsonInclude(content = Include.NON_NULL)
    private String usuario;
    @Column(name = "termvenda1")
    private BigDecimal termvenda1;
    @Column(name = "termvenda2")
    private BigDecimal termvenda2;
    @Column(name = "termvenda3")
    private BigDecimal termvenda3;
    @Column(name = "termvenda4")
    private BigDecimal termvenda4;
    @Column(name = "parcela")
    private Integer parcela;
    @Column(name = "valorparcela")
    private BigDecimal valorparcela;
    @Column(name = "desc_etiqueta")
    private BigDecimal descEtiqueta;
    @Column(name = "margem_praticada")
    private BigDecimal margemPraticada;
    @Column(name = "pmz")
    private BigDecimal pmz;
    @Column(name = "idproduto_formulapreco")
    private Integer idProdutoFormulaPreco;
    @Column(name = "idproduto_formulacusto")
    private Integer idProdutoFormulaCusto;
    @Column(name = "idproduto_formulapmz")
    private Integer idProdutoFormulaPMZ;
    @Column(name = "situacaoetq")
    private String situacaoEtq;
    @Column(name = "qtdeminimaprecoatacado")
    private BigDecimal qtdeMinimaPrecoAtacado;
    @Column(name = "qtdeminimaprecoespecial")
    private BigDecimal qtdeMinimaPrecoEspecial;
    @Column(name = "pendente_qtdeentrada")
    private BigDecimal pendenteqtdeEntrada;
    @Column(name = "usuario_nota")
    @JsonInclude(content = Include.NON_NULL)
    private String usuarioNota;
    @Column(name = "data_ult_venda")
    @Temporal(TemporalType.DATE)
    @JsonInclude(content = Include.NON_NULL)
    private Date dataUltVenda;
    @Column(name = "qtdemaximaporcupom")
    private BigDecimal qtdemaximaporcupom;
    @Column(name = "quantidadeetq")
    private Integer quantidadeEtq;

    public ProdutoPreco() {
    }

    public ProdutoPreco(Integer idPRODUTOPRECO) {
        this.idPRODUTOPRECO = idPRODUTOPRECO;
    }

    public ProdutoPreco(Integer idPRODUTOPRECO, int idproduto, int idLoja) {
        this.idPRODUTOPRECO = idPRODUTOPRECO;
        this.idproduto = idproduto;
        this.idLoja = idLoja;
    }

    public Integer getIdPRODUTOPRECO() {
        return idPRODUTOPRECO;
    }

    public void setIdPRODUTOPRECO(Integer idPRODUTOPRECO) {
        this.idPRODUTOPRECO = idPRODUTOPRECO;
    }

    public int getIdProduto() {
        return idproduto;
    }

    public void setIdProduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        this.custo = custo;
    }

    public BigDecimal getCustoMedio() {
        return custoMedio;
    }

    public void setCustoMedio(BigDecimal custoMedio) {
        this.custoMedio = custoMedio;
    }

    public BigDecimal getCustoReposicao() {
        return custoReposicao;
    }

    public void setCustoReposicao(BigDecimal custoReposicao) {
        this.custoReposicao = custoReposicao;
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

    public BigDecimal getPrpromocao() {
        return prpromocao;
    }

    public void setPrpromocao(BigDecimal prpromocao) {
        this.prpromocao = prpromocao;
    }

    public Date getDtiniciopromo() {
        return dtiniciopromo;
    }

    public void setDtiniciopromo(Date dtiniciopromo) {
        this.dtiniciopromo = dtiniciopromo;
    }

    public Date getDtfinalpromo() {
        return dtfinalpromo;
    }

    public void setDtfinalpromo(Date dtfinalpromo) {
        this.dtfinalpromo = dtfinalpromo;
    }

    public BigDecimal getCustoAnterior() {
        return custoAnterior;
    }

    public void setCustoAnterior(BigDecimal custoAnterior) {
        this.custoAnterior = custoAnterior;
    }

    public BigDecimal getVenda1Anterior() {
        return venda1Anterior;
    }

    public void setVenda1Anterior(BigDecimal venda1Anterior) {
        this.venda1Anterior = venda1Anterior;
    }

    public BigDecimal getVenda2Anterior() {
        return venda2Anterior;
    }

    public void setVenda2Anterior(BigDecimal venda2Anterior) {
        this.venda2Anterior = venda2Anterior;
    }

    public BigDecimal getVenda3Anterior() {
        return venda3Anterior;
    }

    public void setVenda3Anterior(BigDecimal venda3Anterior) {
        this.venda3Anterior = venda3Anterior;
    }

    public BigDecimal getVenda4Anterior() {
        return venda4Anterior;
    }

    public void setVenda4Anterior(BigDecimal venda4Anterior) {
        this.venda4Anterior = venda4Anterior;
    }

    public BigDecimal getPrpromocaoAnt() {
        return prpromocaoAnt;
    }

    public void setPrpromocaoAnt(BigDecimal prpromocaoAnt) {
        this.prpromocaoAnt = prpromocaoAnt;
    }

    public BigDecimal getPrecoPendenteNf() {
        return precoPendenteNf;
    }

    public void setPrecoPendenteNf(BigDecimal precoPendenteNf) {
        this.precoPendenteNf = precoPendenteNf;
    }

    public Date getDataUltReajuste() {
        return dataUltReajuste;
    }

    public void setDataUltReajuste(Date dataUltReajuste) {
        this.dataUltReajuste = dataUltReajuste;
    }

    public BigDecimal getMargem1Fixa() {
        return margem1Fixa;
    }

    public void setMargem1Fixa(BigDecimal margem1Fixa) {
        this.margem1Fixa = margem1Fixa;
    }

    public BigDecimal getMargem() {
        return margem;
    }

    public void setMargem(BigDecimal margem) {
        this.margem = margem;
    }

    public BigDecimal getMargemAnt() {
        return margemAnt;
    }

    public void setMargemAnt(BigDecimal margemAnt) {
        this.margemAnt = margemAnt;
    }

    public Integer getIdfamilia() {
        return idfamilia;
    }

    public void setIdfamilia(Integer idfamilia) {
        this.idfamilia = idfamilia;
    }

    public String getFlagPromocao() {
        return flagPromocao;
    }

    public void setFlagPromocao(String flagPromocao) {
        this.flagPromocao = flagPromocao;
    }

    public Integer getPendenteNota() {
        return pendenteNota;
    }

    public void setPendenteNota(Integer pendenteNota) {
        this.pendenteNota = pendenteNota;
    }

    public Integer getPendenteFornecedor() {
        return pendenteFornecedor;
    }

    public void setPendenteFornecedor(Integer pendenteFornecedor) {
        this.pendenteFornecedor = pendenteFornecedor;
    }

    public String getPendente() {
        return pendente;
    }

    public void setPendente(String pendente) {
        this.pendente = pendente;
    }

    public BigDecimal getCustozero() {
        return custozero;
    }

    public void setCustozero(BigDecimal custozero) {
        this.custozero = custozero;
    }

    public Date getDataReajusteEtq() {
        return dataReajusteEtq;
    }

    public void setDataReajusteEtq(Date dataReajusteEtq) {
        this.dataReajusteEtq = dataReajusteEtq;
    }

    public BigDecimal getMargem2Fixa() {
        return margem2Fixa;
    }

    public void setMargem2Fixa(BigDecimal margem2Fixa) {
        this.margem2Fixa = margem2Fixa;
    }

    public BigDecimal getMargem2() {
        return margem2;
    }

    public void setMargem2(BigDecimal margem2) {
        this.margem2 = margem2;
    }

    public BigDecimal getMargem3Fixa() {
        return margem3Fixa;
    }

    public void setMargem3Fixa(BigDecimal margem3Fixa) {
        this.margem3Fixa = margem3Fixa;
    }

    public BigDecimal getMargem3() {
        return margem3;
    }

    public void setMargem3(BigDecimal margem3) {
        this.margem3 = margem3;
    }

    public BigDecimal getMargem4Fixa() {
        return margem4Fixa;
    }

    public void setMargem4Fixa(BigDecimal margem4Fixa) {
        this.margem4Fixa = margem4Fixa;
    }

    public BigDecimal getMargem4() {
        return margem4;
    }

    public void setMargem4(BigDecimal margem4) {
        this.margem4 = margem4;
    }

    public String getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(String bonificacao) {
        this.bonificacao = bonificacao;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getTermvenda1() {
        return termvenda1;
    }

    public void setTermvenda1(BigDecimal termvenda1) {
        this.termvenda1 = termvenda1;
    }

    public BigDecimal getTermvenda2() {
        return termvenda2;
    }

    public void setTermvenda2(BigDecimal termvenda2) {
        this.termvenda2 = termvenda2;
    }

    public BigDecimal getTermvenda3() {
        return termvenda3;
    }

    public void setTermvenda3(BigDecimal termvenda3) {
        this.termvenda3 = termvenda3;
    }

    public BigDecimal getTermvenda4() {
        return termvenda4;
    }

    public void setTermvenda4(BigDecimal termvenda4) {
        this.termvenda4 = termvenda4;
    }

    public Integer getParcela() {
        return parcela;
    }

    public void setParcela(Integer parcela) {
        this.parcela = parcela;
    }

    public BigDecimal getValorparcela() {
        return valorparcela;
    }

    public void setValorparcela(BigDecimal valorparcela) {
        this.valorparcela = valorparcela;
    }

    public BigDecimal getDescEtiqueta() {
        return descEtiqueta;
    }

    public void setDescEtiqueta(BigDecimal descEtiqueta) {
        this.descEtiqueta = descEtiqueta;
    }

    public BigDecimal getMargemPraticada() {
        return margemPraticada;
    }

    public void setMargemPraticada(BigDecimal margemPraticada) {
        this.margemPraticada = margemPraticada;
    }

    public BigDecimal getPmz() {
        return pmz;
    }

    public void setPmz(BigDecimal pmz) {
        this.pmz = pmz;
    }

    public Integer getIdProdutoFormulaPreco() {
        return idProdutoFormulaPreco;
    }

    public void setIdProdutoFormulaPreco(Integer idProdutoFormulaPreco) {
        this.idProdutoFormulaPreco = idProdutoFormulaPreco;
    }

    public Integer getIdProdutoFormulaCusto() {
        return idProdutoFormulaCusto;
    }

    public void setIdProdutoFormulaCusto(Integer idProdutoFormulaCusto) {
        this.idProdutoFormulaCusto = idProdutoFormulaCusto;
    }

    public Integer getIdProdutoFormulaPMZ() {
        return idProdutoFormulaPMZ;
    }

    public void setIdProdutoFormulaPMZ(Integer idProdutoFormulaPMZ) {
        this.idProdutoFormulaPMZ = idProdutoFormulaPMZ;
    }

    public String getSituacaoEtq() {
        return situacaoEtq;
    }

    public void setSituacaoEtq(String situacaoEtq) {
        this.situacaoEtq = situacaoEtq;
    }

    public BigDecimal getQtdeMinimaPrecoAtacado() {
        return qtdeMinimaPrecoAtacado;
    }

    public void setQtdeMinimaPrecoAtacado(BigDecimal qtdeMinimaPrecoAtacado) {
        this.qtdeMinimaPrecoAtacado = qtdeMinimaPrecoAtacado;
    }

    public BigDecimal getQtdeMinimaPrecoEspecial() {
        return qtdeMinimaPrecoEspecial;
    }

    public void setQtdeMinimaPrecoEspecial(BigDecimal qtdeMinimaPrecoEspecial) {
        this.qtdeMinimaPrecoEspecial = qtdeMinimaPrecoEspecial;
    }

    public BigDecimal getPendenteqtdeEntrada() {
        return pendenteqtdeEntrada;
    }

    public void setPendenteqtdeEntrada(BigDecimal pendenteqtdeEntrada) {
        this.pendenteqtdeEntrada = pendenteqtdeEntrada;
    }

    public String getUsuarioNota() {
        return usuarioNota;
    }

    public void setUsuarioNota(String usuarioNota) {
        this.usuarioNota = usuarioNota;
    }

    public Date getDataUltVenda() {
        return dataUltVenda;
    }

    public void setDataUltVenda(Date dataUltVenda) {
        this.dataUltVenda = dataUltVenda;
    }

    public BigDecimal getQtdemaximaporcupom() {
        return qtdemaximaporcupom;
    }

    public void setQtdemaximaporcupom(BigDecimal qtdemaximaporcupom) {
        this.qtdemaximaporcupom = qtdemaximaporcupom;
    }

    public Integer getQuantidadeEtq() {
        return quantidadeEtq;
    }

    public void setQuantidadeEtq(Integer quantidadeEtq) {
        this.quantidadeEtq = quantidadeEtq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPRODUTOPRECO != null ? idPRODUTOPRECO.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoPreco)) {
            return false;
        }
        ProdutoPreco other = (ProdutoPreco) object;
        if ((this.idPRODUTOPRECO == null && other.idPRODUTOPRECO != null) || (this.idPRODUTOPRECO != null && !this.idPRODUTOPRECO.equals(other.idPRODUTOPRECO))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.ProdutoPreco[ idPRODUTOPRECO=" + idPRODUTOPRECO + " ]";
    }
    
}
