package com.sds.rotagestor.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ParcelaPagar;
import com.sds.rotagestor.repository.ParcelasPagarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParcelasPagarService {
    
    @Autowired
	private ParcelasPagarRepository pr;

    public Optional<ParcelaPagar> buscar(Integer id){
        Optional<ParcelaPagar> obj =  pr.findById(id);
        return obj;
    }

    public List<ParcelaPagar> listar(){
        return pr.findAll();
    }

    public List<ParcelaPagar> parcelasAberto(String status, Date dtinicio, Date dtfim){
        List<ParcelaPagar> obj = pr.parcelaaberto(status, dtinicio, dtfim);
        return obj;
    }
}