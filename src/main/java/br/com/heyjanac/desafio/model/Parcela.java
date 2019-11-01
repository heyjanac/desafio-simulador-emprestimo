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
@Table(name = "Parcela")
public class Parcela implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long numero_contrato;
	private Long numero_parcela;
	private BigDecimal valor_parcela;
	private Date data_vencimento;

	
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

	public Long getNumero_parcela() {
		return numero_parcela;
	}

	public void setNumero_parcela(Long numero_parcela) {
		this.numero_parcela = numero_parcela;
	}

	public BigDecimal getValor_parcela() {
		return valor_parcela;
	}

	public void setValor_parcela(BigDecimal valor_parcela) {
		this.valor_parcela = valor_parcela;
	}

	public Date getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(Date data_vencimento) {
		this.data_vencimento = data_vencimento;
	}

	@Override
	public String toString() {
		return "Parcela [id=" + id + ", numero_contrato=" + numero_contrato + ", numero_parcela=" + numero_parcela
				+ ", valor_parcela=" + valor_parcela + ", data_vencimento=" + data_vencimento + "]";
	}

}
