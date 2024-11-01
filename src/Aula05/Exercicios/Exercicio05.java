package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;
        int notas = 5;

        for (int i = 1; i <= notas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }


        double media = soma / notas;

        System.out.println("A média das notas é: " + media);

        scanner.close();

    }
}
