package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Grupo;
import com.sds.rotagestor.repository.GruposRepository;

@RestController
@RequestMapping(value = "/grupos")
public class GruposResource {

	@Autowired
	private GruposRepository gr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Grupo> listar() {
		return gr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Grupo> buscar(@PathVariable("id") Integer id) {
		return gr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody Grupo grupo, @PathVariable("id") Integer id) {
		grupo.setIDGRUPO(id);
		gr.save(grupo);
	}

}
