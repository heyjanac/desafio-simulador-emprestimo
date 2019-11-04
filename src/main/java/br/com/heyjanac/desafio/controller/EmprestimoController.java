package br.com.heyjanac.desafio.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.heyjanac.desafio.model.Emprestimo;
import br.com.heyjanac.desafio.service.EmprestimoService;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoController {

	private static final Logger log = LoggerFactory.getLogger(EmprestimoController.class);

	@Autowired
	private EmprestimoService emprestimoService;

	public EmprestimoController() {
	}

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/salvar")
	public Emprestimo salvarEmprestimo(@Valid @RequestBody Emprestimo emprestimo) {
		return emprestimoService.salvar(emprestimo);
	}

}
