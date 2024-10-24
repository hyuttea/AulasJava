package AulaPaulo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma opção: ");
        System.out.println("\t1- CADASTRO: ");
        System.out.println("\t2- CONSULTA: ");

        int opcao = scanner.nextInt();
        String nomeA;
        String numeroM;

        switch (opcao) {
            case 1:
                System.out.println("Insira seu nome: "  );
                nomeA = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Insira o número da matricula: "  );
                numeroM = scanner.nextLine();
                break;
            case 2:
                System.out.println("Insira seu nome: "  );
                nomeA = scanner.nextLine();
                scanner.nextLine(); //Separar "insira seu nome" do "insira o numero da matricula.
                System.out.println("Insira o número da matricula: "  );
                numeroM = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Consulta de dados" + numeroM );
                break;
            default:
                System.out.println("Opção Invalida");
        }
        scanner.close();

    }
}
