package com.sds.rotagestor.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "subgrupo1")
public class SubGrupo1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer idsubgrupo1;
	@Column(length = 45)
	private String nome;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idsubgrupo", nullable = true)
	@JsonInclude(content = Include.NON_NULL)
	private SubGrupo subgrupo;
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
	public SubGrupo getSubgrupo() {
		return subgrupo;
	}
	public void setSubgrupo(SubGrupo subgrupo) {
		this.subgrupo = subgrupo;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idsubgrupo1 == null) ? 0 : idsubgrupo1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SubGrupo1 other = (SubGrupo1) obj;
		if (idsubgrupo1 == null) {
			if (other.idsubgrupo1 != null)
				return false;
		} else if (!idsubgrupo1.equals(other.idsubgrupo1))
			return false;
		return true;
	}	

}
