package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        double[] vetor = new double[4];
        double media = 0;
        double soma = 0;

        System.out.println("Digite 4 notas decimais");
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor = new double[]{scanner.nextDouble()};
            soma += vetor[i];
        }

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
