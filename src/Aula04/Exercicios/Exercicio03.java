package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1- Eletronicos: ");
        System.out.println("\t2- Alimentos: ");
        System.out.println("\t3- Vestuario: ");

        int codPro;

        codPro = scanner.nextInt();

        switch (codPro) {
            case "Eletronicos":
                System.out.println("");
                break;
            case "Alimentos":
                System.out.println("");
                break;
            case "Vestuarios":
                System.out.println("");
                break;

        }
    }
}
