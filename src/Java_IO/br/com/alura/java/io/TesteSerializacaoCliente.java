package Java_IO.br.com.alura.java.io;

import java.io.*;

public class TesteSerializacaoCliente {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cliente cliente = new Cliente();
        cliente.setNome("Gabriel Borges");
        cliente.setProfissao("Desenvolvedor");
        cliente.setCpf("054.811.357-12");

        String arquivo = "src\\Java_IO\\Cliente.bin";

        /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(arquivo));

        objectOutputStream.writeObject(cliente);
        objectOutputStream.close();*/

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream(arquivo));
        Cliente readCliente = (Cliente) objectInputStream.readObject();

        System.out.println(readCliente.getNome() + "\n" + readCliente.getCpf() + "\n" +  readCliente.getProfissao());

        objectInputStream.close();


    }
}
