package org.felipeDias.produto_padroes_de_projeto_app.service.Imp;

import org.felipeDias.produto_padroes_de_projeto_app.model.Cliente;
import org.felipeDias.produto_padroes_de_projeto_app.model.Pedido;
import org.felipeDias.produto_padroes_de_projeto_app.repository.ClienteRepository;
import org.felipeDias.produto_padroes_de_projeto_app.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Implementação da <b>Strategy</b> {@link PedidoService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author felipedias
 */


@Service
public class PedidoService implements org.felipeDias.produto_padroes_de_projeto_app.service.PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Pedido> buscarTodos() {
        return pedidoRepository.findAll();
    }

    @Override
    public Pedido buscarPorId(Integer id) {
        Pedido pedido = pedidoRepository.findById(id).get();
        return pedido;
    }

    @Override
    public void inserir(Pedido pedido) {

        pedidoRepository.save(pedido);
    }

    @Override
    public void atualizar(Integer id, Pedido pedido) {
        Pedido pedidoEncontrado = pedidoRepository.findById(id).get();

        if(pedido.getDescricao() != null){
            pedidoEncontrado.setDescricao(pedido.getDescricao());
            pedidoRepository.save(pedidoEncontrado);
        }

    }

    @Override
    public void deletar(Integer id) {

        pedidoRepository.deleteById(id);
    }
}
