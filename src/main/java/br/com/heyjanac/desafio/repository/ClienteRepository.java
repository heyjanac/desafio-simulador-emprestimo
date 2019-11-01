package br.com.heyjanac.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.heyjanac.desafio.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	//@Transactional(readOnly = true)
	//Optional<Cliente> findByCpf(String cpf);

}
