package com.ruankennedy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruankennedy.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
