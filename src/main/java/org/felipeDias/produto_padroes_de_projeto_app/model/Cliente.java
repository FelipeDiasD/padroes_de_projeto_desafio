package org.felipeDias.produto_padroes_de_projeto_app.model;

import jakarta.persistence.*;

/**
 * Classe para representar um cliente hipotético
 * Não tem intenção de ser precisa em relação a um cliente real e seus atributos
 * @author felipedias
 */


@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    //Apenas para exemplificar, normalmente seria criada uma classe endereco
    private String endereco;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
