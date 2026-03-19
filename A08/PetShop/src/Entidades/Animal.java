package Entidades;

public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String cor;


//

    public Animal(String nome, int idade, double peso, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

//
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
    public String getCor() {
        return cor;
    }
}
