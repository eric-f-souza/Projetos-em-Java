package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws UnsupportedEncodingException {

        String s = "ç";

        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte [] bytes = s.getBytes("windows-1252");
        System.out.println(bytes.length + ", windows-1252");

        String sNovo = new String(bytes, "windows-1252");
        System.out.println(sNovo);


        byte [] bytes2 = s.getBytes("UTF-8");
        System.out.println(bytes2.length + ", UTF-8");

        sNovo = new String(bytes2);
        System.out.println(sNovo);

        byte [] bytes3 = s.getBytes("UTF-16");
        System.out.println(bytes3.length + ", UTF-16");

        sNovo = new String(bytes3);
        System.out.println(sNovo);

        byte [] bytes4 = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes4.length + ", US_ASCII");

        sNovo = new String(bytes4);
        System.out.println(sNovo);


    }
}
