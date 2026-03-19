package Entidades;

public class Cachorro extends Animal {
    private String raca;


//Construtors (alt + Insert, Construtor, shift + seta pra baixo, create)

    public Cachorro (String nome, int idade, Double peso,String cor ,String especie) {
        super(nome, idade, peso, cor);
        this.raca = especie;
    }


//Getters (alt + Insert, Getter, shift + seta pra baixo, create)
    public String getRaça() {
        return raca;
    }
}
