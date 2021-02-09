package com.sds.rotagestor.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendas")	
public class VendasResource {

	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "lista";
	}
	
}
