package br.com.exemplo.io;

import java.io.IOException;

public class PrincipalArquivo {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\12114651\\Downloads\\ExemploIO.txt";

        ManipuladorArquivo.escritor(path);
        ManipuladorArquivo.leitor(path);
    }
}
