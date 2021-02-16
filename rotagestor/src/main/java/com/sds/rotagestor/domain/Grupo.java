package com.sds.rotagestor.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Grupo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IDGRUPO;
	@Column(length = 50)
	private String NOME;
	private BigDecimal descmed;
	private BigDecimal descmax;
	private BigDecimal comissao;
	private Integer coberturaestoque;
	@JsonInclude(value = Include.NON_NULL)
	private String usuario_alteracao;
	@JsonInclude(value = Include.NON_NULL)
	private Date ultima_alteracao;

	public Integer getIDGRUPO() {
		return IDGRUPO;
	}

	public void setIDGRUPO(Integer iDGRUPO) {
		IDGRUPO = iDGRUPO;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nOME) {
		NOME = nOME;
	}

	public BigDecimal getDescMed() {
		return descmed;
	}

	public void setDescMed(BigDecimal descMed) {
		descmed = descMed;
	}

	public BigDecimal getDescMax() {
		return descmax;
	}

	public void setDescMax(BigDecimal descMax) {
		descmax = descMax;
	}

	public BigDecimal getComissao() {
		return comissao;
	}

	public void setComissao(BigDecimal comissao) {
		this.comissao = comissao;
	}

	public Integer getCoberturaEstoque() {
		return coberturaestoque;
	}

	public void setCoberturaEstoque(Integer coberturaEstoque) {
		this.coberturaestoque = coberturaEstoque;
	}

	public String getUsuario_alteracao() {
		return usuario_alteracao;
	}

	public void setUsuario_alteracao(String usuario_alteracao) {
		this.usuario_alteracao = usuario_alteracao;
	}

	public Date getUltima_alteracao() {
		return ultima_alteracao;
	}

	public void setUltima_alteracao(Date ultima_alteracao) {
		this.ultima_alteracao = ultima_alteracao;
	}

}
