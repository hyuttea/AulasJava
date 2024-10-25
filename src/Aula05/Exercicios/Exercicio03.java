package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();


        if (numero < 0) {
            System.out.println("Por favor, digite um número positivo.");
            return;
        }
        long fatorial = 1;
        int i = 1;

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
    }

