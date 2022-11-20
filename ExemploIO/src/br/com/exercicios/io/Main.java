package br.com.exercicios.io;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\Lucas\\Desktop\\Nomes.txt";
        String path2 = "C:\\Users\\Lucas\\Desktop\\Sobrenome.txt";
        String path3 = "C:\\Users\\Lucas\\Desktop\\NomeESobrenome.txt";

        ArrayList<String> nomes = Nomes.leitorNome(path1);
        ArrayList<String> sobrenomes = Nomes.leitorSobrenome(path2);
        Nomes.escritorNomeESobrenome(path3,nomes, sobrenomes);
        ArrayList<String> nomeESobrenome = Nomes.leitorNomeESobrenome(path3);


    }
}
