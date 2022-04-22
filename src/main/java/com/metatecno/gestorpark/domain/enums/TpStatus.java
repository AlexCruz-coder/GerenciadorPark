package com.metatecno.gestorpark.domain.enums;

public enum TpStatus {
	
	ABERTO(1, "Em aberto"),
	ATENDIMENTO(2, "Em atendimento"),
	FECHADO(3, "Finalizado");
	
	private int cod;
	private String descricao;
	
	
	private TpStatus(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}


	public int getCod() {
		return cod;
	}


	public String getDescricao() {
		return descricao;
	}
	
	
	public static TpStatus toEnum(Integer id) {
		if (id==null) {
			return null;
		}
		
		for (TpStatus x : TpStatus.values()) {
			if (id.equals(x.getCod())) {
				return x;
			}
		}

		throw new IllegalArgumentException("ID inválido");
		
	}



}
