package Entidades;
import java.util.ArrayList;

public class GerProdutos {
    private final ArrayList<Produtos> GerProduto = new ArrayList<>();

    public void addProdutos(Produtos produto){
        GerProduto.add(produto);
        System.out.println("Produto adicionado com sucesso");
    }

    public void listProdutos(){
        if (GerProduto.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        } else {
            System.out.println("| ID | NOME | VALOR | QUANTIDADE |");
            for (int i=0; i<GerProduto.size(); i++){
                System.out.println("|" + i + GerProduto.get(i));
            }
        }
    }

    //alterar produto

    public void alterarProduto(int idProduto, String nome, double preco, int quantidade){
        Produtos produto = GerProduto.get(idProduto);

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);


    }

    //remove

    public void excluirProduto(int idProduto){
        GerProduto.remove(idProduto);
        System.out.println("Produto excluado com sucesso");
    }


}
