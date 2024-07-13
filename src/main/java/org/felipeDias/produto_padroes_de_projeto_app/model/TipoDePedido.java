package org.felipeDias.produto_padroes_de_projeto_app.model;

public enum TipoDePedido {


    ENTREGA(1),
    RETIRADA(2);

    private final int codigoDeTipo;

    private TipoDePedido(int codigoDeTipo) {
        this.codigoDeTipo = codigoDeTipo;
    }
    public int getCodigoDeTipo(){
        return this.codigoDeTipo;
    }
}
