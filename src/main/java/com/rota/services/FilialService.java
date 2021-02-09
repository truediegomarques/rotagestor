package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Filial;
import com.rota.repository.FilialRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class FilialService {

	@Autowired
	public FilialRepository repo;

	public List<Filial> listar() {
		return repo.findAll();
	}

	public Filial salvar(Filial filial) {
		if (filial.getId() != null) {
			Optional<Filial> cl = repo.findById(filial.getId());

			if (!cl.isEmpty()) {
				throw new ExisteException("O filial já existe!");
			}

		}
		return repo.save(filial);
	}

	public Filial buscar(Long id) {
		Optional<Filial> filial = repo.findById(id);

		if (filial.isEmpty()) {
			throw new NaoEncontradoException("Filial não encontrado!");
		}

		return filial.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O clente não foi encontrado");
		}

	}

	public void atualizar(Filial filial) {
		verificarExistencia(filial);
		repo.save(filial);

	}

	private void verificarExistencia(Filial filial) {
		buscar(filial.getId());
	}

}
