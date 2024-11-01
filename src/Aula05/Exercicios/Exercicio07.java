package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        do {
            System.out.println("Insira uma nota de 0 á 10: ");
            nota = scanner.nextInt();
        }while (nota > 10);
        scanner.close();
        }


    }

