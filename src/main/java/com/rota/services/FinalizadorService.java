package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Finalizador;
import com.rota.repository.FinalizadorRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class FinalizadorService {

	@Autowired
	public FinalizadorRepository repo;

	public List<Finalizador> listar() {
		return repo.findAll();
	}

	public Finalizador salvar(Finalizador finalizador) {
		if (finalizador.getId() != null) {
			Optional<Finalizador> fi = repo.findById(finalizador.getId());

			if (!fi.isEmpty()) {
				throw new ExisteException("O Finalizador já existe!");
			}

		}
		return repo.save(finalizador);
	}

	public Finalizador buscar(Long id) {
		Optional<Finalizador> finalizador = repo.findById(id);

		if (finalizador.isEmpty()) {
			throw new NaoEncontradoException("Finalizador não encontrado!");
		}

		return finalizador.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O finalizador não foi encontrado");
		}

	}

	public void atualizar(Finalizador finalizador) {
		verificarExistencia(finalizador);
		repo.save(finalizador);

	}

	private void verificarExistencia(Finalizador finalizador) {
		buscar(finalizador.getId());
	}

}
