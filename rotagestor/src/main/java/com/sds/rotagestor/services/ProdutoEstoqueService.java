package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ProdutoEstoque;
import com.sds.rotagestor.repository.ProdutoEstoqueRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ProdutoEstoqueService {

    @Autowired
	private ProdutoEstoqueRepository per;
    
    public Optional<ProdutoEstoque > buscar(Integer id){
        Optional<ProdutoEstoque> obj =  per.findById(id);
        return obj;
    }

    public List<ProdutoEstoque> listar(){
        return per.findAll();
    }
}
