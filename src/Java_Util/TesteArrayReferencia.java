package Java_Util;

public class TesteArrayReferencia {

    public static void main(String[] args) {

        //Array é um objeto
        int [] idades = new int[5];

        idades[0]  = 20;
        idades[1]  = 50;
        idades[2]  = 32;
        idades[3]  = 17;
        idades[4]  = 23;

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Array posiçao " + i  + " - " + idades[i]);
        }




    }
}
