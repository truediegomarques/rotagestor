package com.sds.rotagestor.resources;

import java.util.List;

import com.sds.rotagestor.domain.Venda;
import com.sds.rotagestor.services.VendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vendas")	
public class VendasResource {
	
	@Autowired
	private VendaService vs;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		List<Venda> obj = vs.listar();
		return ResponseEntity.ok().body(obj);
	}
	
}
