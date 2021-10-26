package Teste_Automatizado_JUnit.calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos(){
        Caculadora calculadora = new Caculadora();

        int soma = calculadora.somar(15, 13);

        Assert.assertEquals(28, soma);



    }

}
