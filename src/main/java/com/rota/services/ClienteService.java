package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Cliente;
import com.rota.repository.ClienteRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class ClienteService {

	@Autowired
	public ClienteRepository repo;

	public List<Cliente> listar() {
		return repo.findAll();
	}
	
	public Cliente salvar(Cliente cliente) {
		if (cliente.getId() != null) {
			Optional<Cliente> cl = repo.findById(cliente.getId());

			if (!cl.isEmpty()) {
				throw new ExisteException("O cliente já existe!");
			}

		}
		return repo.save(cliente);
	}

	public Cliente buscar(Long id) {
		Optional<Cliente> cliente = repo.findById(id);

		if (cliente.isEmpty()) {
			throw new NaoEncontradoException("Cliente não encontrado!");
		}

		return cliente.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O clente não foi encontrado");
		}

	}
	
	public void atualizar(Cliente cliente) {
		verificarExistencia(cliente);
		repo.save(cliente);

	}

	private void verificarExistencia(Cliente cliente) {
		buscar(cliente.getId());
	}

	
	

}
