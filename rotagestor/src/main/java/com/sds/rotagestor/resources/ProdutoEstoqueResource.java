package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ProdutoEstoque;
import com.sds.rotagestor.services.ProdutoEstoqueService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtoestoque")	
public class ProdutoEstoqueResource {
	
	@Autowired
	private ProdutoEstoqueService pes;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		List<ProdutoEstoque> obj = pes.listar();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
		Optional<ProdutoEstoque> obj = pes.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
