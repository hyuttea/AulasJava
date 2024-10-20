package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int horasT = scanner.nextInt();

        System.out.println("Digite o valor de horas normal: R$ ");
        double horasN = scanner.nextDouble();

        double vhorasE = 0;

        if (horasT > 40) {
            int horasE = horasT - 40;
            vhorasE = horasE * horasN * 1.5;
        }

        System.out.println("O valor a ser pago por hora extra é: R$" + vhorasE);

        scanner.close();
    }
}
