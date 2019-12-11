package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.TituloReceber;
import com.rota.repository.TituloReceberRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class TituloReceberService {

	@Autowired
	private TituloReceberRepository repo;

	public List<TituloReceber> listar() {
		return repo.findAll();
	}

	public TituloReceber salvar(TituloReceber titulo) {
		if (titulo.getId() != null) {
			Optional<TituloReceber> tt = repo.findById(titulo.getId());

			if (!tt.isEmpty()) {
				throw new ExisteException("O Titulo já existe!");
			}

		}
		return repo.save(titulo);
	}

	public TituloReceber buscar(Long id) {
		Optional<TituloReceber> titulo = repo.findById(id);

		if (titulo.isEmpty()) {
			throw new NaoEncontradoException("Titulo não encontrado!");
		}

		return titulo.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O Titulo não foi encontrado");
		}

	}
	
	public void atualizar(TituloReceber titulo) {
		verificarExistencia(titulo);
		repo.save(titulo);

	}

	private void verificarExistencia(TituloReceber titulo) {
		buscar(titulo.getId());
	}

}
