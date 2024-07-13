package org.felipeDias.produto_padroes_de_projeto_app.controller;

import org.felipeDias.produto_padroes_de_projeto_app.Proxy.PedidoLogProxy;
import org.felipeDias.produto_padroes_de_projeto_app.model.Cliente;
import org.felipeDias.produto_padroes_de_projeto_app.model.Pedido;
import org.felipeDias.produto_padroes_de_projeto_app.model.TipoDePedido;
import org.felipeDias.produto_padroes_de_projeto_app.service.Imp.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("pedidos")
public class PedidoRestController {

    @Autowired
    private PedidoLogProxy logProxy;

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> buscarTodos(){
        return ResponseEntity.ok(pedidoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(pedidoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Pedido> inserirPedido(@RequestBody Pedido pedido){
        logProxy.novoPedido(pedido);
        return ResponseEntity.ok(pedido);
    }

    @PutMapping
    public ResponseEntity atualizarPedido(Integer id, @RequestBody Pedido pedido){
        pedidoService.atualizar(id, pedido);
        return ResponseEntity.ok("Atualizado!");
    }




}
