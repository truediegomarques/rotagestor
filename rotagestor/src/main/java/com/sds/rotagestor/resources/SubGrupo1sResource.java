package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.SubGrupo1;
import com.sds.rotagestor.repository.SubGrupo1sRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/subgrupo1s")
public class SubGrupo1sResource {

	@Autowired
	private SubGrupo1sRepository sb1;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<SubGrupo1> listar() {
		return sb1.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<SubGrupo1> buscar(@PathVariable("id") Integer id) {
		return sb1.findById(id);
	}

}
