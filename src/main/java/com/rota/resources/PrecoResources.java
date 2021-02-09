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

import com.rota.domain.Preco;
import com.rota.services.PrecoService;

@RestController
@RequestMapping("/preco")
public class PrecoResources {

	@Autowired
	private PrecoService pServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Preco>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(pServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Preco preco) {
		pServ.salvar(preco);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(preco.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Preco preco = pServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(preco);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		pServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Preco preco, @PathVariable("id") Long id) {
		preco.setId(id);
		pServ.atualizar(preco);

		return ResponseEntity.noContent().build();
	}

}
