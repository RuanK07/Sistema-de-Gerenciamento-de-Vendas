package com.ruankennedy.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruankennedy.cursomc.domain.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
