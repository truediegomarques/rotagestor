package com.sds.rotagestor.services;

import java.util.List;

import com.sds.rotagestor.domain.Venda;
import com.sds.rotagestor.repository.VendasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendaService {

    @Autowired
	private VendasRepository vr;

    public List<Venda> listar(){
        return vr.findAll();
    }
    
}
