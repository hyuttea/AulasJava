package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static int dobrar(int numero) {
        return numero * 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira  um número Inteiro");
        int numeroInteiro = scanner.nextInt();
        int resultado = dobrar (numeroInteiro);

        System.out.println("O dobro do número " + numeroInteiro + " é " + resultado);

    }
}
