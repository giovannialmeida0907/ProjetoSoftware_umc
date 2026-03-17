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
                System.out.println("Aqui está a lista de produtos:");
                produtos.listProdutos();
            }

            case "3" -> {
                System.out.println("Alteração de produto\nEssa é a lista de produtos:");
                produtos.listProdutos();

                int idProduto = sc.nextInt();
                sc.nextLine();

                System.out.println("Digite o nome do produto: ");
                String nome = sc.nextLine();

                System.out.println("Digite o valor do produto: ");
                Double preco = sc.nextDouble();

                System.out.println("Digite a quantidade do produto: ");
                int quantidade = sc.nextInt();

                produtos.alterarProduto(idProduto, nome, preco, quantidade);

            }

            case "4" -> {
                System.out.println("Remoção de produto(s)\n");
                produtos.listProdutos();
                System.out.println("Digite o ID do produto: ");
                int idProduto = sc.nextInt();
                sc.nextLine();
                produtos.excluirProduto(idProduto);
            }

            case "5" -> {
                System.out.println("SAIR");
                return;
            }
        }

    }
    }
}
