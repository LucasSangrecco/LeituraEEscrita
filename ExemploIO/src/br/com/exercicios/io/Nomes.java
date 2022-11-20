package br.com.exercicios.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Nomes {

    public static ArrayList<String> leitorNome(String path1) throws IOException {
        BufferedReader buffReadNome = new BufferedReader(new FileReader(path1));
        String linha = "";
        ArrayList<String> nomes = new ArrayList<String>();
        for (int i=0;i<10;i++) {
            if (linha != null) {
                linha = buffReadNome.readLine();
                System.out.println(linha);
                nomes.add(linha);
            }
        }
        System.out.println("\n\n");
        buffReadNome.close();
        return nomes;
    }

    public static ArrayList<String> leitorSobrenome(String path2) throws IOException {
        BufferedReader buffReadSobrenome = new BufferedReader(new FileReader(path2));
        String linha = "";
        ArrayList<String> sobrenomes = new ArrayList<String>();
        for (int i=0;i<10;i++) {
            if (linha != null) {
                linha = buffReadSobrenome.readLine();
                System.out.println(linha);
                sobrenomes.add(linha);
            }
        }
        System.out.println("\n\n");
        buffReadSobrenome.close();
        return sobrenomes;
    }

    public static ArrayList<String> leitorNomeESobrenome(String path3) throws IOException {
        BufferedReader buffReadNomeESobrenome = new BufferedReader(new FileReader(path3));
        String linha = "";
        ArrayList<String> nomeESobrenome = new ArrayList<String>();

        for (int i=0;i<10;i++) {
            if (linha != null) {
                linha = buffReadNomeESobrenome.readLine();
                System.out.println(linha);
                nomeESobrenome.add(linha);
            }
        }
        System.out.println("\n\n");
        buffReadNomeESobrenome.close();
        return nomeESobrenome;
    }

    public static void escritorNomeESobrenome (String path, ArrayList<String> nome,ArrayList<String> sobrenome) throws IOException{
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));

        for (int i=0;i<10;i++) {
                String linha = nome.get(i) + " " + sobrenome.get(i);
                buffWrite.append(linha + "\n");
        }
        buffWrite.close();

    }

}