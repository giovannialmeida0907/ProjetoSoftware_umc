package Entidades;


//Construtor
public class Produtos {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produtos(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Setter

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    //ToString


    @Override
    public String toString() {
        return " | " + nome + " | " + preco + " | " + quantidade + " | ";
    }
}
