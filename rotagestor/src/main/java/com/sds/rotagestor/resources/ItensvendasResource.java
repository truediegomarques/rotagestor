package com.sds.rotagestor.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Itensvenda;
import com.sds.rotagestor.domain.uteis.TicketMedio;
import com.sds.rotagestor.domain.uteis.TotalPorProduto;
import com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1;
import com.sds.rotagestor.domain.uteis.VendaPorCaixa;
import com.sds.rotagestor.services.ItensVendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itensvendas")
public class ItensvendasResource {

	@Autowired
	private ItensVendaService ivs;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listar() {
		List<Itensvenda> itens = ivs.listar();
		return ResponseEntity.ok().body(itens);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable("id") Integer id) {
		Optional<Itensvenda> item = ivs.buscar(id);
		return ResponseEntity.ok().body(item);
	}

	@RequestMapping(value = "/periodo", method = RequestMethod.GET)
	public ResponseEntity<?> listarPeriodo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		List<Itensvenda> itens = ivs.porPeriodo(d1, d2);
		return ResponseEntity.ok().body(itens);
	}

	@RequestMapping(value = "/periodoproduto", method = RequestMethod.GET)
	public ResponseEntity<?>  listarPeriodoProduto(
			@RequestParam(value = "idproduto", defaultValue = "0") String idproduto,
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		Integer i1 = Integer.parseInt(idproduto);
		List<TotalPorProduto> obj = ivs.porPeriodoTotalProduto(i1,d1,d2);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/periodototalsubgrupo1", method = RequestMethod.GET)
	public ResponseEntity<?> listarPeriodoSubgrupo1(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		List<TotalPorSubGrupo1> obj = ivs.porPeriodoTotalSubgrupo1(d1, d2);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/periodototalsubgrupo", method = RequestMethod.GET)
	public ResponseEntity<?> listarPeriodoSubgrupo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		List<TotalPorSubGrupo1> obj = ivs.porPeriodoTotalSubgrupo(d1, d2);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/periodototalgrupo", method = RequestMethod.GET)
	public ResponseEntity<?> listarPeriodoGrupo(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		List<TotalPorSubGrupo1> obj = ivs.porPeriodoTotalGrupo(d1, d2);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/ticketmedio", method = RequestMethod.GET)
	public ResponseEntity<?> ticketMedio(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim,
			@RequestParam(value = "loja", defaultValue = "1") String loja) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		int lj1 = Integer.parseInt(loja);
		List<TicketMedio> obj = ivs.porTicketMedio(d1, d2, lj1);		
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(value = "/vendaporcaixa", method = RequestMethod.GET)
	public ResponseEntity<?> vendaPorCaixa(
			@RequestParam(value = "dtinicio", defaultValue = "1950-01-01") String dtinicio,
			@RequestParam(value = "dtfim", defaultValue = "1950-01-01") String dtfim,
			@RequestParam(value = "loja", defaultValue = "1") String loja) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = sdf.parse(dtinicio);
		Date d2 = sdf.parse(dtfim);
		int lj1 = Integer.parseInt(loja);
		List<VendaPorCaixa> obj = ivs.porVendaPorCaixa(d1, d2, lj1); 
		return ResponseEntity.ok().body(obj);
	}

}