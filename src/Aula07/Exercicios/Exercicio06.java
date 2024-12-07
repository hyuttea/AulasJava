package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static boolean verificarPar(int numero) {
        return (numero%2)==0; //ja é booleano

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verifique se é True ou False: ");
        int s = scanner.nextInt();

        System.out.println(verificarPar(s));

        //System.out.println(verificarPar(s.nextInt)); [Da pra por uma função dentro da outra | retorno da função]
    }
}
