package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.repository.ProdutosRepository;
import com.sds.rotagestor.services.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")	
public class ProdutosResource {
	
	@Autowired
	private ProdutoService ps;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		List<Produto> obj = ps.listar();
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
		Optional<Produto> obj = ps.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/pesquisaporean", method = RequestMethod.GET)
	public ResponseEntity<?> pesquisaPorEan(@RequestParam(value = "codbarras", defaultValue = "0") String codbarras){
		Long e1 = Long.parseLong(codbarras);
		List<Produto> obj = ps.pesquisaPorEan(e1);
		return ResponseEntity.ok().body(obj);
	}

}
