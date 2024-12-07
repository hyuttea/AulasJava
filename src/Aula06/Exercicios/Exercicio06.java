package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.println("digite o valor para a posição [" + i + "] [" + j + "]");

                matriz[i][j] = scanner.nextInt();

                System.out.println("Valor da matriz: " + matriz[i][j]);

            }


            }

        }
    }


