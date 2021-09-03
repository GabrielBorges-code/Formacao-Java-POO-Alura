package Java_Util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class TesteOutroWrapper {

    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29); //autoboxing
        int valor = idadeRef.intValue(); //unboxing
        System.out.println(valor);

        Double dRef = Double.valueOf(3.2);
        System.out.println(dRef.doubleValue());

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());


        List<Number> guardaNum  = new ArrayList<Number>();
        guardaNum.add(idadeRef);
        guardaNum.add(dRef);
        guardaNum.add(65.6f);
        guardaNum.add(165.9);
        guardaNum.add(9741);

        System.out.println(guardaNum.get(1));

        for (Number n : guardaNum ) {
            System.out.println("Numeros no array " + n);
        }
    }
}
