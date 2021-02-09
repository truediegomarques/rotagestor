package com.rota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rota.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
