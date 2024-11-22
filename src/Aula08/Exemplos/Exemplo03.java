package Aula08.Exemplos;

import java.io.*;

public class Exemplo03 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08\\Exemplos\\arquivo.txt");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo));
            bufferedWriter.write("Novo Texto a ser gravado no arquivo");
            bufferedWriter.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = bufferedReader.readLine()) != null){
                System.out.println(linha);
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
