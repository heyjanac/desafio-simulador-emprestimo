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

	public Emprestimo buscarPorNumeroContrato(Integer numeroContrato) {
		log.info("Buscando emprestimo por Numero Contrato {}", numeroContrato);
		return emprestimoRepository.findByUltimoNumeroContrato();
	}
	
	public Emprestimo salvar(Emprestimo emprestimo) {
		log.info("Salvando emprestimo: {}", emprestimo);
		
		Emprestimo ultimoRegistroContrato = emprestimoRepository.findByUltimoNumeroContrato();
		
		this.gerarNumeroContrato(ultimoRegistroContrato.getNumeroContrato());
		
		return this.emprestimoRepository.save(emprestimo);
	}

	public Emprestimo simular() {
		return null;
	}

	public Emprestimo contratar() {
		return null;
	}

	public String gerarNumeroContrato(Long ultimoNumeroContrato) {

		String iniciais = "";
		Integer numero = 0;
		
		for (int i = 0; i < 6; i++) {
			numero = new Integer((int) (Math.random() * 10));
			log.warn("numero: " + numero.toString());
			iniciais += numero.toString();
			log.warn("iniciais: " + iniciais);
		}
		
		
		return iniciais;

	}

}
