package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Cliente;
import com.sds.rotagestor.services.ClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesResource {

	@Autowired
	private ClienteService cs;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {
		return cs.listar();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Cliente> buscar(@PathVariable("id") Integer id) {
		return cs.buscar(id);
	}
}
