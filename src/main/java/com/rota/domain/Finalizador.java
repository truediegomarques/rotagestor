package com.rota.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Finalizador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descricao;
	private int parcelas;
	private int primeiraParcela;
	private int intervaloParcelas;
	private Boolean diasUteis;
	private Boolean permiteDesconto;
	private Double descontoMaximo;

	public Finalizador() {

	}

	public Finalizador(Long id, String descricao, int parcelas, int primeiraParcela, int intervaloParcelas,
			Boolean diasUteis, Boolean permiteDesconto, Double descontoMaximo) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.parcelas = parcelas;
		this.primeiraParcela = primeiraParcela;
		this.intervaloParcelas = intervaloParcelas;
		this.diasUteis = diasUteis;
		this.permiteDesconto = permiteDesconto;
		this.descontoMaximo = descontoMaximo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public int getPrimeiraParcela() {
		return primeiraParcela;
	}

	public void setPrimeiraParcela(int primeiraParcela) {
		this.primeiraParcela = primeiraParcela;
	}

	public int getIntervaloParcelas() {
		return intervaloParcelas;
	}

	public void setIntervaloParcelas(int intervaloParcelas) {
		this.intervaloParcelas = intervaloParcelas;
	}

	public Boolean getDiasUteis() {
		return diasUteis;
	}

	public void setDiasUteis(Boolean diasUteis) {
		this.diasUteis = diasUteis;
	}

	public Boolean getPermiteDesconto() {
		return permiteDesconto;
	}

	public void setPermiteDesconto(Boolean permiteDesconto) {
		this.permiteDesconto = permiteDesconto;
	}

	public Double getDescontoMaximo() {
		return descontoMaximo;
	}

	public void setDescontoMaximo(Double descontoMaximo) {
		this.descontoMaximo = descontoMaximo;
	}

}
