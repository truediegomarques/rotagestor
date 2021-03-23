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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author diego
 */
@Entity
@Table(name = "produto_estoque")

public class ProdutoEstoque implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproduto_estoque")
    private Integer idprodutoEstoque;
    @Basic(optional = false)
    @Column(name = "idproduto")
    private int idProduto;
    // @Max(value=?) @Min(value=?)//if you know range of your decimal fields
    // consider using these annotations to enforce field validation
    @Column(name = "estoque_atual")
    private BigDecimal estoqueAtual;
    @Column(name = "estoque_minimo")
    private BigDecimal estoqueMinimo;
    @Column(name = "estoque_congelado")
    private BigDecimal estoqueCongelado;
    @Column(name = "estoque_inventario")
    private BigDecimal estoqueInventario;
    @Column(name = "estoque_digitadoinv")
    private BigDecimal estoqueDigitadoinv;
    @Column(name = "inventario")
    private Integer inventario;
    @Column(name = "ultimo_inventario")
    private BigDecimal ultimoInventario;
    @Column(name = "data_inventario")
    @Temporal(TemporalType.DATE)
    private Date dataInventario;
    @Column(name = "estoque_anteriorinv")
    private BigDecimal estoqueAnteriorinv;
    @Column(name = "estoque_efetivo")
    private BigDecimal estoqueEfetivo;
    @Column(name = "custo_efetivo")
    private BigDecimal custoEfetivo;
    @Column(name = "estoque_conginv")
    private BigDecimal estoqueConginv;
    @Column(name = "data_congelado")
    @Temporal(TemporalType.DATE)
    private Date dataCongelado;
    @Column(name = "data_ultimo_congelado")
    @Temporal(TemporalType.DATE)
    private Date dataUltimoCongelado;
    @Basic(optional = false)
    @Column(name = "ID_LOJA")
    private int idLoja;
    @Column(name = "estoque_troca")
    private BigDecimal estoqueTroca;
    @Column(name = "congelado")
    private Integer congelado;
    @Column(name = "quebraestoque")
    private BigDecimal quebraEstoque;
    @Column(name = "pendente_entrada_compra")
    private BigDecimal pendenteEntradaCompra;
    @Column(name = "pendente_entrada_transferencia")
    private BigDecimal pendenteEntradaTransferencia;
    @Column(name = "pendente_saida_venda")
    private BigDecimal pendenteSaidaVenda;
    @Column(name = "pendente_saida_transferencia")
    private BigDecimal pendenteSaidaTransferencia;
    @Column(name = "pendente_entrada_solicitacao")
    private BigDecimal pendenteEntradaSolicitacao;
    @Column(name = "pendente_saida_solicitacao")
    private BigDecimal pendenteSaidaSolicitacao;
    @Column(name = "coberturaestoque")
    private Integer coberturaEstoque;
    @Column(name = "estoque_areavenda")
    private BigDecimal estoqueAreavenda;
    @Column(name = "estoque_congelado_area")
    private BigDecimal estoqueCongeladoArea;
    @Column(name = "estoque_inventario_area")
    private BigDecimal estoqueInventarioArea;
    @Column(name = "estoque_digitadoinv_area")
    private BigDecimal estoqueDigitadoinvArea;
    @Column(name = "ultimo_inventario_area")
    private BigDecimal ultimoInventarioArea;
    @Column(name = "data_inventario_area")
    @Temporal(TemporalType.DATE)
    private Date dataInventarioArea;
    @Column(name = "estoque_anteriorinv_area")
    private BigDecimal estoqueAnteriorinvArea;
    @Column(name = "custo_efetivo_area")
    private BigDecimal custoEfetivoArea;
    @Column(name = "estoque_conginv_area")
    private BigDecimal estoqueConginvArea;
    @Column(name = "data_congelado_area")
    private BigDecimal dataCongeladoArea;
    @Column(name = "data_ultimo_congelado_area")
    private BigDecimal dataUltimoCongeladoArea;
    @Column(name = "congelado_area")
    private Integer congeladoArea;
    @Column(name = "inventario_area")
    private Integer inventarioArea;
    @Column(name = "estoque_areavenda_qtdemaxima")
    private BigDecimal estoqueAreavendaQtdemaxima;
    @Column(name = "estoque_areavenda_qtdeminima")
    private BigDecimal estoqueAreavendaQtdeminima;

    public ProdutoEstoque() {
    }

    public ProdutoEstoque(Integer idprodutoEstoque) {
        this.idprodutoEstoque = idprodutoEstoque;
    }

    public ProdutoEstoque(Integer idprodutoEstoque, Integer idProduto, int idLoja) {
        this.idprodutoEstoque = idprodutoEstoque;
        this.idProduto = idProduto;
        this.idLoja = idLoja;
    }

    public Integer getIdprodutoEstoque() {
        return idprodutoEstoque;
    }

    public void setIdprodutoEstoque(Integer idprodutoEstoque) {
        this.idprodutoEstoque = idprodutoEstoque;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public BigDecimal getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(BigDecimal estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public BigDecimal getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(BigDecimal estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public BigDecimal getEstoqueCongelado() {
        return estoqueCongelado;
    }

    public void setEstoqueCongelado(BigDecimal estoqueCongelado) {
        this.estoqueCongelado = estoqueCongelado;
    }

    public BigDecimal getEstoqueInventario() {
        return estoqueInventario;
    }

    public void setEstoqueInventario(BigDecimal estoqueInventario) {
        this.estoqueInventario = estoqueInventario;
    }

    public BigDecimal getEstoqueDigitadoinv() {
        return estoqueDigitadoinv;
    }

    public void setEstoqueDigitadoinv(BigDecimal estoqueDigitadoinv) {
        this.estoqueDigitadoinv = estoqueDigitadoinv;
    }

    public Integer getInventario() {
        return inventario;
    }

    public void setInventario(Integer inventario) {
        this.inventario = inventario;
    }

    public BigDecimal getUltimoInventario() {
        return ultimoInventario;
    }

    public void setUltimoInventario(BigDecimal ultimoInventario) {
        this.ultimoInventario = ultimoInventario;
    }

    public Date getDataInventario() {
        return dataInventario;
    }

    public void setDataInventario(Date dataInventario) {
        this.dataInventario = dataInventario;
    }

    public BigDecimal getEstoqueAnteriorinv() {
        return estoqueAnteriorinv;
    }

    public void setEstoqueAnteriorinv(BigDecimal estoqueAnteriorinv) {
        this.estoqueAnteriorinv = estoqueAnteriorinv;
    }

    public BigDecimal getEstoqueEfetivo() {
        return estoqueEfetivo;
    }

    public void setEstoqueEfetivo(BigDecimal estoqueEfetivo) {
        this.estoqueEfetivo = estoqueEfetivo;
    }

    public BigDecimal getCustoEfetivo() {
        return custoEfetivo;
    }

    public void setCustoEfetivo(BigDecimal custoEfetivo) {
        this.custoEfetivo = custoEfetivo;
    }

    public BigDecimal getEstoqueConginv() {
        return estoqueConginv;
    }

    public void setEstoqueConginv(BigDecimal estoqueConginv) {
        this.estoqueConginv = estoqueConginv;
    }

    public Date getDataCongelado() {
        return dataCongelado;
    }

    public void setDataCongelado(Date dataCongelado) {
        this.dataCongelado = dataCongelado;
    }

    public Date getDataUltimoCongelado() {
        return dataUltimoCongelado;
    }

    public void setDataUltimoCongelado(Date dataUltimoCongelado) {
        this.dataUltimoCongelado = dataUltimoCongelado;
    }

    public int getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(int idLoja) {
        this.idLoja = idLoja;
    }

    public BigDecimal getEstoqueTroca() {
        return estoqueTroca;
    }

    public void setEstoqueTroca(BigDecimal estoqueTroca) {
        this.estoqueTroca = estoqueTroca;
    }

    public Integer getCongelado() {
        return congelado;
    }

    public void setCongelado(Integer congelado) {
        this.congelado = congelado;
    }

    public BigDecimal getQuebraEstoque() {
        return quebraEstoque;
    }

    public void setQuebraEstoque(BigDecimal quebraEstoque) {
        this.quebraEstoque = quebraEstoque;
    }

    public BigDecimal getPendenteEntradaCompra() {
        return pendenteEntradaCompra;
    }

    public void setPendenteEntradaCompra(BigDecimal pendenteEntradaCompra) {
        this.pendenteEntradaCompra = pendenteEntradaCompra;
    }

    public BigDecimal getPendenteEntradaTransferencia() {
        return pendenteEntradaTransferencia;
    }

    public void setPendenteEntradaTransferencia(BigDecimal pendenteEntradaTransferencia) {
        this.pendenteEntradaTransferencia = pendenteEntradaTransferencia;
    }

    public BigDecimal getPendenteSaidaVenda() {
        return pendenteSaidaVenda;
    }

    public void setPendenteSaidaVenda(BigDecimal pendenteSaidaVenda) {
        this.pendenteSaidaVenda = pendenteSaidaVenda;
    }

    public BigDecimal getPendenteSaidaTransferencia() {
        return pendenteSaidaTransferencia;
    }

    public void setPendenteSaidaTransferencia(BigDecimal pendenteSaidaTransferencia) {
        this.pendenteSaidaTransferencia = pendenteSaidaTransferencia;
    }

    public BigDecimal getPendenteEntradaSolicitacao() {
        return pendenteEntradaSolicitacao;
    }

    public void setPendenteEntradaSolicitacao(BigDecimal pendenteEntradaSolicitacao) {
        this.pendenteEntradaSolicitacao = pendenteEntradaSolicitacao;
    }

    public BigDecimal getPendenteSaidaSolicitacao() {
        return pendenteSaidaSolicitacao;
    }

    public void setPendenteSaidaSolicitacao(BigDecimal pendenteSaidaSolicitacao) {
        this.pendenteSaidaSolicitacao = pendenteSaidaSolicitacao;
    }

    public Integer getCoberturaEstoque() {
        return coberturaEstoque;
    }

    public void setCoberturaEstoque(Integer coberturaEstoque) {
        this.coberturaEstoque = coberturaEstoque;
    }

    public BigDecimal getEstoqueAreavenda() {
        return estoqueAreavenda;
    }

    public void setEstoqueAreavenda(BigDecimal estoqueAreavenda) {
        this.estoqueAreavenda = estoqueAreavenda;
    }

    public BigDecimal getEstoqueCongeladoArea() {
        return estoqueCongeladoArea;
    }

    public void setEstoqueCongeladoArea(BigDecimal estoqueCongeladoArea) {
        this.estoqueCongeladoArea = estoqueCongeladoArea;
    }

    public BigDecimal getEstoqueInventarioArea() {
        return estoqueInventarioArea;
    }

    public void setEstoqueInventarioArea(BigDecimal estoqueInventarioArea) {
        this.estoqueInventarioArea = estoqueInventarioArea;
    }

    public BigDecimal getEstoqueDigitadoinvArea() {
        return estoqueDigitadoinvArea;
    }

    public void setEstoqueDigitadoinvArea(BigDecimal estoqueDigitadoinvArea) {
        this.estoqueDigitadoinvArea = estoqueDigitadoinvArea;
    }

    public BigDecimal getUltimoInventarioArea() {
        return ultimoInventarioArea;
    }

    public void setUltimoInventarioArea(BigDecimal ultimoInventarioArea) {
        this.ultimoInventarioArea = ultimoInventarioArea;
    }

    public Date getDataInventarioArea() {
        return dataInventarioArea;
    }

    public void setDataInventarioArea(Date dataInventarioArea) {
        this.dataInventarioArea = dataInventarioArea;
    }

    public BigDecimal getEstoqueAnteriorinvArea() {
        return estoqueAnteriorinvArea;
    }

    public void setEstoqueAnteriorinvArea(BigDecimal estoqueAnteriorinvArea) {
        this.estoqueAnteriorinvArea = estoqueAnteriorinvArea;
    }

    public BigDecimal getCustoEfetivoArea() {
        return custoEfetivoArea;
    }

    public void setCustoEfetivoArea(BigDecimal custoEfetivoArea) {
        this.custoEfetivoArea = custoEfetivoArea;
    }

    public BigDecimal getEstoqueConginvArea() {
        return estoqueConginvArea;
    }

    public void setEstoqueConginvArea(BigDecimal estoqueConginvArea) {
        this.estoqueConginvArea = estoqueConginvArea;
    }

    public BigDecimal getDataCongeladoArea() {
        return dataCongeladoArea;
    }

    public void setDataCongeladoArea(BigDecimal dataCongeladoArea) {
        this.dataCongeladoArea = dataCongeladoArea;
    }

    public BigDecimal getDataUltimoCongeladoArea() {
        return dataUltimoCongeladoArea;
    }

    public void setDataUltimoCongeladoArea(BigDecimal dataUltimoCongeladoArea) {
        this.dataUltimoCongeladoArea = dataUltimoCongeladoArea;
    }

    public Integer getCongeladoArea() {
        return congeladoArea;
    }

    public void setCongeladoArea(Integer congeladoArea) {
        this.congeladoArea = congeladoArea;
    }

    public Integer getInventarioArea() {
        return inventarioArea;
    }

    public void setInventarioArea(Integer inventarioArea) {
        this.inventarioArea = inventarioArea;
    }

    public BigDecimal getEstoqueAreavendaQtdemaxima() {
        return estoqueAreavendaQtdemaxima;
    }

    public void setEstoqueAreavendaQtdemaxima(BigDecimal estoqueAreavendaQtdemaxima) {
        this.estoqueAreavendaQtdemaxima = estoqueAreavendaQtdemaxima;
    }

    public BigDecimal getEstoqueAreavendaQtdeminima() {
        return estoqueAreavendaQtdeminima;
    }

    public void setEstoqueAreavendaQtdeminima(BigDecimal estoqueAreavendaQtdeminima) {
        this.estoqueAreavendaQtdeminima = estoqueAreavendaQtdeminima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprodutoEstoque != null ? idprodutoEstoque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoEstoque)) {
            return false;
        }
        ProdutoEstoque other = (ProdutoEstoque) object;
        if ((this.idprodutoEstoque == null && other.idprodutoEstoque != null)
                || (this.idprodutoEstoque != null && !this.idprodutoEstoque.equals(other.idprodutoEstoque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rotagestor.engreverse.ProdutoEstoque[ idprodutoEstoque=" + idprodutoEstoque + " ]";
    }

}
