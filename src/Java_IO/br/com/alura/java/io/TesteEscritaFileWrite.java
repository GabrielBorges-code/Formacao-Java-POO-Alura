package Java_IO.br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWrite {

    public static void main(String[] args) throws IOException {

        String caminhoArquivo = "src\\Java_IO\\lorem_5.txt";
        FileWriter fileWriter = new FileWriter(caminhoArquivo);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Escrevendo o texto com File Write \noutra linha");
        bufferedWriter.write( System.lineSeparator() +"Essa é uma outra linha uttilizando o System.lineSeparator()");

        bufferedWriter.close();

    }
}
