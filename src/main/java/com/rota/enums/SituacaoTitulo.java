package com.rota.enums;

public enum SituacaoTitulo {

	ABERTO(1, "ABERTO"), BAIXADO(2, "BAIXADO");

	private int cod;
	private String descricao;

	private SituacaoTitulo(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static SituacaoTitulo toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (SituacaoTitulo x : SituacaoTitulo.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
