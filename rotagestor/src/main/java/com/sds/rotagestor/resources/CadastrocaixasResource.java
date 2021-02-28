package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Cadastrocaixa;
import com.sds.rotagestor.repository.CadastrocaixasRepository;

@RestController
@RequestMapping(value = "/clientes")
public class CadastrocaixasResource {

	@Autowired
	private  CadastrocaixasRepository ccr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cadastrocaixa> listar() {
		return ccr.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Cadastrocaixa cadastrocaixa) {
		ccr.save(cadastrocaixa);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Cadastrocaixa> buscar(@PathVariable("id") Integer id) {
		return ccr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		ccr.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody Cadastrocaixa cadastrocaixa, @PathVariable("id") Integer id) {
		cadastrocaixa.setIDCadastroCaixa(id);
		ccr.save(cadastrocaixa);
	}
	
}
