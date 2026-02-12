public class Main {
    public static void main(String[] args) {
        Lanche Xegg = new Lanche();
        Xegg.nome = "X-egg";
        Xegg.preco = 24.90;
        Xegg.descricao = "pão, maionese, ovo, hamburguer e queijo";

        //System.out.print("Lanche: "+Xegg.nome + "\nPreço:  "+ Xegg.preco + "\nDescrição: "+ Xegg.descricao);


        Lanche Xtudo = new Lanche();
        Xtudo.nome = "X-tudo";
        Xtudo.preco = 30.00;
        Xtudo.descricao = "pão, maionese, hamburguer, queijo, tomate, alface e cebola";

        //System.out.print("\nLanche: "+Xtudo.nome+ "\nPreço: "+Xtudo.preco+ "\nDescrição: "+ Xtudo.descricao);

       // Xegg.exibir();
       // Xtudo.exibir();

        Carro Gol = new Carro();
        Gol.modelo = "Gol 1.0 Confortiline flex";
        Gol.marca = "Volkswagen";
        Gol.ano = 2014;

        Carro Fox = new Carro();
        Fox.modelo = "Fox 1.0 Route flex";
        Fox.marca = "Volkswagen";
        Fox.ano = 2009;

        Gol.exibir();
        Fox.exibir();
    }
}
