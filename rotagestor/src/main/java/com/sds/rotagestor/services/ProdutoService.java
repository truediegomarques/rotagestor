package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Produto;
import com.sds.rotagestor.repository.ProdutosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    
    @Autowired
	private ProdutosRepository pr;

    public Optional<Produto> buscar(Integer id){
        Optional<Produto> obj =  pr.findById(id);
        return obj;
    }

    public List<Produto> listar(){
        return pr.findAll();
    }

    public List<Produto> pesquisaPorEan(Long ean){
        List<Produto> obj = pr.pesquisaPorEan(ean);
        return obj;
    }

}
