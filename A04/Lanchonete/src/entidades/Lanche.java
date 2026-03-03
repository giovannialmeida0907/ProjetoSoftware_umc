package entidades;

public class Lanche {
    private String nome;
    private String descricao;
    private double valor;
    private int estoque;
    private boolean disponivel;

    //Construtor
    public Lanche(String nome, String descricao, double valor, int estoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;
        this.disponivel = estoque > 0;
    }

    //Getters


    public void verDisponivel() {
        this.disponivel = estoque > 0;
    }

    public void descrEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.estoque){
            this.estoque -= quantidade;
            this.verDisponivel();
            System.out.println("pedido feito");
        }else{
            System.out.println("ERRO: Estoque insuficiente");
        }
    }

    public void incremetEstoque(int quantidade) {
        if (this.estoque <= quantidade){
            this.estoque += quantidade;
         }
    }

    public double valorfinal(int quntidade){
        return this.valor + quntidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {this.valor = valor;}

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDescricao: " + descricao +
                "\nValor: R$ " + valor +
                "\nEstoque: " + estoque +
                "\nDisponivel: " + disponivel ;
    }
}
