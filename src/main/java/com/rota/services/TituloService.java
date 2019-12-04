package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Titulo;
import com.rota.repository.TituloRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class TituloService {

	@Autowired
	private TituloRepository repo;

	public List<Titulo> listar() {
		return repo.findAll();
	}

	public Titulo salvar(Titulo titulo) {
		if (titulo.getId() != null) {
			Optional<Titulo> tt = repo.findById(titulo.getId());

			if (!tt.isEmpty()) {
				throw new ExisteException("O Titulo já existe!");
			}

		}
		return repo.save(titulo);
	}

	public Titulo buscar(Long id) {
		Optional<Titulo> titulo = repo.findById(id);

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
	
	public void atualizar(Titulo titulo) {
		verificarExistencia(titulo);
		repo.save(titulo);

	}

	private void verificarExistencia(Titulo titulo) {
		buscar(titulo.getId());
	}

}
