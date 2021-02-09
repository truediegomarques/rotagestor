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

import com.rota.domain.Finalizador;
import com.rota.services.FinalizadorService;

@RestController
@RequestMapping("/finalizador")
public class FinalizadorResources {

	@Autowired
	private FinalizadorService fServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Finalizador>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(fServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Finalizador finalizador) {
		fServ.salvar(finalizador);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(finalizador.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Finalizador finalizador = fServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(finalizador);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		fServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Finalizador finalizador, @PathVariable("id") Long id) {
		finalizador.setId(id);
		fServ.atualizar(finalizador);

		return ResponseEntity.noContent().build();
	}

}
