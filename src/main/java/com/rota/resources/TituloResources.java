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

import com.rota.domain.Titulo;
import com.rota.services.TituloService;

@RestController
@RequestMapping("/titulo")
public class TituloResources {

	@Autowired
	private TituloService tServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Titulo>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(tServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Titulo titulo) {
		tServ.salvar(titulo);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(titulo.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Titulo titulo = tServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(titulo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		tServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Titulo titulo, @PathVariable("id") Long id) {
		titulo.setId(id);
		tServ.atualizar(titulo);

		return ResponseEntity.noContent().build();
	}

}
