package com.dmgmodels.lojaRoupas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.tablee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name =  "roupa")
@Entity(name = "Roupa")
@getter
@setter
@AllArgsConstructor
@NoArgsConstructor

public class Roupa {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeproduto;
    private String marca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private double preco;
    private int quantidade;

    public Roupa(DadosCadastroRoupa dadosCadastroRoupa) {
        this.nomeproduto = dadods.nomeProduto();
        this.marca = dadosCadastroRoupa.marca();
        this.tamanho = dadosCadastroRoupa.tamanho();
        this.preco = dadosCadastroRoupa.preco();
        this.quantidade = dadosCadastroRoupa.quantidade();
    }
}
