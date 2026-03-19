package Entidades;

public class Peixe extends Animal{
    private  String Especie;

    //Construtors (alt + Insert, Construtor, shift + seta pra baixo, create)
    public Peixe(String nome, int idade, Double peso,String cor ,String especie) {
       super(nome, idade, peso,cor);
        Especie = especie;
    }

//Getters (alt + Insert, Getter, shift + seta pra baixo, create)

    public String getEspecie() {
        return Especie;
    }

}
