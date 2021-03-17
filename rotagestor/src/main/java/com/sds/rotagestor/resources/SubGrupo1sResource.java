package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.SubGrupo1;
import com.sds.rotagestor.repository.SubGrupo1sRepository;

@RestController
@RequestMapping(value = "/subgrupo1s")
public class SubGrupo1sResource {

	@Autowired
	private SubGrupo1sRepository sb1;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<SubGrupo1> listar() {
		return sb1.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody SubGrupo1 subGrupo1) {
		sb1.save(subGrupo1);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<SubGrupo1> buscar(@PathVariable("id") Integer id) {
		return sb1.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		sb1.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody SubGrupo1 subGrupo1, @PathVariable("id") Integer id) {
		subGrupo1.setIdsubgrupo1(id);
		sb1.save(subGrupo1);
	}
}
