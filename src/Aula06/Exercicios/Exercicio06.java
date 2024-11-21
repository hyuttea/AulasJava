package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = 2;
        int colunas = 2;

        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

                System.out.println("digite o valor para a posição [" + i + "] [" + j + "]");

                matriz[i][j] = scanner.nextInt();
                break;

                //NAO CONCLUIDO
            }


        }
    }
}


