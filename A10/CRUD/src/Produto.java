import java.io.Serializable;

public abstract class Produto implements Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextId = 0;
    protected int id;
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.id = nextId++;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularValorEstoque() {
        return preco * quantidade;
    }

    public abstract String getDescricao();

    @Override
    public String toString() {
        return String.format("| %-2d | %-15s | %-8.2f | %-10d | %-15.2f ",
                id, nome, preco, quantidade, calcularValorEstoque());
    }

    // Method to reset nextId for loading from file (if needed)
    public static void setNextId(int id) {
        if (id >= nextId) {
            nextId = id + 1;
        }
    }
}
