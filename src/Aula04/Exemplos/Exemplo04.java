package Aula04.Exemplos;

import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String corSemafaro;
        System.out.println("Digite a cor do semafaro: ");
        corSemafaro = scanner.nextLine();
        switch (corSemafaro) {
            case "verde", "Verde" , "VERDE":
                System.out.println("Siga");
                break; // break serve para interromper o switch, caso tirar ele, o codigo ira executar o proximo case
            case "amarelo" , "Amarelo" , "AMARELO" :
                System.out.println("atenção");
                break;
            case "vermelho" , "Vermelho" , "VERMELHO":
                System.out.println("pare");
                break;
            default:
                System.out.println("invalido!");

                scanner.close();
        }
    }
}
