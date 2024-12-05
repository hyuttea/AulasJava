package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static int calcularMedia (double nota1, double nota2, double nota3) {
        return (int) (nota1 + nota2 + nota3 / 3);
    }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        System.out.println("A média das notas é: " + media);

        scanner.close();

    }
}


