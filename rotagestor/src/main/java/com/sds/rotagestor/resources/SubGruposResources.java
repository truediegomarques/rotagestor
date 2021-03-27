package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.SubGrupo;
import com.sds.rotagestor.repository.SubGruposRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/subgrupos")
public class SubGruposResources {

	@Autowired
	private SubGruposRepository sbr;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<SubGrupo> listar() {
		return sbr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<SubGrupo> buscar(@PathVariable("id") Integer id) {
		return sbr.findById(id);
	}

}
