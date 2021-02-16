package com.sds.rotagestor.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subgrupo1")
public class SubGrupo1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idsubgrupo1;
	@Column(length = 45)
	private String nome; 
	private String usuario_alteracao; 
	private Date ultima_alteracao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getIdsubgrupo1() {
		return idsubgrupo1;
	}
	public void setIdsubgrupo1(Integer idsubgrupo1) {
		this.idsubgrupo1 = idsubgrupo1;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
