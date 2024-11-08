package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        System.out.print("Digite 5 número inteiro: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Você digitou os seguintes números: " );
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
        scanner.close();



        }
    }

