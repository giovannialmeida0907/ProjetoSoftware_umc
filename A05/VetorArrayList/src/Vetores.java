public class Vetores {
    public static void main(String[] args) {
        double[] listanumeros = new double[5];
        listanumeros[0] = 1;
        listanumeros[1] = 2;
        listanumeros[2] = 3;
        listanumeros[3] = 4;
        listanumeros[4] = 5;

        //trdicional for procurar lista
        for (int i=0; i<listanumeros.length; i++) {
            System.out.println(listanumeros[i]);
        }

       //foreach procurar lista
       for (double num :  listanumeros) {
           System.out.println(num);
       }

    }
}
