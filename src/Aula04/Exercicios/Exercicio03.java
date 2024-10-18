package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção: ");
        System.out.println("\t1- Eletronicos: ");
        System.out.println("\t2- Alimentos: ");
        System.out.println("\t3- Vestuario: ");

        int codPro = 5050;


        codPro = scanner.nextInt();

        switch (codPro) {
            case 1 :
                System.out.println("Código Promocional é: Senai10%");
                break;
            case 2 :
                System.out.println("Código Promocional é: Senai30%");
                break;
            case 3 :
                System.out.println("Código Promocional é: Senai5%");
                break;


        }
    }
}
