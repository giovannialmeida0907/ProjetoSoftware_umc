import Entidades.Produtos;
import Entidades.GerProdutos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    GerProdutos produtos = new GerProdutos();
    Scanner sc = new Scanner(System.in);
    

    while (true) {
        System.out.println("CRUD PRODUTOS");
        System.out.println("1- CADASTRAR PRODUTOS");
        System.out.println("2- LISTAR PRODUTOS");
        System.out.println("3- ALTERAR PRODUTOS");
        System.out.println("4- EXCLUIR PRODUTOS");
        System.out.println("5- SAIR");
        System.out.print("DIGITE UMA OPÇÃO: ");

        String opcao = sc.next();
        switch (opcao) {
            case "1" -> {
                System.out.println("Digite o nome do produto: ");
                String nome = sc.next();
                sc.nextLine();

                System.out.println("Digite o valor do produto: ");
                Double preco = sc.nextDouble();
                sc.nextLine();

                System.out.println("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();
                sc.nextLine();

                Produtos produto = new Produtos(nome, preco, quantidade);
                produtos.addProdutos (produto);
            }

            case "2" -> {
                produtos.listProdutos();
            }

            case "3" -> {}

            case "4" -> {}

            case "5" -> {}
        }

    }
    }
}
