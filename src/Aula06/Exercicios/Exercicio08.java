package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] matriz = new double[2][2];

        for (int i = 0; i < 2; i++) {
            double r = 0; //dentro do for: soma de cada linha
            for (int j = 0; j < 2; j++) {

                System.out.println("digite numeros Reais: ");
                matriz[i][j] = scanner.nextDouble();
                r += matriz[i][j];

            }
            System.out.println("Total: " + r);
        }
    }
}

