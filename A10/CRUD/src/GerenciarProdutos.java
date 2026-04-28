import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GerenciarProdutos {
    private ArrayList<Produto> produtos;
    private final String NOME_ARQUIVO = "produtos.txt";

    public GerenciarProdutos() {
        this.produtos = new ArrayList<>();
        carregarProdutos();
    }

    public void cadastrarProduto(Produto produto) {
        this.produtos.add(produto);
        salvarProdutos();
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        System.out.println("\n===== PRODUTOS CADASTRADOS =====");
        System.out.println("ID | Nome            | Preço    | Quantidade | Valor em Estoque | Descrição");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void atualizarProduto(int id, String nome, double preco, int quantidade) throws ProdutoNaoEncontradoException {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setQuantidade(quantidade);
                salvarProdutos();
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado.");
    }

    public void removerProduto(int id) throws ProdutoNaoEncontradoException {
        boolean removido = false;
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == id) {
                produtos.remove(i);
                removido = true;
                salvarProdutos();
                System.out.println("Produto removido com sucesso!");
                break;
            }
        }
        if (!removido) {
            throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado.");
        }
    }

    private void salvarProdutos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO))) {
            oos.writeObject(produtos);
        } catch (IOException e) {
            System.err.println("Erro ao salvar produtos: " + e.getMessage());
        }
    }

    private void carregarProdutos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO))) {
            this.produtos = (ArrayList<Produto>) ois.readObject();
            // Atualizar o nextId para garantir que novos produtos tenham IDs únicos
            int maxId = -1;
            for (Produto p : produtos) {
                if (p.getId() > maxId) {
                    maxId = p.getId();
                }
            }
            Produto.setNextId(maxId + 1);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo de produtos não encontrado. Iniciando com lista vazia.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar produtos: " + e.getMessage());
        }
    }

    // Exceção personalizada
    public static class ProdutoNaoEncontradoException extends Exception {
        public ProdutoNaoEncontradoException(String message) {
            super(message);
        }
    }
}
