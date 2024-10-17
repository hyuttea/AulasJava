package Aula04.Exemplos;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
       String corSemafaro;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a cor do semáforo: ");
        corSemafaro = scanner.next();

       if (corSemafaro.equals("verde")|| corSemafaro.equals("verde")){
           System.out.println("Siga!");
       }else if (corSemafaro.equals("Amarelo") || corSemafaro.equals("amarelo")){
           System.out.println("Atenção!");
       }else if (corSemafaro.equals("Vermelho") || corSemafaro.equals("vermelho")){
           System.out.println("Pare!");
       }else{
           System.out.println("Invalido!");

           scanner.close();

       }
    }
}
