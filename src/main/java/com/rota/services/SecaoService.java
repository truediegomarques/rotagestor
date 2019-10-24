package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Secao;
import com.rota.repository.SecaoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class SecaoService {

	@Autowired
	public SecaoRepository repo;

	public List<Secao> listar() {
		return repo.findAll();
	}

	public Secao salvar(Secao secao) {
		if (secao.getId() != null) {
			Optional<Secao> sc = repo.findById(secao.getId());

			if (!sc.isEmpty()) {
				throw new ExisteException("A seção já existe!");
			}

		}
		return repo.save(secao);
	}

	public Secao buscar(Long id) {
		Optional<Secao> secao = repo.findById(id);

		if (secao.isEmpty()) {
			throw new NaoEncontradoException("Seção não encontrada!");
		}

		return secao.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("A seção não foi encontrada");
		}

	}

	public void atualizar(Secao secao) {
		verificarExistencia(secao);
		repo.save(secao);

	}

	private void verificarExistencia(Secao secao) {
		buscar(secao.getId());
	}

}
