package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.ItemPedido;
import com.rota.domain.Pedido;
import com.rota.repository.ItemPedidoRepository;
import com.rota.repository.PedidoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class PedidoService {

	@Autowired
	public PedidoRepository repo;

	@Autowired
	public ItemPedidoRepository repoItemPedido;

	public List<Pedido> listar() {
		return repo.findAll();
	}

	public Pedido salvar(Pedido pedido) {
		if (pedido.getId() != null) {
			Optional<Pedido> ped = repo.findById(pedido.getId());

			if (!ped.isEmpty()) {
				throw new ExisteException("O Pedido já existe!");
			}
		}

		List<ItemPedido> itensPedido = pedido.getItens();

		pedido = repo.save(pedido);

		for (ItemPedido x : itensPedido) {
			x.setPedido(pedido);
			repoItemPedido.save(x);
		}

		return repo.findById(pedido.getId()).get();

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
