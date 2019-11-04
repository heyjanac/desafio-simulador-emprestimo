package br.com.heyjanac.desafio.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.heyjanac.desafio.model.Emprestimo;
import br.com.heyjanac.desafio.repository.IEmprestimoRepository;

@Service
public class EmprestimoService {
	
	private static final Logger log = LoggerFactory.getLogger(EmprestimoService.class);

	@Autowired
	private IEmprestimoRepository emprestimoRepository;


	public Emprestimo salvar(Emprestimo emprestimo) {
		log.info("Salvando emprestimo: {}", emprestimo);
		return this.emprestimoRepository.save(emprestimo);
	}
	
}
