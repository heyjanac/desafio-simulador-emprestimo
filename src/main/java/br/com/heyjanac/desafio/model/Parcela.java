package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_PARCELA")
@SequenceGenerator(name = "parcelaIdGenerator", sequenceName = "SEQ_TB_PARCELA", allocationSize = 1)
public class Parcela implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "parcelaIdGenerator",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_PARCELA", nullable = false)	
	private Long idParcela;
	
	@OneToMany(mappedBy = "contrato", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idContrato", insertable = false, updatable = false)
	private Contrato contrato;
	
	@Column(name = "NU_CONTRATO")
	private Long numeroContrato;
	
	@Column(name = "NU_PARCELA", nullable = false)
	private Integer numeroParcela;
	
	@Column(name = "DT_VENCIMENTO", nullable = false)
	private Date dataVencimento;
	
	@Column(name = "VL_PARCELA", nullable = false)
	private BigDecimal valorParcela;
	
}
