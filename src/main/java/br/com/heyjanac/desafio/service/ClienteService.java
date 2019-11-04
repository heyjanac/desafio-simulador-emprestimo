package br.com.heyjanac.desafio.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.heyjanac.desafio.exception.ResourceNotFoundException;
import br.com.heyjanac.desafio.model.Cliente;
import br.com.heyjanac.desafio.repository.IClienteRepository;

@Service
public class ClienteService {

	private static final Logger log = LoggerFactory.getLogger(ClienteService.class);

	@Autowired
	private IClienteRepository clienteRepository;

	public List<Cliente> listarTodos() {
		log.info("Buscando todos os clientes.");
		return clienteRepository.findAll();
	}

	public Cliente buscarPorId(Long id) throws ResourceNotFoundException {
		log.info("Buscando cliente por ID {}: ", id);
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if (cliente.isPresent())
			return cliente.get();

		throw new ResourceNotFoundException(String.format("Cliente nao encontrado pelo id {%s} ", id));
	}

	public Cliente buscarPorCpf(String cpf) {
		log.info("Buscando cliente por CPF {}", cpf);
		return clienteRepository.findByCpf(cpf);
	}

	@Transactional
	public Cliente salvar(Cliente cliente) {
		log.info("Salvando cliente: {}", cliente);
		return this.clienteRepository.save(cliente);
	}

	@Transactional
	public Cliente atualizar(Long id, Cliente cliente) throws ResourceNotFoundException {
		
		log.info("Atualizando cliente: {}", cliente);
		
		Optional<Cliente> optClienteAtualizar = clienteRepository.findById(id);
		
		
		if (optClienteAtualizar.isPresent()) {
			
			if(cliente.getCpf() != null)
				optClienteAtualizar.get().setCpf(cliente.getCpf());
			
			if(cliente.getNome() != null)
				optClienteAtualizar.get().setNome(cliente.getNome());
			
			if(cliente.getEmail() != null)
				optClienteAtualizar.get().setEmail(cliente.getEmail());
			
			return this.clienteRepository.save(optClienteAtualizar.get());
		}
			

		throw new ResourceNotFoundException(String.format("Cliente nao encontrado pelo id {%s} para atualizar.", id));

	}

	public void deletar(Long id) {
		log.info("Deletando cliente: {}", id);
		this.clienteRepository.findById(id);
	}

}
