package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ProdutoPreco;
import com.sds.rotagestor.services.ProdutoPrecoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtosprecos")
public class ProdutosPrecosResource {

	@Autowired
	private ProdutoPrecoService pp;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		List<ProdutoPreco> obj = pp.listar();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
		Optional<ProdutoPreco> obj = pp.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
