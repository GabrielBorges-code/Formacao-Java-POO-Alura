package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada
        // src\Java_IO\lorem_2.txt
        String caminhoDoArquivo = "src\\Java_IO\\lorem_2.txt";
        OutputStream files = new FileOutputStream(caminhoDoArquivo);
        Writer iStramWrite = new OutputStreamWriter(files);
        BufferedWriter bWriter = new BufferedWriter(iStramWrite);


        bWriter.write("Eu escrevi esse texto muito bom");
        bWriter.newLine();
        bWriter.newLine();
        bWriter.write("Fala mais galvão");

        bWriter.close();

    }

}
