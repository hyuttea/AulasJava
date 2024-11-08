package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        String[] nomes = {"m", "i", "a", "u", "e", "r"};
        String aviso = "Letra não encontrada";

        System.out.println("Digite uma letra: ");
        Scanner scanner = new Scanner(System.in);

        String letra = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (letra.equals(nomes[i])) {
                aviso = "Letra encontrada na posição " + i;
               break;
            }
        }
        System.out.println(aviso);
        scanner.close();
    }
}
