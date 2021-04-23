package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Cadastrocaixa;
import com.sds.rotagestor.services.CadastroCaixaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/caixa")
public class CadastrocaixasResource {

	@Autowired
	private  CadastroCaixaService ccs;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cadastrocaixa> listar() {
		return ccs.listar();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Cadastrocaixa> buscar(@PathVariable("id") Integer id) {
		return ccs.buscar(id);
	}
	
}
