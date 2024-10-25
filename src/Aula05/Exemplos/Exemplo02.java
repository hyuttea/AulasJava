package Aula05.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        //exemplo do-while
        //a condição é testada no fim do bloco

        Scanner scanner = new Scanner(System.in);

        int idade; //mesmo não atribuindo valor ele funciona

        do {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println(idade);
        }while (idade < 18);
        System.out.println("Voce é maior de idade");
        scanner.close();
    }
}
