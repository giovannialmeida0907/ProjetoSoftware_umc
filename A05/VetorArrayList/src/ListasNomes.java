import java.util.ArrayList;

public class ListasNomes {
     static void main(){
        ArrayList<String> ListaNomes = new ArrayList<>();

        ListaNomes.add("caio");
        ListaNomes.add("Maria");


        //funcao anonina removerpor nome
        ListaNomes.removeIf(nome -> nome.equals("Maria"));

        //remover por letra
        ListaNomes.removeIf(nome -> nome.contains("M"));

        for(String nome : ListaNomes){
            System.out.println(nome);
        }
    }
}
