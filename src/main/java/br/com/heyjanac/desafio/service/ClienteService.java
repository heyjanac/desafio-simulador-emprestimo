package br.com.heyjanac.desafio.service;

import java.util.Optional;

import br.com.heyjanac.desafio.model.Cliente;

public interface ClienteService {

	/**
	 * Retorna cliente informando um CPF.
	 * 
	 * @param cpf
	 * @return Optional<Cliente>
	 */
	Optional<Cliente> buscarPorCpf(String cpf);
	
	/**
	 * Cadastra novo cliente na base de dados.
	 * 
	 * @param cliente
	 * @return Cliente
	 */
	Cliente salvar(Cliente cliente);
	
	
}
