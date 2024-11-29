package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static int ConverterCelsiusParaFahrenhenit (int celsius) {
        return (int) (celsius *1.8) + 32 ;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor em Celsius");
        int celsius = scanner.nextInt();

    }
}

