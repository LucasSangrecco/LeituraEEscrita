package br.com.exercicios.io;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\Users\\12114651\\Downloads\\Nomes.txt";
        String path2 = "C:\\Users\\12114651\\Downloads\\Sobrenome.txt";
        String path3 = "C:\\Users\\12114651\\Downloads\\NomeESobrenome.txt";

        ArrayList<String> nomes = Nomes.leitorNome(path1);
        ArrayList<String> sobrenomes = Nomes.leitorSobrenome(path2);

        for(int i=0;i<nomes.size();i++){
            String linhaNome=(String)nomes.get(i);
            String linhaSobrenome=(String)sobrenomes.get(i);
            Nomes.escritorNomeESobrenome(linhaNome + " " + linhaSobrenome);
            Nomes.leitorNomeESobrenome(path3);
        }
        Nomes.fecharBuff();

    }
}
