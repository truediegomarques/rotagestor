package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Fornecedor;
import com.sds.rotagestor.repository.FornecedoresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedoresResource {

	@Autowired
	private FornecedoresRepository fr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Fornecedor> listar() {
		return fr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Fornecedor> buscar(@PathVariable("id") Integer id) {
		return fr.findById(id);
	}

}
