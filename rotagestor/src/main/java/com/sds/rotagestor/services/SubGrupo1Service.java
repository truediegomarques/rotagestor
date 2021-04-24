package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.SubGrupo1;
import com.sds.rotagestor.repository.SubGrupo1sRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubGrupo1Service {

    @Autowired
	private SubGrupo1sRepository sb1;

    public Optional<SubGrupo1> buscar(Integer id){
        Optional<SubGrupo1> obj =  sb1.findById(id);
        return obj;
    }

    public List<SubGrupo1> listar(){
        return sb1.findAll();
    }

}
