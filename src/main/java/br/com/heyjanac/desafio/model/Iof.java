package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TB_IOF")
@SequenceGenerator(name = "iofIdGenerator", sequenceName = "SEQ_TB_IOF", allocationSize = 1)
public class Iof implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "iofIdGenerator",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_IOF")	
	private Long idIof;
	
	@Column(name = "VL_TAXA_JUROS")
	private BigDecimal valorTaxaJuros;
	
	@Column(name = "NU_QTDE_PARCELA")
	private Integer quantidadeParcela;
	
	@Column(name = "VL_TAXA_IOF")
	private BigDecimal valorTaxaIof;
}
