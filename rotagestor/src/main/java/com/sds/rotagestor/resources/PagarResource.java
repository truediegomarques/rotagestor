package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Pagar;
import com.sds.rotagestor.repository.PagarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pagar")
public class PagarResource {

	@Autowired
	private PagarRepository pr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Pagar> listar() {
		return pr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Pagar> buscar(@PathVariable("id") Integer id) {
		return pr.findById(id);
	}

}
