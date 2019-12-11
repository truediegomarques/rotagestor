package com.rota.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Cliente cliente;
	@OneToMany(mappedBy = "pedido", targetEntity = ItemPedido.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<ItemPedido> itens;
	private String observacao;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataPedido;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date dataEntrega;
	@ManyToOne
	private Finalizador finalizador;
	@ManyToOne
	private Filial filial;
	private Double desconto;
	private Double acrescimo;
	private Double totalBruto;
	private Double totalLiquido;

	public Pedido() {

	}

	public Pedido(Long id, Cliente cliente, List<ItemPedido> itens, String observacao, Date dataPedido,
			Date dataEntrega, Finalizador finalizador, Filial filial, Double desconto, Double acrescimo,
			Double totalBruto, Double totalLiquido) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.itens = itens;
		this.observacao = observacao;
		this.dataPedido = dataPedido;
		this.dataEntrega = dataEntrega;
		this.finalizador = finalizador;
		this.filial = filial;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
		this.totalBruto = totalBruto;
		this.totalLiquido = totalLiquido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Finalizador getFinalizador() {
		return finalizador;
	}

	public void setFinalizador(Finalizador finalizador) {
		this.finalizador = finalizador;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public Double getTotalBruto() {
		return totalBruto;
	}

	public void setTotalBruto(Double totalBruto) {
		this.totalBruto = totalBruto;
	}

	public Double getTotalLiquido() {
		return totalLiquido;
	}

	public void setTotalLiquido(Double totalLiquido) {
		this.totalLiquido = totalLiquido;
	}

}
