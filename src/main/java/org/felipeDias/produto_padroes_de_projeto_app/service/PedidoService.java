package org.felipeDias.produto_padroes_de_projeto_app.service;

import org.felipeDias.produto_padroes_de_projeto_app.model.Cliente;
import org.felipeDias.produto_padroes_de_projeto_app.model.Pedido;
import org.felipeDias.produto_padroes_de_projeto_app.model.TipoDePedido;

import java.util.List;

public interface PedidoService {

    List<Pedido> buscarTodos();

    Pedido buscarPorId(Integer id);

    void inserir(Pedido pedido);

    void atualizar(Integer id, Pedido pedido);

    void deletar(Integer id);




}
