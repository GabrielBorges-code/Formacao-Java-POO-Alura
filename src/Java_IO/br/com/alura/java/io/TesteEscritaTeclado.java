package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteEscritaTeclado {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada
        // src\Java_IO\lorem_2.txt
        String caminhoDoArquivo = "src\\Java_IO\\lorem_3.txt";
        String caminhoDoArquivoCopia = "src\\Java_IO\\lorem_4.txt";

        InputStream filesLeitura = new FileInputStream(caminhoDoArquivo);
        Reader iStramReader = new InputStreamReader(filesLeitura);
        BufferedReader bReader = new BufferedReader(iStramReader);

        OutputStream filesEscrita = new FileOutputStream(caminhoDoArquivoCopia);
        Writer iStramWrite = new OutputStreamWriter(filesEscrita);
        BufferedWriter bWriter = new BufferedWriter(iStramWrite);

        String row = bReader.readLine();

        //bWriter.write("Arquivo Escrito com teclado");
        bWriter.newLine();

        while (row != null && !row.isEmpty()){
            bWriter.write(row);
            bWriter.newLine();
            bWriter.flush();
            row = bReader.readLine();
        }

        bWriter.close();
        bReader.close();

    }

}
