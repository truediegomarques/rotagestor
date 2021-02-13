package com.sds.rotagestor.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sds.rotagestor.domain.Venda;
import com.sds.rotagestor.repository.VendasRepository;

@RestController
@RequestMapping(value = "/vendas")	
public class VendasResource {
	
	@Autowired
	private VendasRepository vr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Venda> listar() {
		return vr.findAll();
	}
	
}
