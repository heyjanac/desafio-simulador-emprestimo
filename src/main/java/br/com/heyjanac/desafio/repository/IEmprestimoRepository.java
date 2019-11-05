package br.com.heyjanac.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.heyjanac.desafio.model.Emprestimo;

@Repository
public interface IEmprestimoRepository extends JpaRepository<Emprestimo, Long> {

	Emprestimo findByUltimoNumeroContrato();
	
}
