package AulaPaulo;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("\t1- CADASTRO");
            System.out.println("\t2- CONSULTA");
            System.out.println("\t3- FIM");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            String nomeA;
            int numeroM;

            switch (opcao) {
                case 1:
                    System.out.println("Insira seu nome: ");
                    nomeA = scanner.nextLine();
                    System.out.println("Insira o número da matrícula: ");
                    numeroM = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer novamente
                    System.out.println("Nome: " + nomeA + ", Matrícula: " + numeroM);
                    break;
                case 2:
                    System.out.println("Insira seu nome: ");
                    nomeA = scanner.nextLine();
                    System.out.println("Insira o número da matrícula: ");
                    numeroM = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.println("Consulta de dados: " + nomeA + ", Matrícula: " + numeroM);
                    break;
                case 3:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 3);

        scanner.close();
    }
}