package Aula05;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha uma opção: ");

            System.out.println("\t1 - Para escolher opção 1");
            System.out.println("\t2 - Para escolher opção 2");
            System.out.println("\t3 - Para escolher opção 3");
            System.out.println("\t4 - SAIR ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Parabéns você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Parabéns você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Parabéns você escolheu a opção 3");
                    break;
                case 4:
                    System.out.println("Tchau!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }

        } while (opcao!=4);
        System.out.println("Fim do programa!");
        scanner.close();
    }
}
