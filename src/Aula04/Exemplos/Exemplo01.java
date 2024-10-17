package Aula04.Exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Digite um numero inteiro");
        x = scanner.nextInt();

        if(x>=30) {
            System.out.println("O número é maior ou igual a 30");
        }else{
            System.out.println("O número é menor que 30");
        }
        scanner.close();
    }
}
