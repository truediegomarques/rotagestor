package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.Pedido;
import com.rota.repository.PedidoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class PedidoService {

	@Autowired
	public PedidoRepository repo;

	public List<Pedido> listar() {
		return repo.findAll();
	}

	public Pedido salvar(Pedido pedido) {
		if (pedido.getId() != null) {
			Optional<Pedido> cl = repo.findById(pedido.getId());

			if (!cl.isEmpty()) {
				throw new ExisteException("O Pedido já existe!");
			}

		}
		return repo.save(pedido);
	}

	public Pedido buscar(Long id) {
		Optional<Pedido> pedido = repo.findById(id);

		if (pedido.isEmpty()) {
			throw new NaoEncontradoException("Pedido não encontrado!");
		}

		return pedido.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O clente não foi encontrado");
		}

	}

	public void atualizar(Pedido pedido) {
		verificarExistencia(pedido);
		repo.save(pedido);

	}

	private void verificarExistencia(Pedido pedido) {
		buscar(pedido.getId());
	}

}
