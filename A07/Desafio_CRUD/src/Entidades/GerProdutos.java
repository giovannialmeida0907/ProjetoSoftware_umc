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
            for (Produtos produto :  GerProduto) {
                System.out.println (produto);
            }
        }
    }

}
