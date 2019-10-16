package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Grupo;
import com.rota.repository.GrupoRepository;
import com.rota.services.exceptions.GrupoExisteException;
import com.rota.services.exceptions.GrupoNaoEncontradoException;

@Service
public class GrupoService {

	@Autowired
	private GrupoRepository repo;

	public List<Grupo> listar() {
		return repo.findAll();
	}

	public Grupo salvar(Grupo grupo) {
		if (grupo.getId() != null) {
			Optional<Grupo> gp = repo.findById(grupo.getId());

			if (!gp.isEmpty()) {
				throw new GrupoExisteException("O grupo já existe!");
			}

		}
		return repo.save(grupo);
	}

	public Grupo buscar(Long id) {
		Optional<Grupo> grupo = repo.findById(id);

		if (grupo.isEmpty()) {
			throw new GrupoNaoEncontradoException("Grupo não encontrado!");
		}

		return grupo.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new GrupoNaoEncontradoException("O grupo não foi encontrado");
		}

	}
	
	public void atualizar(Grupo grupo) {
		verificarExistencia(grupo);
		repo.save(grupo);

	}

	private void verificarExistencia(Grupo grupo) {
		buscar(grupo.getId());
	}

}
