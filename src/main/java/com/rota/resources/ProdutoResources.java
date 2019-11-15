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

import com.rota.domain.Produto;
import com.rota.domain.SubGrupo;
import com.rota.services.ProdutoService;
import com.rota.services.SubGrupoService;

@RestController
@RequestMapping("/produto")
public class ProdutoResources {

	@Autowired
	private ProdutoService pServ;
	
	@Autowired
	private SubGrupoService sbServ;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Produto>> listar() {
		return ResponseEntity.status(HttpStatus.OK).body(pServ.listar());
	}
	
	@RequestMapping(value = "subgrupo/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarPorSubGrupo(@PathVariable("id") Long id) {

		SubGrupo subGrupo = sbServ.buscar(id);
		return ResponseEntity.status(HttpStatus.OK).body(pServ.listarPorSubGrupo(subGrupo));
	}


	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvar(@Valid @RequestBody Produto produto) {
		pServ.salvar(produto);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId())
				.toUri();

		return ResponseEntity.created(uri).build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Long id) {

		Produto produto = pServ.buscar(id);

		return ResponseEntity.status(HttpStatus.OK).body(produto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id) {
		pServ.deletar(id);

		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> atualizar(@RequestBody Produto produto, @PathVariable("id") Long id) {
		produto.setId(id);
		pServ.atualizar(produto);

		return ResponseEntity.noContent().build();
	}

}
