package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int m = matriz[0][0];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > m) ;

                m = matriz[i][j];
            }
        }
        System.out.println("Maior numero: " + m);
    }
}

