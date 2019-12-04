package com.rota.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Titulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date emissao;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date vencimento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date pagamento;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date baixa;
	@ManyToOne
	private Cliente cliente;
	private Double valorBruto;
	private Double desconto;
	private Double valorLiquido;

	public Titulo() {
	}

	public Titulo(Long id, Date emissao, Date vencimento, Date pagamento, Date baixa, Cliente cliente,
			Double valorBruto, Double desconto, Double valorLiquido) {
		super();
		this.id = id;
		this.emissao = emissao;
		this.vencimento = vencimento;
		this.pagamento = pagamento;
		this.baixa = baixa;
		this.cliente = cliente;
		this.valorBruto = valorBruto;
		this.desconto = desconto;
		this.valorLiquido = valorLiquido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getEmissao() {
		return emissao;
	}

	public void setEmissao(Date emissao) {
		this.emissao = emissao;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public Date getPagamento() {
		return pagamento;
	}

	public void setPagamento(Date pagamento) {
		this.pagamento = pagamento;
	}

	public Date getBaixa() {
		return baixa;
	}

	public void setBaixa(Date baixa) {
		this.baixa = baixa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(Double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValorLiquido() {
		return valorLiquido;
	}

	public void setValorLiquido(Double valorLiquido) {
		this.valorLiquido = valorLiquido;
	}

}
