package Aula02.Exemplos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exemplo08 {

    public static void main(String[] args) {
        String texto = "Este texto esta na primeira linha\nabule\naaaaaaaa\nkkkkkkkkkkkkk" + "\n\tEste texto esta na terceira linha e com tabulação";

            System.out.println(texto);

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // este comando serve para consumir o \n que o netInt deixou na memoria
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " +nome+ "e sua idade é" +idade);

        System.out.println(texto);
    }
}
