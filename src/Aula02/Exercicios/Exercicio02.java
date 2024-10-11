package Aula02.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total, horasTrab , valorPago;

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horasTrab = scanner.nextInt();

        System.out.println("Digite o valor pago por horas trabalhadas: ");
        valorPago = scanner.nextInt();

        total = horasTrab * valorPago;
        System.out.println("O valor do salario total é = " + total);

    }
}
