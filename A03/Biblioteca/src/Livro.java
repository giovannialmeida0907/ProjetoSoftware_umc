public class Livro {
    String titulo;
    String autor;
    int quantidade;
    double preco;

    //construtor
    public Livro(String titulo, String autor, int quantidade, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    //empresta

    public void empresta(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
        } else {
            System.out.println("Informe quantidade de  livro valida");
        }

    }

    //devolve
    public void devolve(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Informe quantidade de livro valida");
        }
    }

    public double precototal(){
        double precototal = this.preco * this.quantidade;
        return precototal;

    }

    //exibir

    public void exibir(){
        System.out.println("Titulo: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nquantidade: " + this.quantidade +
                "\npreco: " + this.preco + "\npreco total: " + precototal());
    }
}
