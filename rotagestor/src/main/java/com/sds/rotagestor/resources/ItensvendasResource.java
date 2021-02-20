package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Itensvenda;
import com.sds.rotagestor.repository.ItensvendasRepository;

@RestController
@RequestMapping(value = "/itensvendas")
public class ItensvendasResource {
	
	@Autowired
	private ItensvendasRepository ivr;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Itensvenda> listar() {
		return ivr.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Itensvenda iv) {
		ivr.save(iv);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Itensvenda> buscar(@PathVariable("id") Integer id) {
		return ivr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		ivr.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody Itensvenda iv, @PathVariable("id") Integer id) {
		iv.setIdItensVenda(id);
		ivr.save(iv);
	}

}
