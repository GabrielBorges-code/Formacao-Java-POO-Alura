/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxeVariaveisEFluxo;

/**
 *
 * @author gabri
 */
public class TestaLacosEncadeados {

    public static void main(String[] args) {
        // soma
        /*for(int multiplicador = 0; multiplicador <= 10; multiplicador++ ){
            System.out.println((1) + " + " + (multiplicador) + " = " + (multiplicador+1));
        }**/

        //tabuada de multiplicacao
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            for (int contador = 0; contador <= 10; contador++) {
                System.out.print(multiplicador + " * " + contador + " = " + (multiplicador * contador));
                System.out.print(" ");
            }
            System.out.println();

        }

    }

}
