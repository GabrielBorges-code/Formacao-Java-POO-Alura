package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteSerializacao {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String nome = "Gabriel Borges";

        String arquivo = "src\\Java_IO\\Object.bin";

        /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(arquivo));
        objectOutputStream.writeObject(nome);

        objectOutputStream.close(); */

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(arquivo));

        String read = (String) objectInputStream.readObject();

        System.out.println(read);

        objectInputStream.close();


    }
}
