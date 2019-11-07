package com.rota.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Produto produto;
	private Double valor;
	private Double quantidade;
	private Double desconto;
	private Double total;
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	public ItemPedido() {

	}

	public ItemPedido(Long id, Produto produto, Double valor, Double quantidade, Double desconto, Pedido pedido) {
		super();
		this.id = id;
		this.produto = produto;
		this.valor = valor;
		this.quantidade = quantidade;
		this.desconto = desconto;
		this.pedido = pedido;
		this.total = calculaTotal(this.valor, this.quantidade, this.desconto);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	private Double calculaTotal(Double valor, Double quantidade, Double desconto) {
		Double total = (valor * quantidade) * (1 - (desconto / 100));
		return total;
	}

}
