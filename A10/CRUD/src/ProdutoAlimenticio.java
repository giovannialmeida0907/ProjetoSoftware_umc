import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoAlimenticio extends Produto {
    private LocalDate dataValidade;

    public ProdutoAlimenticio(String nome, double preco, int quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String getDescricao() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Validade: " + dataValidade.format(formatter);
    }

    @Override
    public String toString() {
        return super.toString() + "| " + getDescricao();
    }
}
