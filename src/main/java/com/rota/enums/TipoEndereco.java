package com.rota.enums;

public enum TipoEndereco {

	PRINCIPAL(1, "PRINCIPAL"), COBRANCA(2, "COBRANCA"), ENTREGA(3, "ENTREGA");

	private int cod;
	private String descricao;

	private TipoEndereco(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoEndereco toEnum(Integer cod) {
		if (cod == null) {
			return null;
		}

		for (TipoEndereco x : TipoEndereco.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("Id inválido: " + cod);
	}

}
