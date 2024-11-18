package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] nomes = {"kev", "raf", "bia"};

        System.out.println("Qual nome deseja verificar?");
        Scanner scanner = new Scanner(System.in);

        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;


        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O nome " + nomeBusca + " está presente no vetor.");
        } else {
            System.out.println("O nome " + nomeBusca + " não está presente no vetor.");
        }

        scanner.close();
    }
}
