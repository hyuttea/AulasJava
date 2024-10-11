package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar um numero fracionado: ");

        double numeroFra = scanner.nextDouble();
        int n2 = (int) numeroFra;

        System.out.println();
        numeroFra = scanner.nextInt();

        System.out.println();
        n2 = scanner.nextInt();

        scanner.close();

    }


}
