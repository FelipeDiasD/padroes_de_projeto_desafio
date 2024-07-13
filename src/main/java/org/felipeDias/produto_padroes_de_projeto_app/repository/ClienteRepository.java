package org.felipeDias.produto_padroes_de_projeto_app.repository;

import org.felipeDias.produto_padroes_de_projeto_app.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
