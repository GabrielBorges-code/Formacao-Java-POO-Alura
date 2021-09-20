package Java_IO.br.com.alura.java.io;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

    public static void main(String[] args) throws Exception {

        String caminhoArquivo = "";
        Scanner scanner = new Scanner(new File("src\\Java_IO\\contas.csv"));


        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();

            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int numero = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            double saldo = linhaScanner.nextDouble();

            System.out.format(new Locale("pt", "BR"), "%s - %04d-%08d, %s: %08.2f%n",
                    tipoConta, agencia, numero, titular, saldo);

            linhaScanner.close();
        }

        scanner.close();

    }

}
