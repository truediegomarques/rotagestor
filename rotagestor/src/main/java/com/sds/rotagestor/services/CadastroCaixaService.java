package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Cadastrocaixa;
import com.sds.rotagestor.repository.CadastrocaixasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroCaixaService {

    @Autowired
    private CadastrocaixasRepository ccr;

    public Optional<Cadastrocaixa> buscar(Integer id){
        Optional<Cadastrocaixa> obj = ccr.findById(id);
        return obj;
    }

    public List<Cadastrocaixa> listar(){
        return ccr.findAll();
    }
    
}
