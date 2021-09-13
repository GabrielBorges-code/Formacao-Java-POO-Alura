package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteEscritaLeitura {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada
        // src\Java_IO\lorem_2.txt
        String caminhoDoArquivo = "src\\Java_IO\\lorem_3.txt";

        OutputStream filesEscrita = new FileOutputStream(caminhoDoArquivo);
        Writer iStramWrite = new OutputStreamWriter(filesEscrita);
        BufferedWriter bWriter = new BufferedWriter(iStramWrite);

        bWriter.write("Eu escrevi esse texto muito bom. Parece o teste de pão");
        bWriter.newLine();
        bWriter.newLine();
        bWriter.write("Fala mais galvão. Texto alterado e testado");

        bWriter.close();

        InputStream filesLeitura = new FileInputStream(caminhoDoArquivo);
        Reader iStramReader = new InputStreamReader(filesLeitura);
        BufferedReader bReader = new BufferedReader(iStramReader);

        String row = bReader.readLine();

        while (row != null){
            System.out.println(row);
            row = bReader.readLine();
        }


        bReader.close();

    }

}
