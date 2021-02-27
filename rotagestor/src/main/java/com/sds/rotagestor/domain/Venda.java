package com.sds.rotagestor.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "venda")
public class Venda implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idvenda;
	private Integer DOC;
	private Integer Registro;
	private BigDecimal valortotal;
	private Integer idnumcaixa;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Calendar datamov;
	private Integer COO;
	private Integer ECF;
	private Integer numerosat;
	private String modelo;
	private BigDecimal ValorECF;
	private BigDecimal ValorNF;
	private Integer crz;
	private BigDecimal abatimentocupom;
	private BigDecimal acrescimocupom;
	private Integer loja;
	private Integer davnumero;

	// teste

	public Integer getIdvenda() {
		return idvenda;
	}

	public void setIdvenda(Integer idvenda) {
		this.idvenda = idvenda;
	}

	public Integer getDOC() {
		return DOC;
	}

	public void setDOC(Integer dOC) {
		DOC = dOC;
	}

	public Integer getRegistro() {
		return Registro;
	}

	public void setRegistro(Integer registro) {
		Registro = registro;
	}

	public BigDecimal getValorTotal() {
		return valortotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		valortotal = valorTotal;
	}

	public Integer getIdNumCaixa() {
		return idnumcaixa;
	}

	public void setIdNumCaixa(Integer idNumCaixa) {
		this.idnumcaixa = idNumCaixa;
	}

	public Calendar getDataMov() {
		return datamov;
	}

	public void setDatMov(Calendar dataMov) {
		this.datamov = dataMov;
	}

	public Integer getCOO() {
		return COO;
	}

	public void setCOO(Integer cOO) {
		COO = cOO;
	}

	public Integer getECF() {
		return ECF;
	}

	public void setECF(Integer eCF) {
		ECF = eCF;
	}

	public Integer getNumeroSat() {
		return numerosat;
	}

	public void setNumeroSat(Integer numeroSat) {
		numerosat = numeroSat;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public BigDecimal getValorECF() {
		return ValorECF;
	}

	public void setValorECF(BigDecimal valorECF) {
		ValorECF = valorECF;
	}

	public BigDecimal getValorNF() {
		return ValorNF;
	}

	public void setValorNF(BigDecimal valorNF) {
		ValorNF = valorNF;
	}

	public Integer getCrz() {
		return crz;
	}

	public void setCrz(Integer crz) {
		this.crz = crz;
	}

	public BigDecimal getAbatimentocupom() {
		return abatimentocupom;
	}

	public void setAbatimentocupom(BigDecimal abatimentocupom) {
		this.abatimentocupom = abatimentocupom;
	}

	public BigDecimal getAcrescimocupom() {
		return acrescimocupom;
	}

	public void setAcrescimocupom(BigDecimal acrescimocupom) {
		this.acrescimocupom = acrescimocupom;
	}

	public Integer getLoja() {
		return loja;
	}

	public void setLoja(Integer loja) {
		this.loja = loja;
	}

	public Integer getDavNumero() {
		return davnumero;
	}

	public void setDavNumero(Integer davNumero) {
		davnumero = davNumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idvenda == null) ? 0 : idvenda.hashCode());
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
		Venda other = (Venda) obj;
		if (idvenda == null) {
			if (other.idvenda != null)
				return false;
		} else if (!idvenda.equals(other.idvenda))
			return false;
		return true;
	}

	

}
