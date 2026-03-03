import entidades.Lanche;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lanche x_burguer = new Lanche("X-BURUGER",
                "Pão, Hamburguer, Queijo, Maionese Verde",
                24.9, 10
        );

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----LISTA DE OPÇÕES----");
            System.out.println("1 - FAZER PEDIDO");
            System.out.println("2 - ADICIONAR NO ESTOQUE");
            System.out.println("3 - INFORMAÇÃO DO LANCHE");
            System.out.println("4 - ALTERAR VALOR");
            System.out.println("5 - ALTERAR DESCRIÇÃO");
            System.out.println("6 - SAIR");
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.println("QUANTOS LANCHAS VOCÊ DESEJA: ");
                    int quantidade = sc.nextInt();
                    sc.nextLine();

                    x_burguer.descrEstoque(quantidade);

                    System.out.println("VOCÊE PEDIU " + quantidade + " " +
                         x_burguer.getNome() + " VALOR FINAL: R$" + x_burguer.valorfinal(quantidade));

                    break;



                case "2":
                    System.out.println("QUANTOS LANCHES VOCÊ DESEJA ADICIONAR NO ESTOQUE: ");
                    int quant = sc.nextInt();
                    sc.nextLine();
                    x_burguer.incremetEstoque(quant);

                    System.out.println("O ESTOQUE TOTAL É: " + x_burguer.getEstoque());
                    break;


                case "3":
                    System.out.println(x_burguer.toString());
                    break;
                case  "4":
                    System.out.println("O LANCHE " + x_burguer.getNome() +
                            "CUSTA R$ "+ x_burguer.getValor());
                    System.out.println("INFORME NOVO VALOR DO LANCHE: ");
                    double valor = sc.nextDouble();
                    sc.nextLine();

                    x_burguer.setValor(valor);
                    break;

                case "5":
                    System.out.println("O LANCHE " + x_burguer.getNome() +
                            "DA DESCRIÇÃO: " + x_burguer.getDescricao());
                    System.out.println("INFORME NOVA DESCRIÇÃO DO LANCHE: ");
                    String descricao = sc.nextLine();
                    x_burguer.setDescricao(descricao);
                    break;




            }


        }


    }
}
