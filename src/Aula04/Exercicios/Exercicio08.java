package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        System.out.println("Avalie de 1 á 5 quão satisfeito está com o desempenho de Fulano? ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção ");
        System.out.println("\t1- Precisa Melhorar ");
        System.out.println("\t2- Abaixo da Média ");
        System.out.println("\t3- Média ");
        System.out.println("\t4- Acima da Média ");
        System.out.println("\t5- Excelente ");

        int avaliacao;
        avaliacao = scanner.nextInt();
        switch (avaliacao) {
            case 1:
                System.out.println("Agradecemos a Avaliação");
                break;
            case 2:
                System.out.println("Agradecemos a Avaliação");
                break;
            case 3:
                System.out.println("Agradecemos a Avaliação");
                break;
            case 4:
                System.out.println("Agradecemos a Avaliação");
                break;
            case 5:
                System.out.println("Agradecemos a Avaliação");
                break;
            default:
                System.out.println("Opcao Invalida");

                scanner.close();


        }
    }
}