package Aula05;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //exemplo while

        int idade = 0;

        while (idade < 18){  //vai continuar repetindo até receber um valor maior que 18, ai ele para.
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        }
        System.out.println("Voce é maior de idade");
        scanner.close();
    }
}
