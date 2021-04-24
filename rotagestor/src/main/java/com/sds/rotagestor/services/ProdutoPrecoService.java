package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.ProdutoPreco;
import com.sds.rotagestor.repository.ProdutosPrecosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoPrecoService {
    
    @Autowired
	private ProdutosPrecosRepository pp;

    public Optional<ProdutoPreco> buscar(Integer id){
        Optional<ProdutoPreco> obj =  pp.findById(id);
        return obj;
    }

    public List<ProdutoPreco> listar(){
        return pp.findAll();
    }

}
