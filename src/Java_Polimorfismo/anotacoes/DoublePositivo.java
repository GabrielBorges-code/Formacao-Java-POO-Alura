package Java_Polimorfismo.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//uma anotação é parecida com uma interface
//O target está servindo para eu definir onde ela será defina, se é em um método, atributo, etc..
//Uma anotação não tem uma implementação é apenas uma declaração
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DoublePositivo {


}
