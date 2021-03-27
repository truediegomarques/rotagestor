package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.ProdutoEstoque;
import com.sds.rotagestor.repository.ProdutoEstoqueRepository;

@RestController
@RequestMapping(value = "/produtoestoque")	
public class ProdutoEstoqueResource {
	
	@Autowired
	private ProdutoEstoqueRepository per;

	@RequestMapping(method = RequestMethod.GET)
	public List<ProdutoEstoque> listar() {
		return per.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<ProdutoEstoque> buscar(@PathVariable("id") Integer id) {
		return per.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody ProdutoEstoque produtoEstoque, @PathVariable("id") Integer id) {
		produtoEstoque.setIdprodutoEstoque(id);
		per.save(produtoEstoque);
	}
	
}
