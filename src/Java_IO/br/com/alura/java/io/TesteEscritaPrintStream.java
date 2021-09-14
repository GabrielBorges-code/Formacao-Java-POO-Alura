package Java_IO.br.com.alura.java.io;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaPrintStream {

    public static void main(String[] args) throws IOException {

        String caminhoArquivo = "src\\Java_IO\\lorem_6.txt";
        PrintStream printStream = new PrintStream(caminhoArquivo);
        printStream.println("Escrevendo no texto utilizando o Print Stream");
        printStream.println("Nova linha");
        printStream.close();

    }
}
