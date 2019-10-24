package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Preco;
import com.rota.repository.PrecoRepository;
import com.rota.services.exceptions.GrupoExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class PrecoService {

	@Autowired
	private PrecoRepository repo;

	public List<Preco> listar() {
		return repo.findAll();
	}

	public Preco salvar(Preco preco) {
		if (preco.getId() != null) {
			Optional<Preco> pr = repo.findById(preco.getId());

			if (!pr.isEmpty()) {
				throw new GrupoExisteException("O preco já existe!");
			}

		}
		return repo.save(preco);
	}

	public Preco buscar(Long id) {
		Optional<Preco> preco = repo.findById(id);

		if (preco.isEmpty()) {
			throw new NaoEncontradoException("Preco não encontrado!");
		}

		return preco.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O grupo não foi encontrado");
		}

	}

	public void atualizar(Preco preco) {
		verificarExistencia(preco);
		repo.save(preco);

	}

	private void verificarExistencia(Preco preco) {
		buscar(preco.getId());
	}

}
