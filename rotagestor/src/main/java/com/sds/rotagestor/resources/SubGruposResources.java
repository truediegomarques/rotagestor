package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.SubGrupo;
import com.sds.rotagestor.repository.SubGruposRepository;

@RestController
@RequestMapping(value = "/subGrupos")
public class SubGruposResources {

	@Autowired
	private SubGruposRepository sbr;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<SubGrupo> listar() {
		return sbr.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody SubGrupo subGrupo) {
		sbr.save(subGrupo);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<SubGrupo> buscar(@PathVariable("id") Integer id) {
		return sbr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		sbr.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody SubGrupo subGrupo, @PathVariable("id") Integer id) {
		subGrupo.setId(id);
		sbr.save(subGrupo);
	}

	
}
