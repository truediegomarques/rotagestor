
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
@Table(name = "itensvenda")

public class Itensvenda implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "iditensvenda")
	private Integer idItensVenda;
	@Column(name = "cupom")
	private Integer cupom;
	@Column(name = "codigoean")
	private Long codigoEan;
	// @Max(value=?) @Min(value=?)//if you know range of your decimal fields
	// consider using these annotations to enforce field validation
	@Column(name = "valor")
	private BigDecimal valor;
	@Column(name = "quantidade")
	private BigDecimal quantidade;
	@Column(name = "quantidadesaida")
	private BigDecimal quantidadeSaida;
	@Column(name = "codigoeandigitado")
	private String codigoEanDigitado;
	@Column(name = "quantidadedigitada")
	private BigDecimal quantidadeDigitada;
	@Column(name = "produtodescricao")
	private String produtoDescricao;
	@Basic(optional = false)
	@Column(name = "idvenda")
	private int idVenda;
	@Column(name = "ecf")
	private Integer ecf;
	@Column(name = "numerosat")
	private Integer numeroSat;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "idscanntechpromocao")
	private Integer idScannTechPromocao;
	@Column(name = "descontopromocaopersonalizada")
	private BigDecimal descontoPromocaoPersonalizada;
	@Column(name = "descontoitem")
	private BigDecimal descontoItem;
	@Column(name = "descontoitemrateado")
	private BigDecimal descontoItemRateado;
	@Column(name = "loja")
	private Integer loja;
	@Column(name = "datamov")
	@Temporal(TemporalType.DATE)
	private Date datamov;
	@Column(name = "valorunitarioproduto")
	private BigDecimal valorUnitarioProduto;
	@Column(name = "custoproduto")
	private BigDecimal custoProduto;
	@Column(name = "custovenda")
	private BigDecimal custoVenda;
	//ver isso aqui
	@ManyToOne
	@JoinColumn(name = "idproduto")
	private Produto produto;
	@Column(name = "nsu")
	private Integer nsu;
	@Column(name = "coo")
	private Integer coo;
	@Column(name = "hora_cupom")
	private String horaCupom;
	@Column(name = "idvendedor")
	private Integer idVendedor;
	@Column(name = "situacao")
	private String situacao;
	@Column(name = "aliq_pis")
	private BigDecimal aliqPis;
	@Column(name = "aliq_cofins")
	private BigDecimal aliqCofins;
	@Column(name = "aliq_icms")
	private BigDecimal aliqIcms;
	@Column(name = "aliq_ipi")
	private BigDecimal aliqIpi;
	@Column(name = "cst_icms")
	private String cstIcms;
	@Column(name = "cst_pis")
	private String cstPis;
	@Column(name = "ccs_apurada")
	private String ccsApurada;
	@Column(name = "idoperador")
	private Integer idOperador;
	@Column(name = "operadorchave")
	private String operadorChave;
	@Column(name = "ccf")
	private Integer ccf;
	@Column(name = "acrescimoitem")
	private BigDecimal acrescimoItem;
	@Column(name = "tabelapreco")
	private Integer tabelaPreco;
	@Column(name = "davnumero")
	private Integer davNumero;
	@ManyToOne
	@JoinColumn(name = "idcliente")
	@JsonInclude(value = Include.NON_NULL)
	private Cliente cliente;
	@Column(name = "cpfcnpjcupom")
	private String cpfCnpjCupom;

	public Itensvenda() {
	}

	public Itensvenda(Integer idItensVenda) {
		this.idItensVenda = idItensVenda;
	}

	public Itensvenda(Integer idItensVenda, int idVenda) {
		this.idItensVenda = idItensVenda;
		this.idVenda = idVenda;
	}

	public Integer getIdItensVenda() {
		return idItensVenda;
	}

	public void setIdItensVenda(Integer idItensVenda) {
		this.idItensVenda = idItensVenda;
	}

	public Integer getCupom() {
		return cupom;
	}

	public void setCupom(Integer cupom) {
		this.cupom = cupom;
	}

	public Long getCodigoEan() {
		return codigoEan;
	}

	public void setCodigoEan(Long codigoEan) {
		this.codigoEan = codigoEan;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getQuantidadeSaida() {
		return quantidadeSaida;
	}

	public void setQuantidadeSaida(BigDecimal quantidadeSaida) {
		this.quantidadeSaida = quantidadeSaida;
	}

	public String getCodigoEanDigitado() {
		return codigoEanDigitado;
	}

	public void setCodigoEanDigitado(String codigoEanDigitado) {
		this.codigoEanDigitado = codigoEanDigitado;
	}

	public BigDecimal getQuantidadeDigitada() {
		return quantidadeDigitada;
	}

	public void setQuantidadeDigitada(BigDecimal quantidadeDigitada) {
		this.quantidadeDigitada = quantidadeDigitada;
	}

	public String getProdutoDescricao() {
		return produtoDescricao;
	}

	public void setProdutoDescricao(String produtoDescricao) {
		this.produtoDescricao = produtoDescricao;
	}

	public int getIdVenda() {
		return idVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public Integer getEcf() {
		return ecf;
	}

	public void setEcf(Integer ecf) {
		this.ecf = ecf;
	}

	public Integer getNumeroSat() {
		return numeroSat;
	}

	public void setNumeroSat(Integer numeroSat) {
		this.numeroSat = numeroSat;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getIdScannTechPromocao() {
		return idScannTechPromocao;
	}

	public void setIdScannTechPromocao(Integer idScannTechPromocao) {
		this.idScannTechPromocao = idScannTechPromocao;
	}

	public BigDecimal getDescontoPromocaoPersonalizada() {
		return descontoPromocaoPersonalizada;
	}

	public void setDescontoPromocaoPersonalizada(BigDecimal descontoPromocaoPersonalizada) {
		this.descontoPromocaoPersonalizada = descontoPromocaoPersonalizada;
	}

	public BigDecimal getDescontoItem() {
		return descontoItem;
	}

	public void setDescontoItem(BigDecimal descontoItem) {
		this.descontoItem = descontoItem;
	}

	public BigDecimal getDescontoItemRateado() {
		return descontoItemRateado;
	}

	public void setDescontoItemRateado(BigDecimal descontoItemRateado) {
		this.descontoItemRateado = descontoItemRateado;
	}

	public Integer getLoja() {
		return loja;
	}

	public void setLoja(Integer loja) {
		this.loja = loja;
	}

	public Date getDatamov() {
		return datamov;
	}

	public void setDatamov(Date datamov) {
		this.datamov = datamov;
	}

	public BigDecimal getValorUnitarioProduto() {
		return valorUnitarioProduto;
	}

	public void setValorUnitarioProduto(BigDecimal valorUnitarioProduto) {
		this.valorUnitarioProduto = valorUnitarioProduto;
	}

	public BigDecimal getCustoProduto() {
		return custoProduto;
	}

	public void setCustoProduto(BigDecimal custoProduto) {
		this.custoProduto = custoProduto;
	}

	public BigDecimal getCustoVenda() {
		return custoVenda;
	}

	public void setCustoVenda(BigDecimal custoVenda) {
		this.custoVenda = custoVenda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getNsu() {
		return nsu;
	}

	public void setNsu(Integer nsu) {
		this.nsu = nsu;
	}

	public Integer getCoo() {
		return coo;
	}

	public void setCoo(Integer coo) {
		this.coo = coo;
	}

	public String getHoraCupom() {
		return horaCupom;
	}

	public void setHoraCupom(String horaCupom) {
		this.horaCupom = horaCupom;
	}

	public Integer getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	public BigDecimal getAliqPis() {
		return aliqPis;
	}

	public void setAliqPis(BigDecimal aliqPis) {
		this.aliqPis = aliqPis;
	}

	public BigDecimal getAliqCofins() {
		return aliqCofins;
	}

	public void setAliqCofins(BigDecimal aliqCofins) {
		this.aliqCofins = aliqCofins;
	}

	public BigDecimal getAliqIcms() {
		return aliqIcms;
	}

	public void setAliqIcms(BigDecimal aliqIcms) {
		this.aliqIcms = aliqIcms;
	}

	public BigDecimal getAliqIpi() {
		return aliqIpi;
	}

	public void setAliqIpi(BigDecimal aliqIpi) {
		this.aliqIpi = aliqIpi;
	}

	public String getCstIcms() {
		return cstIcms;
	}

	public void setCstIcms(String cstIcms) {
		this.cstIcms = cstIcms;
	}

	public String getCstPis() {
		return cstPis;
	}

	public void setCstPis(String cstPis) {
		this.cstPis = cstPis;
	}

	public String getCcsApurada() {
		return ccsApurada;
	}

	public void setCcsApurada(String ccsApurada) {
		this.ccsApurada = ccsApurada;
	}

	public Integer getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Integer idOperador) {
		this.idOperador = idOperador;
	}

	public String getOperadorChave() {
		return operadorChave;
	}

	public void setOperadorChave(String operadorChave) {
		this.operadorChave = operadorChave;
	}

	public Integer getCcf() {
		return ccf;
	}

	public void setCcf(Integer ccf) {
		this.ccf = ccf;
	}

	public BigDecimal getAcrescimoItem() {
		return acrescimoItem;
	}

	public void setAcrescimoItem(BigDecimal acrescimoItem) {
		this.acrescimoItem = acrescimoItem;
	}

	public Integer getTabelaPreco() {
		return tabelaPreco;
	}

	public void setTabelaPreco(Integer tabelaPreco) {
		this.tabelaPreco = tabelaPreco;
	}

	public Integer getDavNumero() {
		return davNumero;
	}

	public void setDavNumero(Integer davNumero) {
		this.davNumero = davNumero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getCpfCnpjCupom() {
		return cpfCnpjCupom;
	}

	public void setCpfCnpjCupom(String cpfCnpjCupom) {
		this.cpfCnpjCupom = cpfCnpjCupom;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idItensVenda != null ? idItensVenda.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Itensvenda)) {
			return false;
		}
		Itensvenda other = (Itensvenda) object;
		if ((this.idItensVenda == null && other.idItensVenda != null)
				|| (this.idItensVenda != null && !this.idItensVenda.equals(other.idItensVenda))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.rotagestor.engreverse.Itensvenda[ idItensVenda=" + idItensVenda + " ]";
	}

}
