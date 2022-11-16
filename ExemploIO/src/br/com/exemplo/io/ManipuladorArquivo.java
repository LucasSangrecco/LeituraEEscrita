package br.com.exemplo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManipuladorArquivo {
    public static void leitor(String path) throws IOException {

        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

            if (linha != null) {
                linha = buffRead.readLine();
                System.out.println("RESULTADO: " + linha);
            }

        buffRead.close();
    }

    public static void escritor(String path) throws IOException {

        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva Algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }
}
