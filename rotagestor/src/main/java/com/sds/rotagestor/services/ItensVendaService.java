package com.sds.rotagestor.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Itensvenda;
import com.sds.rotagestor.domain.uteis.TicketMedio;
import com.sds.rotagestor.domain.uteis.TotalPorProduto;
import com.sds.rotagestor.domain.uteis.TotalPorSubGrupo1;
import com.sds.rotagestor.domain.uteis.VendaPorCaixa;
import com.sds.rotagestor.repository.ItensvendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItensVendaService {
    
    @Autowired
	private ItensvendasRepository ivr;

    public Optional<Itensvenda> buscar(Integer id){
        Optional<Itensvenda> obj =  ivr.findById(id);
        return obj;
    }

    public List<Itensvenda> listar(){
        return ivr.findAll();
    }

    public List<Itensvenda> porPeriodo(Date dtinicio, Date dtfim){
        List<Itensvenda> obj = ivr.periodo(dtinicio, dtfim);
        return obj;
    }

    public List<TotalPorProduto> porPeriodoTotalProduto(Integer id, Date dtinicio, Date dtfim){
        List<TotalPorProduto> obj = ivr.periodoTotalProduto(id,dtinicio, dtfim);
        return obj;
    }

    public List<TotalPorSubGrupo1> porPeriodoTotalSubgrupo1(Date dtinicio, Date dtfim){
        List<TotalPorSubGrupo1> obj = ivr.periodoTotalSubgrupo1(dtinicio, dtfim);
        return obj;
    }

    public List<TotalPorSubGrupo1> porPeriodoTotalSubgrupo(Date dtinicio, Date dtfim){
        List<TotalPorSubGrupo1> obj = ivr.periodoTotalSubgrupo(dtinicio, dtfim);
        return obj;
    }

    public List<TotalPorSubGrupo1> porPeriodoTotalGrupo(Date dtinicio, Date dtfim){
        List<TotalPorSubGrupo1> obj = ivr.periodoTotalGrupo(dtinicio, dtfim);
        return obj;
    }

    public List<TicketMedio> porTicketMedio(Date dtinicio, Date dtfim, Integer lj){
        List<TicketMedio> obj = ivr.ticketMedio(dtinicio, dtfim, lj);
        return obj;
    }

    public List<VendaPorCaixa> porVendaPorCaixa(Date dtinicio, Date dtfim, Integer lj){
        List<VendaPorCaixa> obj = ivr.vendaPorCaixa(dtinicio, dtfim, lj);
        return obj;
    }    

}
