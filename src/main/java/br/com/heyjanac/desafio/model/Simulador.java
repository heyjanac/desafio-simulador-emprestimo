package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_SIMULADOR")
@SequenceGenerator(name = "simuladorIdGenerator", sequenceName = "SEQ_TB_SIMULADOR", allocationSize = 1)
public class Simulador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "simuladorIdGenerator",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_SIMULADOR")	
	private Long idSimulador;
	
//	@Column(name = "NU_CONTRATO")
//	private Long numeroContrato;	
//	
//	private Date dataSimulacao;
//	private Date dataValidadeSimulacao;
//	
//	private BigDecimal valorContrato;
//	private Integer quantidadeParcela;
//	
//	private BigDecimal valorTaxaJuros;
//	private BigDecimal valorParcela;
	
	

	
}
