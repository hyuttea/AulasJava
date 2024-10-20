package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor das vendas: R$");
        double vendas = scanner.nextDouble();
        double comissao;

        if (vendas < 1000) {
            comissao = vendas * 0.05;
        }else if (vendas >= 1000 && vendas <= 5000) {
            comissao = vendas * 0.10;
        }else {
            comissao = vendas * 0.15;
        }
        System.out.println("O valor da comissão é: R$" + comissao);

        scanner.close();
    }
}
