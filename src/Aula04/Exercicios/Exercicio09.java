package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horario;

        System.out.println("Digite a hora atual para verificar a qual turno corresponde");
        horario = scanner.nextInt();

        if (horario >= 5 && horario <= 12) {
            System.out.println("Manhã");
        }else if (horario > 12 && horario <= 18) {
            System.out.println("Tarde");
        }else if (horario > 18 && horario <= 22) {
            System.out.println("Noite");
        }else if (horario < 22 && horario < 5) {
            System.out.println("Madrugada");
        } else {
            System.out.println(" Invalido");

            scanner.close();

        }
    }
}
