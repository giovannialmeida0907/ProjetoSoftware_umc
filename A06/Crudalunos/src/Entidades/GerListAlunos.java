package Entidades;

import java.util.ArrayList;

public class GerListAlunos {
    private ArrayList<Alunos> ListaAlunos = new ArrayList<>();

    public  void addAluno(Alunos aluno){
        ListaAlunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso");
    }

public void listarAlunos(){
        if (ListaAlunos.isEmpty()){
            System.out.println("Nenhum Aluno encontrado");
        } else{
            System.out.println("| ID | NOME | NOTA1 | NOTA2 | MEDIA | SITUAÇÃO");
            for (int i=0; i<ListaAlunos.size(); i++){
                System.out.println();
            }
        }
}
}
