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
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_SIMULADOR")
@SequenceGenerator(name = "simuladorIdGenerator", sequenceName = "SEQ_TB_SIMULADOR", allocationSize = 1)
public class Simulador extends Emprestimo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "simuladorIdGenerator", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_SIMULADOR", nullable = false)
	private Long idSimulador;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idCliente", insertable = false, updatable = false)
	private Cliente cliente;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_SIMULACAO", nullable = false)
	private Date dataSimulacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_VALIDADE_SIMULACAO", nullable = false)
	private Date dataValidadeSimulacao;

	@Column(name = "VL_PARCELA", nullable = false)
	private BigDecimal valorParcela;

	@Column(name = "FG_ATIVO")
	private Boolean isAtivo;

	@PrePersist
	public void prePersist() {
		final Date atual = new Date();
		this.dataSimulacao = atual;
		this.dataValidadeSimulacao = atual;
	}
}
