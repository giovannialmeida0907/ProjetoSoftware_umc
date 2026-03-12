import Entidades.Alunos;
import Entidades.GerListAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerListAlunos Lista = new GerListAlunos();

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("SISTEMA CRUD ALUNOS");
            System.out.println("1- Cadastro Aluno");
            System.out.println("2- Listar  Aluno");
            System.out.println("3- Alterar Aluno");
            System.out.println("4- Excluir Aluno");
            System.out.println("5- Sair");
            System.out.println("Digite uma opção: ");

            switch (opcao){
                case "1" -> {
                    System.out.println("Digite o nome do aluno: ");
                    nome = sc.nextline();

                    System.out.println("Digite a nota do aluno: ");
                    double nota1 = sc.nextDouble();
                    sc.nextline();

                    System.out.println("Digite a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextline();

                    Alunos aluno = new Alunos(nome, nota1, nota2);
                    Lista.addAluno(aluno);
                }

                case "2" -> {
                    lista.listaralunos
                }
            }

        }
    }

}
