package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Cliente;
import com.sds.rotagestor.repository.ClientesRepository;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesResource {

	@Autowired
	private ClientesRepository cr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Cliente> listar() {
		return cr.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	public void salvar(@RequestBody Cliente cliente) {
		cr.save(cliente);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Cliente> buscar(@PathVariable("id") Integer id) {
		return cr.findById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deletar(@PathVariable("id") Integer id) {
		cr.deleteById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public void deletar(@RequestBody Cliente cliente, @PathVariable("id") Integer id) {
		cliente.setIdCliente(id);
		cr.save(cliente);
	}
	
}
