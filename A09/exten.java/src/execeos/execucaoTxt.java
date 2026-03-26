package execeos;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class execucaoTxt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        while(true){
            System.out.println("SISTEMA CADASTRO");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar");
            System.out.println("3- SaIR");
            System.out.println("Digite a opcao: ");
            opcao = sc.nextLine();

            switch (opcao){
                case "1":
                    try{
                        System.out.println("Digite o nome da pessoa: ");
                        String nome = sc.nextLine();

                        System.out.println("Digite a idade da pessoa: ");
                        int idade = sc.nextInt();
                        sc.nextLine();

                        FileWriter writer = new FileWriter("dados.txt", true);
                        writer.write(nome + "," + idade + "\n");
                        writer.close();
                        System.out.println("Dados cadastrados com sucesso!");

                    } catch (IIOException e) {
                        System.out.println("Erro ao criar o arquivo");
                        System.out.println("detalhe" + e.getMessage());
                    }catch (InputMismatchException e) {
                        System.out.println("informe um valor numerico");
                        System.out.println("detalhe"+ e.getMessage());
                    }
            }
        }
    }
}
