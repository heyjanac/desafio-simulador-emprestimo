package br.com.heyjanac.desafio.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heyjanac.desafio.model.Cliente;
import br.com.heyjanac.desafio.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	private static final Logger log = LoggerFactory.getLogger(ClienteServiceImpl.class);

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public Optional<Cliente> buscarPorCpf(String cpf) {
		log.info("Buscando cliente por CPF {}", cpf);
		return Optional.ofNullable(clienteRepository.findByCpf(cpf));
	}

	@Override
	public Cliente salvar(Cliente cliente) {
		log.info("Salvando cliente: {}", cliente);
		return this.clienteRepository.save(cliente);
	}

}
