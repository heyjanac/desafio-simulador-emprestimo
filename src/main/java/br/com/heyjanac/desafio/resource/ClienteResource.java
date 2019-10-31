package br.com.heyjanac.desafio.resource;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.heyjanac.desafio.dto.Cliente;
import br.com.heyjanac.desafio.exception.ResourceNotFoundException;
import br.com.heyjanac.desafio.repository.ClienteRepository;

@RestController
@RequestMapping("/api/v1")
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping("/clients")
	public List<Cliente> getAllClients() {
		return clienteRepository.findAll();
	}

	@GetMapping("/clients/{id}")
	public ResponseEntity<Cliente> getClientById(@PathVariable(value = "id") Long clientId)
			throws ResourceNotFoundException {
		Cliente client = clienteRepository.findById(clientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientId));
		return ResponseEntity.ok().body(client);
	}

	@PostMapping("/clients")
	public Cliente createClient(@Valid @RequestBody Cliente client) {
		return clienteRepository.save(client);
	}

    @PutMapping("/clients/{id}")
    public ResponseEntity<Cliente> updateClient(@PathVariable(value = "id") Long clientId,
         @Valid @RequestBody Cliente clientDetails) throws ResourceNotFoundException {
    	Cliente client = clienteRepository.findById(clientId)
        .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientId));

    	client.setEmail(clientDetails.getEmail());
    	client.setName(clientDetails.getName());
    	client.setCpf(clientDetails.getCpf());
        final Cliente updatedClient = clienteRepository.save(client);
        return ResponseEntity.ok(updatedClient);
    }
    
    @DeleteMapping("/clients/{id}")
    public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long clientId)
         throws ResourceNotFoundException {
        Cliente client = clienteRepository.findById(clientId)
       .orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + clientId));

        clienteRepository.delete(client);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
