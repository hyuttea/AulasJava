package Aula08.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 0; i <5; i++) {
            salvarAluno(s.next());
        }
    }
    public static void salvarAluno(String aluno){
        File arquivo = new File("src\\Aula08\\Exercicios\\arquivo.txt");
        try {
            FileWriter fw = new FileWriter(arquivo,true);
            fw.write(aluno+"\n");
            fw.close();
            System.out.println("Aluno(a) "+aluno+" cadastrado(a) com sucesso!");
        } catch (IOException ex) {
            System.out.println(ex);
            throw new RuntimeException(ex);
        }
    }
}


