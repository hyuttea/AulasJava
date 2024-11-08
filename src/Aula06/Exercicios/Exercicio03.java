package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        boolean[] vetor = new boolean[8];

        int contadorTrue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira True ou False");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite true ou false para a posição " + i + ": ");
            boolean input = scanner.nextBoolean();
            vetor[i] = input;
            if (vetor[i]) {
                contadorTrue++;

                System.out.println("Quantidade de 'true' inseridos: " + contadorTrue);
            }
        }

    }
}
