package Aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        File arquivo = new File("src\\Aula08\\Exemplos\\arquivo.txt"); //dar o nome do arquivo no final EX: "arquivo.txt"

        if (arquivo.exists()) {
            System.out.println("O arquivo já existe!!");
        } else {
            try {
                if (arquivo.createNewFile()) { //verifica se existe
                    System.out.println("Arquivo criado com sucesso" + arquivo.getName());
                }else{
                    System.out.println("Falha ao criar o arquivo");
                }
            } catch (IOException e) { //criar o arquivo pode dar o erro "IOException" | O "catch" pega ese erro
                throw new RuntimeException(e);
            }

        }
    }
}