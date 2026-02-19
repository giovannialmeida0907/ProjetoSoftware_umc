import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Livro HarryPotter = new Livro("Harry Potter e a Pedra filosofal",
                "J. K. Rowling",
                10, 69.90);

        Livro SenhorDosAneis = new Livro("O Senhor dos Aneis:  A Sociedade do Anel",
                "J. R. R. Tolkien",
                10, 69.90);

        HarryPotter.empresta(6);

        HarryPotter.devolve(1);

        HarryPotter.exibir();
        SenhorDosAneis.exibir();
    }
}
