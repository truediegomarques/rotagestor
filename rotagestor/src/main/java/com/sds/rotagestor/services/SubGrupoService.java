package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.SubGrupo;
import com.sds.rotagestor.repository.SubGruposRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubGrupoService {

    @Autowired
    private SubGruposRepository sbr;

    public Optional<SubGrupo> buscar(Integer id){
        Optional<SubGrupo> obj =  sbr.findById(id);
        return obj;
    }

    public List<SubGrupo> listar(){
        return sbr.findAll();
    }
    
}
