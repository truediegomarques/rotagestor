package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Grupo;
import com.sds.rotagestor.repository.GruposRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GrupoService {

    @Autowired
    private GruposRepository gr;
    
    public Optional<Grupo> buscar(Integer id){
        Optional<Grupo> obj =  gr.findById(id);
        return obj;
    }

    public List<Grupo> listar(){
        return gr.findAll();
    }

}
