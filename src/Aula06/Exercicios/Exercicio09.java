package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int q = 0;

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) {
                    q++;

                    q += matriz[i][j];

                }
            }
            System.out.println("Numeros pares presentes na matriz: " + q);
        }
    }
}

