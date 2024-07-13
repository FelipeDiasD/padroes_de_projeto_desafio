package org.felipeDias.produto_padroes_de_projeto_app.Proxy;

import org.felipeDias.produto_padroes_de_projeto_app.model.Pedido;
import org.felipeDias.produto_padroes_de_projeto_app.service.Imp.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
/**
 * Esse {@link Component} representa nosso <b>Proxy</b>, no caso um proxy de log
 * Tem a intenção de ser um objeto intermediário nas requisições de criacao de pedido
 * afim de registrar os pedidos feitos
 * @author felipedias
 */

@Component
public class PedidoLogProxy {

    @Autowired
    private PedidoService pedidoService;

    private List<Pedido> pedidosRealizados = new ArrayList<>();;

    public void novoPedido(Pedido pedido){

        if(pedido != null){
            pedidosRealizados.add(pedido);
            pedidoService.inserir(pedido);
        }

   }

   public List<Pedido> getPedidosRealizados(){
        return this.pedidosRealizados;
   }




}
