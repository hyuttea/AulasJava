package Aula08.Exercicios;

import java.io.*;

public class Exercicio03 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("alunos.txt");
            FileWriter fw = new FileWriter("src\\Aula08\\Exercicios\\backup_alunos.txt", true);

            BufferedReader bf = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);

            String linha;
            while((linha=bf.readLine())!=null){
                bw.write(linha+"\n");
            }

            bf.close();
            bw.close();
            fr.close();
            fw.close();

        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

    }
}

