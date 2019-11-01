package br.com.heyjanac.desafio.enums;

public enum StatusEmprestimoEnum {
	
	SIMULADO(1, "Simulado"), EFETIVADO(2, "Efetivado"), CANCELADO(3, "Cancelado");

	private int codigo;
	private String descricao;

	StatusEmprestimoEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	StatusEmprestimoEnum(int codigo) {
		this.codigo = codigo;
	}
	
	StatusEmprestimoEnum(String descricao) {
		this.descricao = descricao;
	}

	
}
