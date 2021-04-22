package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Grupo;
import com.sds.rotagestor.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/grupos")
public class GruposResource {

	@Autowired
	private GrupoService gs;

	@RequestMapping(method = RequestMethod.GET)
	public List<Grupo> listar() {
		return gs.listar();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Grupo> buscar(@PathVariable("id") Integer id) {
		return gs.buscar(id);
	}

}
