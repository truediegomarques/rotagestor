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

import com.rota.domain.Secao;
import com.rota.services.SecaoService;

@RestController
@RequestMapping("/secao")
public class SecaoResources {

	@Autowired
	private SecaoService sServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Secao>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(sServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Secao secao) {
		sServ.salvar(secao);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(secao.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Secao secao = sServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(secao);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		sServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Secao secao, @PathVariable("id") Long id) {
		secao.setId(id);
		sServ.atualizar(secao);

		return ResponseEntity.noContent().build();
	}

}
