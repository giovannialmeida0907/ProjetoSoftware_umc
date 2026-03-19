import Entidades.Cachorro;
import Entidades.Gato;
import Entidades.Peixe;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobi",7,8.15,"tricolor","São bernardo");
        Gato gato = new Gato("Salem", 3,5.20,"preto");
        Peixe peixe = new Peixe("Marvim",1,0.20,"peixe palhaço", "Laranja");
    }
}
