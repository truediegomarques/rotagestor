package com.sds.rotagestor.resources;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sds.rotagestor.domain.Grupo;
import com.sds.rotagestor.dto.GrupoDTO;
import com.sds.rotagestor.services.GrupoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<?> listar() {
		List<Grupo> grupos = gs.listar();
		List<GrupoDTO> gruporetorno = grupos.stream().map(grp -> new GrupoDTO(grp)).collect(Collectors.toList());
		return ResponseEntity.ok().body(gruporetorno);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
		Optional<Grupo> grupo = gs.buscar(id);
		return ResponseEntity.ok().body(grupo);
	}

	

}
