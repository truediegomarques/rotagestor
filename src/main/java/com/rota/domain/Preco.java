package com.rota.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Preco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private TabelaPreco tabelaPreco;
	@ManyToOne
	private Produto produto;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date PromocaoInicio;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date PromocaoFim;
	private Boolean promocao;
	private Double precoPromocao;
	private Double preco1;
	private Double preco2;
	private Double preco3;
	private Double preco4;

	public Preco() {

	}

	public Preco(Long id, TabelaPreco tabelaPreco, Produto produto, Date promocaoInicio, Date promocaoFim,
			Boolean promocao, Double precoPromocao, Double preco1, Double preco2, Double preco3, Double preco4) {
		super();
		this.id = id;
		this.tabelaPreco = tabelaPreco;
		this.produto = produto;
		PromocaoInicio = promocaoInicio;
		PromocaoFim = promocaoFim;
		this.promocao = promocao;
		this.precoPromocao = precoPromocao;
		this.preco1 = preco1;
		this.preco2 = preco2;
		this.preco3 = preco3;
		this.preco4 = preco4;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TabelaPreco getTabelaPreco() {
		return tabelaPreco;
	}

	public void setTabelaPreco(TabelaPreco tabelaPreco) {
		this.tabelaPreco = tabelaPreco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Date getPromocaoInicio() {
		return PromocaoInicio;
	}

	public void setPromocaoInicio(Date promocaoInicio) {
		PromocaoInicio = promocaoInicio;
	}

	public Date getPromocaoFim() {
		return PromocaoFim;
	}

	public void setPromocaoFim(Date promocaoFim) {
		PromocaoFim = promocaoFim;
	}

	public Boolean getPromocao() {
		return promocao;
	}

	public void setPromocao(Boolean promocao) {
		this.promocao = promocao;
	}

	public Double getPrecoPromocao() {
		return precoPromocao;
	}

	public void setPrecoPromocao(Double precoPromocao) {
		this.precoPromocao = precoPromocao;
	}

	public Double getPreco1() {
		return preco1;
	}

	public void setPreco1(Double preco1) {
		this.preco1 = preco1;
	}

	public Double getPreco2() {
		return preco2;
	}

	public void setPreco2(Double preco2) {
		this.preco2 = preco2;
	}

	public Double getPreco3() {
		return preco3;
	}

	public void setPreco3(Double preco3) {
		this.preco3 = preco3;
	}

	public Double getPreco4() {
		return preco4;
	}

	public void setPreco4(Double preco4) {
		this.preco4 = preco4;
	}

}
