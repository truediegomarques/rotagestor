package com.rota.resources;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rota.domain.Cliente;
import com.rota.services.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteResources {

	@Autowired
	private ClienteService cServ;

	public ResponseEntity<List<Cliente>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(cServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Cliente cliente) {
		cServ.salvar(cliente);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(cliente.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Cliente cliente = cServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(cliente);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		cServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Cliente cliente, @PathVariable("id") Long id) {
		cliente.setId(id);
		cServ.atualizar(cliente);

		return ResponseEntity.noContent().build();
	}

}
