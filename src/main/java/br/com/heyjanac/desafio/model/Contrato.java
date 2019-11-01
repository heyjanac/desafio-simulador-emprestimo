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
@Table(name = "TB_CONTRATO")
@SequenceGenerator(name = "contratoIdGenerator", sequenceName = "SEQ_TB_CONTRATO", allocationSize = 1)
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "contratoIdGenerator", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_CONTRATO", nullable = false)
	private Long idContrato;
	
	@OneToMany(mappedBy = "simulador", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idSimulador", insertable = false, updatable = false)
	private Simulador simulador;

	@Column(name = "DT_CONTRATO", nullable = false)
	private Date dataContrato;

	@Column(name = "VL_IOF_CONTRATO")
	private BigDecimal valorIofContrato;

}
