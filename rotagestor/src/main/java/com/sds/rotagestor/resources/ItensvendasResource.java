package com.sds.rotagestor.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Itensvenda;
import com.sds.rotagestor.domain.uteis.TotalPorProduto;
import com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1;
import com.sds.rotagestor.repository.ItensvendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itensvendas")
public class ItensvendasResource {

	@Autowired
	private ItensvendasRepository ivr;

	@RequestMapping(method = RequestMethod.GET)
	public List<Itensvenda> listar() {
		return ivr.findAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Optional<Itensvenda> buscar(@PathVariable("id") Integer id) {
		return ivr.findById(id);
	}

	@RequestMapping(value = "/periodo", method = RequestMethod.GET)
	public List<Itensvenda> listarPeriodo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);

		return ivr.periodo(d1,d2);
	}

	@RequestMapping(value = "/periodoproduto", method = RequestMethod.GET)
	public List<TotalPorProduto> listarPeriodoProduto(
			@RequestParam(value = "idproduto", defaultValue = "0") String idproduto,
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		Integer i1 = Integer.parseInt(idproduto);

		return ivr.periodoTotalProdutoPeriodo(i1,d1,d2);
	}

	@RequestMapping(value = "/periodototalsubgrupo1", method = RequestMethod.GET)
	public List<TotalPorSubGrupo1> listarPeriodoSubgrupo1(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);

		return ivr.periodoTotalSubgrupo1(d1,d2);
	}

	@RequestMapping(value = "/periodototalsubgrupo", method = RequestMethod.GET)
	public List<TotalPorSubGrupo1> listarPeriodoSubgrupo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);

		return ivr.periodoTotalSubgrupo(d1,d2);
	}

	@RequestMapping(value = "/periodototalgrupo", method = RequestMethod.GET)
	public List<TotalPorSubGrupo1> listarPeriodoGrupo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);

		return ivr.periodoTotalGrupo(d1,d2);
	}

}
