package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.TabelaPreco;
import com.rota.repository.TabelaPrecoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class TabelaPrecoService {

	@Autowired
	public TabelaPrecoRepository repo;

	public List<TabelaPreco> listar() {
		return repo.findAll();
	}

	public TabelaPreco salvar(TabelaPreco tabelaPreco) {
		if (tabelaPreco.getId() != null) {
			Optional<TabelaPreco> tp = repo.findById(tabelaPreco.getId());

			if (!tp.isEmpty()) {
				throw new ExisteException("A tabela de preço já existe!");
			}

		}
		return repo.save(tabelaPreco);
	}

	public TabelaPreco buscar(Long id) {
		Optional<TabelaPreco> tabelaPreco = repo.findById(id);

		if (tabelaPreco.isEmpty()) {
			throw new NaoEncontradoException("A Tabela de Preços não encontrada!");
		}

		return tabelaPreco.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O tabelaPreco não foi encontrado");
		}

	}

	public void atualizar(TabelaPreco tabelaPreco) {
		verificarExistencia(tabelaPreco);
		repo.save(tabelaPreco);

	}

	private void verificarExistencia(TabelaPreco tabelaPreco) {
		buscar(tabelaPreco.getId());
	}

}
