public class ProdutoVestuario extends Produto {
    private String tamanho;

    public ProdutoVestuario(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getDescricao() {
        return "Tamanho: " + tamanho;
    }

    @Override
    public String toString() {
        return super.toString() + "| " + getDescricao();
    }
}
