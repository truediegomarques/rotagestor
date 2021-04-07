package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ProdutoPreco;
import com.sds.rotagestor.repository.ProdutosPrecosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produtosprecos")
public class ProdutosPrecosResource {

	@Autowired
	private ProdutosPrecosRepository pp;

	@RequestMapping(method = RequestMethod.GET)
	public List<ProdutoPreco> listar() {
		return pp.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<ProdutoPreco> buscar(@PathVariable("id") Integer id) {
		return pp.findById(id);
	}

}
