package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Pagar;
import com.sds.rotagestor.repository.PagarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PagarService {
    
    @Autowired
    private PagarRepository pr;
    
    public Optional<Pagar> buscar(Integer id){
        Optional<Pagar> obj =  pr.findById(id);
        return obj;
    }

    public List<Pagar> listar(){
        return pr.findAll();
    }
}