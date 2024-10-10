package Aula02.Exemplos;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar um numero inteiro: ");

        int varInt = scanner.nextInt();
        short varShort = (short) varInt;
        byte varByte = (byte) varShort;

        System.out.println("O numero Inteiro digitado é: " + varInt);
        System.out.println("varShort = " + varShort );
        System.out.println("varByte = " + varByte );

        System.out.println("digitar um numero decimal: ");
        double varDouble = scanner.nextDouble();
        float varFloat = (float) varDouble;

        System.out.println("O numero decimal digitado é: " + varDouble);
        System.out.println("varFloat = " + varFloat);


        scanner.close();
    }
}
