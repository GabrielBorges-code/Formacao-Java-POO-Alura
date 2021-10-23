package Java_Moderno_v8.com.java8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje" + hoje);

        LocalDate olimpiadas = LocalDate.of(2024, Month.JULY, 26);

        int anos = olimpiadas.getYear() - hoje.getYear();
        System.out.println("Quantos dias faltas " + anos);

        Period periodo = Period.between(hoje, olimpiadas);
        System.out.println("Periodo que falta " + periodo.getDays());

        LocalDate proximasOlimpiadas = olimpiadas.plusYears(4);
        System.out.println("Próximas Olimpiadas " + proximasOlimpiadas);

        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd//MM/YYYY");
        String valorFormatado = proximasOlimpiadas.format(formatar);

        System.out.println("Próximas Olimpiadas formatado " + valorFormatado);

    }
}
