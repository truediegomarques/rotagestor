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

import com.rota.domain.TabelaPreco;
import com.rota.services.TabelaPrecoService;

@RestController
@RequestMapping("/tabealPreco")
public class TabelaPrecoResources {

	@Autowired
	private TabelaPrecoService tpServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TabelaPreco>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(tpServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody TabelaPreco tabelaPreco) {
		tpServ.salvar(tabelaPreco);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(tabelaPreco.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		TabelaPreco tabelaPreco = tpServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(tabelaPreco);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		tpServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody TabelaPreco tabelaPreco, @PathVariable("id") Long id) {
		tabelaPreco.setId(id);
		tpServ.atualizar(tabelaPreco);

		return ResponseEntity.noContent().build();
	}

}
