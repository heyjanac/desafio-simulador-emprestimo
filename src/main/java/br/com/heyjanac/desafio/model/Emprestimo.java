package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;

public class Emprestimo implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name = "NU_CONTRATO", nullable = false)
	private Long numeroContrato;
		
	@Column(name = "VL_CONTRATO", nullable = false)
	private BigDecimal valorContrato;
	
	@Column(name = "NU_QTDE_PARCELA", nullable = false)
	private Integer quantidadeParcela;
	
	@Column(name = "VL_TAXA_JUROS")
	private BigDecimal valorTaxaJuros;
	
}
