package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contrato")
public class Contrato implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numero_contrato;
	private Date data_contrato;
	private BigDecimal valor_contrato;
	private Integer quantidade_parcela;
	private BigDecimal valor_taxa_contrato;
	private BigDecimal valor_iof_contrato;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero_contrato() {
		return numero_contrato;
	}

	public void setNumero_contrato(Long numero_contrato) {
		this.numero_contrato = numero_contrato;
	}

	public Date getData_contrato() {
		return data_contrato;
	}

	public void setData_contrato(Date data_contrato) {
		this.data_contrato = data_contrato;
	}

	public BigDecimal getValor_contrato() {
		return valor_contrato;
	}

	public void setValor_contrato(BigDecimal valor_contrato) {
		this.valor_contrato = valor_contrato;
	}

	public Integer getQuantidade_parcela() {
		return quantidade_parcela;
	}

	public void setQuantidade_parcela(Integer quantidade_parcela) {
		this.quantidade_parcela = quantidade_parcela;
	}

	public BigDecimal getValor_taxa_contrato() {
		return valor_taxa_contrato;
	}

	public void setValor_taxa_contrato(BigDecimal valor_taxa_contrato) {
		this.valor_taxa_contrato = valor_taxa_contrato;
	}

	public BigDecimal getValor_iof_contrato() {
		return valor_iof_contrato;
	}

	public void setValor_iof_contrato(BigDecimal valor_iof_contrato) {
		this.valor_iof_contrato = valor_iof_contrato;
	}

	@Override
	public String toString() {
		return "Contrato [id=" + id + ", numero_contrato=" + numero_contrato + ", data_contrato=" + data_contrato
				+ ", valor_contrato=" + valor_contrato + ", quantidade_parcela=" + quantidade_parcela
				+ ", valor_taxa_contrato=" + valor_taxa_contrato + ", valor_iof_contrato=" + valor_iof_contrato + "]";
	}

}
