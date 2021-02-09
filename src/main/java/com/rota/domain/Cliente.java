package com.rota.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cpf_cnpj;
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date nascicmento;
	private Double limiteCredito;

	public Cliente() {

	}

	public Cliente(Long id, String cpf_cnpj, String nome, String endereco, String telefone, String email,
			Date nascicmento, Double limiteCredito) {
		super();
		this.id = id;
		this.cpf_cnpj = cpf_cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.nascicmento = nascicmento;
		this.limiteCredito = limiteCredito;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getNascicmento() {
		return nascicmento;
	}

	public void setNascicmento(Date nascicmento) {
		this.nascicmento = nascicmento;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

}
