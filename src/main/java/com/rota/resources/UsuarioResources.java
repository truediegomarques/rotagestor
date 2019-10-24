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

import com.rota.domain.Usuario;
import com.rota.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResources {

	@Autowired
	private UsuarioService uServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Usuario>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(uServ.listar());
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Usuario usuario) {
		uServ.salvar(usuario);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(usuario.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Usuario usuario = uServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(usuario);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		uServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Usuario usuario, @PathVariable("id") Long id) {
		usuario.setId(id);
		uServ.atualizar(usuario);

		return ResponseEntity.noContent().build();
	}

}
