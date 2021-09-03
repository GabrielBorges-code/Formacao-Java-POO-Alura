package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteLeitura {
    public static void main(String[] args) throws IOException {

        //Fluxo de entrada
        // src\Java_IO\lorem.txt
        String caminhoDoArquivo = "src\\Java_IO\\lorem.txt";
        InputStream files = new FileInputStream(caminhoDoArquivo);
        Reader iStramReader = new InputStreamReader(files);
        BufferedReader bReader = new BufferedReader(iStramReader);

        String linha = bReader.readLine();

        while (linha != null){
            System.out.println(linha);
            linha = bReader.readLine();
        }

        bReader.close();

    }

}
