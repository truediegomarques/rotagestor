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
import com.rota.domain.SubGrupo;
import com.rota.services.GrupoService;
import com.rota.services.SubGrupoService;

@RestController
@RequestMapping("/subgrupo")
public class SubGrupoResources {

	@Autowired
	private SubGrupoService sgServ;

	@Autowired
	private GrupoService gServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SubGrupo>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(sgServ.listar());
	}

	@RequestMapping(value = "grupo/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarPorGrupo(@PathVariable("id") Long id) {

		Grupo grupo = gServ.buscar(id);
		return ResponseEntity.status(HttpStatus.OK).body(sgServ.listarPorGrupo(grupo));
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody SubGrupo subGrupo) {
		sgServ.salvar(subGrupo);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(subGrupo.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		SubGrupo subGrupo = sgServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(subGrupo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		sgServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody SubGrupo subGrupo, @PathVariable("id") Long id) {
		subGrupo.setId(id);
		sgServ.atualizar(subGrupo);

		return ResponseEntity.noContent().build();
	}

}
