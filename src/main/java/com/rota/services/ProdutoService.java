package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Produto;
import com.rota.repository.ProdutoRepository;
import com.rota.services.exceptions.GrupoNaoEncontradoException;
import com.rota.services.exceptions.ProdutoExisteException;
import com.rota.services.exceptions.ProdutoNaoEncontradoException;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public List<Produto> listar() {
		return repo.findAll();
	}
	
	public Produto salvar(Produto produto) {
		if (produto.getId() != null) {
			Optional<Produto> prod = repo.findById(produto.getId());

			if (!prod.isEmpty()) {
				throw new ProdutoExisteException("O produto já existe!");
			}

		}
		return repo.save(produto);
	}

	public Produto buscar(Long id) {
		Optional<Produto> produto = repo.findById(id);

		if (produto.isEmpty()) {
			throw new ProdutoNaoEncontradoException("O Produto não foi encontrado");
		}

		return produto.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new GrupoNaoEncontradoException("O Produto não foi encontrado");
		}

	}
	
	public void atualizar(Produto produto) {
		verificarExistencia(produto);
		repo.save(produto);

	}

	private void verificarExistencia(Produto produto) {
		buscar(produto.getId());
	}
	
}
