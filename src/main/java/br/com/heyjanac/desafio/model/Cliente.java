package br.com.heyjanac.desafio.model;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "TB_CLIENTE")
@SequenceGenerator(name = "clienteIdGenerator", sequenceName = "SEQ_TB_CLIENTE", allocationSize = 1)
public class Cliente implements Serializable {

	private static final long serialVersionUID = -8395876040206868895L;

	@Id
	@GeneratedValue(generator = "clienteIdGenerator", strategy = GenerationType.SEQUENCE)
	@Column(name = "ID_CLIENTE", nullable = false)
	private Long idCliente;

	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_CLIENTE")
	private List<Emprestimo> emprestimos;

	@Column(name = "NU_CPF", nullable = false)
	private String cpfCliente;

	@Column(name = "DS_NOME", nullable = false)
	private String nomeCliente;

	@Column(name = "DS_EMAIL", nullable = false)
	private String emailCliente;

	public Cliente(String cpfCliente, String nomeCliente, String emailCliente) {
		this.cpfCliente = cpfCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
