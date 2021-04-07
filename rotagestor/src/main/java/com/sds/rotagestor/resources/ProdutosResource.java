package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.repository.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtos")	
public class ProdutosResource {
	
	@Autowired
	private ProdutosRepository pr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Produto> listar() {
		return pr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Produto> buscar(@PathVariable("id") Integer id) {
		return pr.findById(id);
	}

	@RequestMapping(value = "/pesquisaporean", method = RequestMethod.GET)
	public List<Produto> pesquisaPorEan(@RequestParam(value = "codbarras", defaultValue = "0") String codbarras){
		Long e1 = Long.parseLong(codbarras);
		return pr.pesquisaPorEan(e1);
	}

}
