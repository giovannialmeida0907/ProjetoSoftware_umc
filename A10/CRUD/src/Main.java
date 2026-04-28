import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciarProdutos gerenciarProdutos = new GerenciarProdutos();

        int opcao;
        do {
            System.out.println("\n===== MENU DE OPÇÕES =====");
            System.out.println("1 - Cadastrar Produto Eletrônico");
            System.out.println("2 - Cadastrar Produto Vestuário");
            System.out.println("3 - Cadastrar Produto Alimentício");
            System.out.println("4 - Listar produtos");
            System.out.println("5 - Atualizar produto");
            System.out.println("6 - Remover produto");
            System.out.println("7 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                switch (opcao) {
                    case 1:
                        cadastrarProdutoEletronico(scanner, gerenciarProdutos);
                        break;
                    case 2:
                        cadastrarProdutoVestuario(scanner, gerenciarProdutos);
                        break;
                    case 3:
                        cadastrarProdutoAlimenticio(scanner, gerenciarProdutos);
                        break;
                    case 4:
                        gerenciarProdutos.listarProdutos();
                        break;
                    case 5:
                        atualizarProduto(scanner, gerenciarProdutos);
                        break;
                    case 6:
                        removerProduto(scanner, gerenciarProdutos);
                        break;
                    case 7:
                        System.out.println("Saindo do sistema...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.nextLine(); // Limpar o buffer do scanner
                opcao = 0; // Para continuar o loop
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                opcao = 0; // Para continuar o loop
            }

        } while (opcao != 7);

        scanner.close();
    }

    private static void cadastrarProdutoEletronico(Scanner scanner, GerenciarProdutos gerenciarProdutos) {
        System.out.println("\n--- Cadastrar Produto Eletrônico ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Garantia (meses): ");
        int garantia = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        ProdutoEletronico pe = new ProdutoEletronico(nome, preco, quantidade, garantia);
        gerenciarProdutos.cadastrarProduto(pe);
        System.out.println("Produto eletrônico cadastrado com sucesso!");
    }

    private static void cadastrarProdutoVestuario(Scanner scanner, GerenciarProdutos gerenciarProdutos) {
        System.out.println("\n--- Cadastrar Produto Vestuário ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Tamanho (P, M, G, GG): ");
        String tamanho = scanner.nextLine();

        ProdutoVestuario pv = new ProdutoVestuario(nome, preco, quantidade, tamanho);
        gerenciarProdutos.cadastrarProduto(pv);
        System.out.println("Produto de vestuário cadastrado com sucesso!");
    }

    private static void cadastrarProdutoAlimenticio(Scanner scanner, GerenciarProdutos gerenciarProdutos) {
        System.out.println("\n--- Cadastrar Produto Alimentício ---");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Data de Validade (AAAA-MM-DD): ");
        String dataValidadeStr = scanner.nextLine();
        LocalDate dataValidade = null;
        try {
            dataValidade = LocalDate.parse(dataValidadeStr);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de data inválido. Use AAAA-MM-DD. Produto não cadastrado.");
            return;
        }

        ProdutoAlimenticio pa = new ProdutoAlimenticio(nome, preco, quantidade, dataValidade);
        gerenciarProdutos.cadastrarProduto(pa);
        System.out.println("Produto alimentício cadastrado com sucesso!");
    }

    private static void atualizarProduto(Scanner scanner, GerenciarProdutos gerenciarProdutos) {
        System.out.println("\n--- Atualizar Produto ---");
        System.out.print("ID do produto a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha
        System.out.print("Novo Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Novo Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Nova Quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        try {
            gerenciarProdutos.atualizarProduto(id, nome, preco, quantidade);
        } catch (GerenciarProdutos.ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void removerProduto(Scanner scanner, GerenciarProdutos gerenciarProdutos) {
        System.out.println("\n--- Remover Produto ---");
        System.out.print("ID do produto a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        try {
            gerenciarProdutos.removerProduto(id);
        } catch (GerenciarProdutos.ProdutoNaoEncontradoException e) {
            System.out.println(e.getMessage());
        }
    }
}
