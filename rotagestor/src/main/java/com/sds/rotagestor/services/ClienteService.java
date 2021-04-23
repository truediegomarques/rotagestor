package com.sds.rotagestor.services;

import java.util.List;
import java.util.Optional;

import com.sds.rotagestor.domain.Cliente;
import com.sds.rotagestor.repository.ClientesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
	private ClientesRepository cr;

    public List<Cliente> listar(){
        return cr.findAll();    
    }

    public Optional<Cliente> buscar(Integer id){
        Optional<Cliente> obj = cr.findById(id);
        return obj;
    }

    public void salvar(Cliente cliente){
        cr.save(cliente);
    }

    public void apagar(Integer id){
        cr.deleteById(id);
    }        
    
}
