package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.domain.uteis.ProdutoEstoqueEan;
import com.sds.rotagestor.repository.ProdutosRepository;

@RestController
@RequestMapping(value = "/produtos")	
public class ProdutosResource {
	
	@Autowired
	private ProdutosRepository pr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Produto> listar() {
		return pr.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Produto produto) {
		pr.save(produto);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Produto> buscar(@PathVariable("id") Integer id) {
		return pr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		pr.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody Produto produto, @PathVariable("id") Integer id) {
		produto.setIdProduto(id);
		pr.save(produto);
	}

	/**
	 * 
	*@RequestMapping(value = "/pesquisaporean", method = RequestMethod.GET)
	public List<ProdutoEstoqueEan> pesquisaPorEan(@RequestParam(value = "codbarras", defaultValue = "0") String codbarras){
		Long e1 = Long.parseLong(codbarras);
		return pr.pesquisaPorEan(e1);
	}
 	*/

	@RequestMapping(value = "/pesquisaporean", method = RequestMethod.GET)
	public List<ProdutoEstoqueEan> pesquisaPorEan(@RequestParam(value = "codbarras", defaultValue = "0") String codbarras,
		@RequestParam(value = "loja", defaultValue = "0") String loja){
		Long e1 = Long.parseLong(codbarras);
		int l1 = Integer.parseInt(loja);
		return pr.pesquisaPorEan(e1,l1);
	}
	
}
