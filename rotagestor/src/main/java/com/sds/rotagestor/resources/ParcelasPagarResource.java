package com.sds.rotagestor.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ParcelaPagar;
import com.sds.rotagestor.repository.ParcelasPagarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/parcelaspagar")
public class ParcelasPagarResource {

	@Autowired
	private ParcelasPagarRepository pr;

	@RequestMapping(method = RequestMethod.GET)
	public List<ParcelaPagar> listar() {
		return pr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<ParcelaPagar> buscar(@PathVariable("id") Integer id) {
		return pr.findById(id);
	}

	@RequestMapping(value = "/parcelasaberto", method = RequestMethod.GET)
	public List<ParcelaPagar> listarPeriodoGrupo(
			@RequestParam(value = "status", defaultValue = "A") String status,
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);

		return pr.parcelaaberto(status,d1,d2);
	}
}
