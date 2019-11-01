package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.heyjanac.desafio.enums.StatusEmprestimoEnum;

public class Emprestimo implements Serializable {

	private static final long serialVersionUID = 6618569239781269554L;

	@Id
	@GeneratedValue(generator = "emprestimoIdGenerator", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_EMPRESTIMO", nullable = false)
	private Long idEmprestimo;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_CLIENTE", nullable = false)
	private Cliente cliente;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_EMPRESTIMO")
	private List<Parcela> parcelas;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_SIMULACAO", nullable = false)
	private Date dataSimulacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_VALIDADE_SIMULACAO", nullable = false)
	private Date dataValidadeSimulacao;

	@Column(name = "NU_CONTRATO", nullable = false)
	private Long numeroContrato;

	@Column(name = "VL_CONTRATO", nullable = false)
	private BigDecimal valorContrato;

	@Column(name = "NU_QTDE_PARCELA", nullable = false)
	private Integer quantidadeParcela;

	@Column(name = "VL_PARCELA", nullable = false)
	private BigDecimal valorParcela;

	@Column(name = "VL_TAXA_JUROS")
	private BigDecimal valorTaxaJuros;

	@Column(name = "DT_CONTRATACAO", nullable = false)
	private Date dataContratacao;

	@Column(name = "VL_IOF_CONTRATO")
	private BigDecimal valorIofContrato;

	@Column(name = "NU_STATUS")
	private StatusEmprestimoEnum numeroStatus;

	@PrePersist
	public void prePersist() {
		final Date atual = new Date();
		this.dataSimulacao = atual;
		this.dataValidadeSimulacao = atual;
	}

	public Long getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(Long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

	public Date getDataSimulacao() {
		return dataSimulacao;
	}

	public void setDataSimulacao(Date dataSimulacao) {
		this.dataSimulacao = dataSimulacao;
	}

	public Date getDataValidadeSimulacao() {
		return dataValidadeSimulacao;
	}

	public void setDataValidadeSimulacao(Date dataValidadeSimulacao) {
		this.dataValidadeSimulacao = dataValidadeSimulacao;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public BigDecimal getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(BigDecimal valorContrato) {
		this.valorContrato = valorContrato;
	}

	public Integer getQuantidadeParcela() {
		return quantidadeParcela;
	}

	public void setQuantidadeParcela(Integer quantidadeParcela) {
		this.quantidadeParcela = quantidadeParcela;
	}

	public BigDecimal getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(BigDecimal valorParcela) {
		this.valorParcela = valorParcela;
	}

	public BigDecimal getValorTaxaJuros() {
		return valorTaxaJuros;
	}

	public void setValorTaxaJuros(BigDecimal valorTaxaJuros) {
		this.valorTaxaJuros = valorTaxaJuros;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}

	public BigDecimal getValorIofContrato() {
		return valorIofContrato;
	}

	public void setValorIofContrato(BigDecimal valorIofContrato) {
		this.valorIofContrato = valorIofContrato;
	}

	public StatusEmprestimoEnum getNumeroStatus() {
		return numeroStatus;
	}

	public void setNumeroStatus(StatusEmprestimoEnum numeroStatus) {
		this.numeroStatus = numeroStatus;
	}

}
