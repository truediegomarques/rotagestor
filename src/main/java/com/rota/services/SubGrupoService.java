package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.SubGrupo;
import com.rota.repository.SubGrupoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class SubGrupoService {

	@Autowired
	private SubGrupoRepository repo;

	public List<SubGrupo> listar() {
		return repo.findAll();
	}

	public SubGrupo salvar(SubGrupo subGrupo) {
		if (subGrupo.getId() != null) {
			Optional<SubGrupo> sg = repo.findById(subGrupo.getId());

			if (!sg.isEmpty()) {
				throw new ExisteException("O SubGrupo já existe!");
			}

		}
		return repo.save(subGrupo);
	}

	public SubGrupo buscar(Long id) {
		Optional<SubGrupo> subGrupo = repo.findById(id);

		if (subGrupo.isEmpty()) {
			throw new NaoEncontradoException("SubGrupo não encontrado!");
		}

		return subGrupo.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O grupo não foi encontrado");
		}

	}
	
	public void atualizar(SubGrupo subGrupo) {
		verificarExistencia(subGrupo);
		repo.save(subGrupo);

	}

	private void verificarExistencia(SubGrupo subGrupo) {
		buscar(subGrupo.getId());
	}

}
