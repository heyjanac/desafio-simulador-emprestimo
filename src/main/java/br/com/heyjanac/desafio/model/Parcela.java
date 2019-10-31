package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARCELA")
@SequenceGenerator(name = "parcelaIdGenerator", sequenceName = "SEQ_TB_PARCELA", allocationSize = 1)
public class Parcela implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "parcelaIdGenerator",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PARCELA")	
	private Long idParcela;
	
//	private Long numeroContratoParcela;
//	private Long numeroParcela;
//	private BigDecimal valorParcela;
//	private Date dataVencimentoParcela;

	
}
