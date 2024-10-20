package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua nota: ");

        int nota;
        nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("APROVADO");
        } else if (nota >= 5 ) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }

        scanner.close();

    }
}
