package com.rota.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TabelaPreco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Filial filial;
	private String descricao;
	private Double decontoMaximo;
	private Double descontoMinimo;

	public TabelaPreco() {

	}

	public TabelaPreco(Long id, Filial filial, String descricao, Double decontoMaximo, Double descontoMinimo) {
		super();
		this.id = id;
		this.filial = filial;
		this.descricao = descricao;
		this.decontoMaximo = decontoMaximo;
		this.descontoMinimo = descontoMinimo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = filial;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getDecontoMaximo() {
		return decontoMaximo;
	}

	public void setDecontoMaximo(Double decontoMaximo) {
		this.decontoMaximo = decontoMaximo;
	}

	public Double getDescontoMinimo() {
		return descontoMinimo;
	}

	public void setDescontoMinimo(Double descontoMinimo) {
		this.descontoMinimo = descontoMinimo;
	}

}
