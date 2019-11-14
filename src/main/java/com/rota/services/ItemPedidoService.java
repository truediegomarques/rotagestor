package com.rota.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.rota.domain.ItemPedido;
import com.rota.repository.ItemPedidoRepository;
import com.rota.services.exceptions.ExisteException;
import com.rota.services.exceptions.NaoEncontradoException;

@Service
public class ItemPedidoService {

	@Autowired
	public ItemPedidoRepository repo;
	

	public List<ItemPedido> listar() {
		return repo.findAll();
	}

	public ItemPedido salvar(ItemPedido itemPedido) {
		if (itemPedido.getId() != null) {
			Optional<ItemPedido> ip = repo.findById(itemPedido.getId());

			if (!ip.isEmpty()) {
				throw new ExisteException("O ItemPedido já existe!");
			}
		}
		return repo.save(itemPedido);
	}

	public ItemPedido buscar(Long id) {
		Optional<ItemPedido> itemPedido = repo.findById(id);

		if (itemPedido.isEmpty()) {
			throw new NaoEncontradoException("ItemPedido não encontrado!");
		}

		return itemPedido.get();
	}

	public void deletar(Long id) {
		try {
			repo.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new NaoEncontradoException("O clente não foi encontrado");
		}
	}

	public void atualizar(ItemPedido itemPedido) {
		verificarExistencia(itemPedido);
		repo.save(itemPedido);
	}

	private void verificarExistencia(ItemPedido itemPedido) {
		buscar(itemPedido.getId());
	}
}
