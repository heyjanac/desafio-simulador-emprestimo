package br.com.heyjanac.desafio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.heyjanac.desafio.exception.ResourceNotFoundException;
import br.com.heyjanac.desafio.model.Cliente;
import br.com.heyjanac.desafio.service.ClienteService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Cliente")
@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	public ClienteController() {
	}

	@ApiOperation(value = "Listar todos os clientes.")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "")
	public ResponseEntity<List<Cliente>> listarTodosClientes() {
		return ResponseEntity.ok(clienteService.listarTodos());
	}

	@ApiOperation(value = "Buscar cliente pelo ID.")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/{id}")
	public ResponseEntity<Cliente> buscarClientePorId(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}

	@ApiOperation(value = "Buscar cliente pelo CPF.")
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/cpf/{cpf}")
	public ResponseEntity<Cliente> buscarClientePorCpf(@PathVariable(value = "cpf") String cpf) {
		return ResponseEntity.ok(clienteService.buscarPorCpf(cpf));
	}

	@ApiOperation(value = "Salvar cliente.")
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, value = "")
	public Cliente salvarCliente(@RequestBody Cliente cliente) throws ResourceNotFoundException {
		return clienteService.salvar(cliente);
	}

	@ApiOperation(value = "Deletar cliente pelo ID.")
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deletarClientePorId(@PathVariable(value = "id") Long id) {
		clienteService.deletar(id);
	}

	@ApiOperation(value = "Atualizar cliente pelo ID.")
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/{id}")
	public ResponseEntity<Cliente> atualizarCliente(@PathVariable(value = "id") Long id, @RequestBody Cliente clienteDetails)
			throws ResourceNotFoundException {
		
		Cliente clienteAtualizado = clienteService.atualizar(id, clienteDetails);
		return ResponseEntity.ok(clienteAtualizado);
	}

}
