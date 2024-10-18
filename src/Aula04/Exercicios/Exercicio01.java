package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso Liberado");

        } else if (idade < 18) {
            System.out.println("Acesso Negado");

            scanner.close();


        }
    }
}
