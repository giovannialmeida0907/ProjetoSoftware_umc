import java.util.ArrayList;

public class Listas {
    public void main(String[]args){
        ArrayList<Integer> listanotas = new ArrayList<>();

        //add valores
        listanotas.add(1);
        listanotas.add(2);

        System.out.println(listanotas);

        //add valores posição especifica
        listanotas.add(2, 3);
        listanotas.add(3, 4);

        System.out.println(listanotas);

        //verfica tamanho da lista
        System.out.println("O tamnho da lista é " +  listanotas.size());

        //acessar elemnto na lista
        System.out.println("A primeira posição tem o valor de " + listanotas.get(0) );

        //alterar um valor da lista
        listanotas.set(0, 20);
        System.out.println(listanotas);

        //remover item
        listanotas.remove(10); //posição
        listanotas.remove(listanotas.indexOf(20));

        //remover apartir função lambda
        listanotas.removeIf(e -> e < 7);
        System.out.println(listanotas);

        for (Integer nota: listanotas ) {
            System.out.println(nota);
        }
    }
}
