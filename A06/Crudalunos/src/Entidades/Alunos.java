package Entidades;

public class Alunos {
    private String nome;
    private double nota1;
    private double nota2;

    public Alunos(String nome, double nota1,double nota2 ) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }


   public String mediaAlunos(){
        if (mediaAlunos() >= 7){
            return "Aprovado";
        } else if (mediaAlunos() >=5) {
            return "Exame";
        } else {
            return "Não aprovado";
        }
        }

    }

    @Override
    public String toString() {
        return " | "+ nome + " | " + nota1 +" | "+ nota2 +" | " + mediaAlunos() + " | ";


    }
}
