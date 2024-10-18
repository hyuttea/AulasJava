package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int compra;
        float valorDes = 0;

        System.out.println("Digite o valor da sua compra");
        compra = scanner.nextInt();

        if (compra > 100) {
            valorDes = compra - compra * 0.1f;

            System.out.println("O valor com desconto é: " + valorDes);
        }else{
            System.out.println("Valor a ser pago é: " + compra);
        }







    }
}
