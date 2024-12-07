package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = 0; //fora do for: soma valor total

        int[][] matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.println("digite numeros inteiros: ");
                matriz[i][j] = scanner.nextInt();
                r += matriz[i][j];

            }
        }
        System.out.println("Total: " + r);
    }
}
