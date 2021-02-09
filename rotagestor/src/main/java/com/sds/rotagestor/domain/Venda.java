package com.sds.rotagestor.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Venda {
	
	@Id
	private int idvenda;
	private int DOC;
	private int Registro;
	private float ValorTotal;
	private int idNumCaixa;
	private int COO;
	private int ECF;
	private int NumeroSat;
	private String modelo;
	private float ValorECF;
	private float ValorNF;
	private int crz;
	private float abatimentocupom;
	private float acrescimocupom;
	private int loja;
	private int DavNumero;
	
	
	public int getIdvenda() {
		return idvenda;
	}
	public void setIdvenda(int idvenda) {
		this.idvenda = idvenda;
	}
	public int getDOC() {
		return DOC;
	}
	public void setDOC(int dOC) {
		DOC = dOC;
	}
	public int getRegistro() {
		return Registro;
	}
	public void setRegistro(int registro) {
		Registro = registro;
	}
	public float getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(float valorTotal) {
		ValorTotal = valorTotal;
	}
	public int getIdNumCaixa() {
		return idNumCaixa;
	}
	public void setIdNumCaixa(int idNumCaixa) {
		this.idNumCaixa = idNumCaixa;
	}
	public int getCOO() {
		return COO;
	}
	public void setCOO(int cOO) {
		COO = cOO;
	}
	public int getECF() {
		return ECF;
	}
	public void setECF(int eCF) {
		ECF = eCF;
	}
	public int getNumeroSat() {
		return NumeroSat;
	}
	public void setNumeroSat(int numeroSat) {
		NumeroSat = numeroSat;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getValorECF() {
		return ValorECF;
	}
	public void setValorECF(float valorECF) {
		ValorECF = valorECF;
	}
	public float getValorNF() {
		return ValorNF;
	}
	public void setValorNF(float valorNF) {
		ValorNF = valorNF;
	}
	public int getCrz() {
		return crz;
	}
	public void setCrz(int crz) {
		this.crz = crz;
	}
	public float getAbatimentocupom() {
		return abatimentocupom;
	}
	public void setAbatimentocupom(float abatimentocupom) {
		this.abatimentocupom = abatimentocupom;
	}
	public float getAcrescimocupom() {
		return acrescimocupom;
	}
	public void setAcrescimocupom(float acrescimocupom) {
		this.acrescimocupom = acrescimocupom;
	}
	public int getLoja() {
		return loja;
	}
	public void setLoja(int loja) {
		this.loja = loja;
	}
	public int getDavNumero() {
		return DavNumero;
	}
	public void setDavNumero(int davNumero) {
		DavNumero = davNumero;
	}
	

}
