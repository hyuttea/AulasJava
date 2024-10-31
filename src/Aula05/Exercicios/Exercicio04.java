package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {

            boolean primo = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    primo = false;
                }

                if (primo) {
                    System.out.println(i);


                }
            }

        }
    }
}