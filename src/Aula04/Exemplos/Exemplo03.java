package Aula04.Exemplos;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite sua idade");
        idade = scanner.nextInt();

        if (idade > 0 && idade <= 12) {
            System.out.println("Criança");
        } else if (idade >= 13 && idade <= 12) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Adulto");
        } else if (idade > 65) {
            System.out.println("Idoso");
        scanner.close();

    }
 }
