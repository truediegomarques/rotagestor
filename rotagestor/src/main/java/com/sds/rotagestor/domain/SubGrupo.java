package com.sds.rotagestor.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "subgrupo")
public class SubGrupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idsubgrupo;
	private String nome;
	@ManyToOne
	@JoinColumn(name = "IDGRUPO")
	private Grupo grupo;
	@JsonInclude(content = Include.NON_NULL)
	private String usuario_alteracao;
	@JsonInclude(content = Include.NON_NULL)
	private Date ultima_alteracao;

	public Integer getId() {
		return id;
	}
 
	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdSubGrupo() {
		return idsubgrupo;
	}

	public void setIdSubGrupo(Integer idSubGrupo) {
		this.idsubgrupo = idSubGrupo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
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
