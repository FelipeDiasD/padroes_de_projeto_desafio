package org.felipeDias.produto_padroes_de_projeto_app.repository;

import org.felipeDias.produto_padroes_de_projeto_app.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
