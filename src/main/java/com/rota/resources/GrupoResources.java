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

import com.rota.domain.Grupo;
import com.rota.services.GrupoService;

@RestController
@RequestMapping("/grupo")
public class GrupoResources {

	@Autowired
	private GrupoService gServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Grupo>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(gServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Grupo grupo) {
		gServ.salvar(grupo);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(grupo.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Grupo grupo = gServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(grupo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		gServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Grupo grupo, @PathVariable("id") Long id) {
		grupo.setId(id);
		gServ.atualizar(grupo);

		return ResponseEntity.noContent().build();
	}

}
