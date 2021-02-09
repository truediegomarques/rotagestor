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

import com.rota.domain.Funcionario;
import com.rota.services.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResources {

	@Autowired
	private FuncionarioService fServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Funcionario>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(fServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Funcionario funcionario) {
		fServ.salvar(funcionario);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(funcionario.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Funcionario funcionario = fServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(funcionario);
	}

	@RequestMapping(value = "/login/{login}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("login") String login) {

		Funcionario funcionario = fServ.buscar(login);

		return ResponseEntity.status(HttpStatus.OK).body(funcionario);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		fServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Funcionario funcionario, @PathVariable("id") Long id) {
		funcionario.setId(id);
		fServ.atualizar(funcionario);

		return ResponseEntity.noContent().build();
	}

}
