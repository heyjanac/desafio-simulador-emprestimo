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
@Table(name = "TB_CONTRATO")
@SequenceGenerator(name = "contratoIdGenerator", sequenceName = "SEQ_TB_CONTRATO", allocationSize = 1)
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "contratoIdGenerator",strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_CONTRATO")
	private Long idContrato;
	
	@Column(name = "NU_CONTRATO")
	private Long numeroContrato;
	
	@Column(name = "DT_CONTRATO")
	private Date dataContrato;
	
	@Column(name = "VL_CONTRATO")
	private BigDecimal valorContrato;
	
	@Column(name = "NU_QUANTIDADE_PARCELA")
	private Integer quantidadeParcela;
	
	@Column(name = "VL_TAXA_CONTRATO")
	private BigDecimal valorTaxaContrato;
	
	@Column(name = "VL_IOF_CONTRATO")
	private BigDecimal valorIofContrato;

	public Long getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(Long idContrato) {
		this.idContrato = idContrato;
	}

	public Long getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Long numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
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

	public BigDecimal getValorTaxaContrato() {
		return valorTaxaContrato;
	}

	public void setValorTaxaContrato(BigDecimal valorTaxaContrato) {
		this.valorTaxaContrato = valorTaxaContrato;
	}

	public BigDecimal getValorIofContrato() {
		return valorIofContrato;
	}

	public void setValorIofContrato(BigDecimal valorIofContrato) {
		this.valorIofContrato = valorIofContrato;
	}


}
