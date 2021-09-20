package Java_IO.br.com.alura.java.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class UnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String c = "C";

        System.out.println(c.codePointAt(0));

        Charset charset = Charset.defaultCharset();

        System.out.println(charset.displayName());

        byte[] bytes = c.getBytes();
        System.out.println(bytes.length);

        bytes = c.getBytes("windows-1252");
        System.out.println(bytes.length);

        bytes = c.getBytes("UTF-16");
        System.out.println(bytes.length);

        //Atividade

        /*String s1 = "13º Órgão Oficial";
        byte [] bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s2);*/


    }


}
