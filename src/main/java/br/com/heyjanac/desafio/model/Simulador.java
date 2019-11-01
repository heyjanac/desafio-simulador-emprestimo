package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

@Entity
@Table(name = "Simulador")
public class Simulador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numero_contrato;
	
	private Date data_simulacao;
	private Date data_validade_simulacao;
	private BigDecimal valor_contrato;
	private Integer quantidade_parcela;
	private BigDecimal valor_parcela;
	private BigDecimal valor_taxa_juros;

	
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

	public Date getData_simulacao() {
		return data_simulacao;
	}

	public void setData_simulacao(Date data_simulacao) {
		this.data_simulacao = data_simulacao;
	}

	public Date getData_validade_simulacao() {
		return data_validade_simulacao;
	}

	public void setData_validade_simulacao(Date data_validade_simulacao) {
		this.data_validade_simulacao = data_validade_simulacao;
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

	public BigDecimal getValor_parcela() {
		return valor_parcela;
	}

	public void setValor_parcela(BigDecimal valor_parcela) {
		this.valor_parcela = valor_parcela;
	}

	public BigDecimal getValor_taxa_juros() {
		return valor_taxa_juros;
	}

	public void setValor_taxa_juros(BigDecimal valor_taxa_juros) {
		this.valor_taxa_juros = valor_taxa_juros;
	}

	@PrePersist
    public void prePersist() {
        final Date atual = new Date();
        data_simulacao = atual;
        data_validade_simulacao = atual;
    }

	
	@Override
	public String toString() {
		return "Simulador [id=" + id + ", numero_contrato=" + numero_contrato + ", data_simulacao=" + data_simulacao
				+ ", data_validade_simulacao=" + data_validade_simulacao + ", valor_contrato=" + valor_contrato
				+ ", quantidade_parcela=" + quantidade_parcela + ", valor_parcela=" + valor_parcela
				+ ", valor_taxa_juros=" + valor_taxa_juros + "]";
	}

	
}
