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
public class ExercicioFatorial {
    
    public static void main(String[] args) {
        
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + "! = " +fatorial);
        }
    }
    
}
