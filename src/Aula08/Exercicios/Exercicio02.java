package Aula08.Exercicios;

import java.io.*;
import java.util.Scanner;

public class Exercicio02 {
    public class ArquivoLeitor {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            for (int i = 0; i < 5; i++) {
                salvarAluno(s.next());
            }

            listaAlunos();
        }

        public static void salvarAluno(String aluno) {
            File arquivo = new File("alunos.txt");
            try {
                FileWriter fw = new FileWriter(arquivo, true);
                fw.write(aluno + "\n");
                fw.close();
                System.out.println("Aluno(a) " + aluno + " cadastrado(a) com sucesso!");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }

        public static void listaAlunos() {
            try {
                FileReader fr = new FileReader("alunos.txt");
                BufferedReader bf = new BufferedReader(fr);

                String linha;
                while ((linha = bf.readLine()) != null) {
                    System.out.println(linha);
                }

                bf.close();
                fr.close();

            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
