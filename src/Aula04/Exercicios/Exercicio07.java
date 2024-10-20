package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero: ");
        double n1 = scanner.nextDouble();

        System.out.println("Insira o segundo numero: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("\t1- SOMA: ");
        System.out.println("\t2- SUBTRAÇÃO: ");
        System.out.println("\t3- MULTIPLICAÇÃO: ");
        System.out.println("\t4- DIVISÃO: ");

        int opcao = scanner.nextInt();

        double resultado;

        switch (opcao) {
            case 1:
                resultado = n1 + n2;
                System.out.println("O resultado da soma é " + resultado );
                break;
            case 2:
                resultado = n1 - n2;
                System.out.println("O resultado da subtração é " + resultado);
                break;
            case 3:
                resultado = n1 * n2;
                System.out.println("O resultado da multiplicação é " + resultado);
                break;
            case 4:
                resultado = n1 / n2;
                System.out.println("O resultado da divisão é " + resultado);
                break;
            default:
                System.out.println("Opcao Invalida");
        }
            scanner.close();

    }
}
