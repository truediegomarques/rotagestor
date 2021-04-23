package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Fornecedor;
import com.sds.rotagestor.repository.FornecedoresRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FornecedorService {

    @Autowired
	private FornecedoresRepository fr;

    public List<Fornecedor> listar(){
        return fr.findAll();
    }

    public Optional<Fornecedor> Buscar(Integer id){
        Optional<Fornecedor> obj = fr.findById(id);
        return obj;
    }
    
}
