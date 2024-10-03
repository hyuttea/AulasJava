package Aula02.Exemplos;

import java.util.Arrays;

public class Exemplo02 {
    public static void main(String[] args) {
        int total, numero1 = 2, numero2 = 4;

        total = numero1 + numero2;
        System.out.println("a soma dos numeros é = " + total);
        total = numero1 - numero2;
        System.out.println("a subtração dos numeros é = " + total);
        total = numero1 * numero2;
        System.out.println("a multiplicação dos numeros é = " + total);

        float totalFloat, numero1Float=2;
        totalFloat = numero1Float / numero2;
        System.out.println("a divisão dos numeros é = " + totalFloat);

        float modulo = numero1Float % numero2;

        System.out.println("O resto da divisão de" +numero1Float+ "por" + numero2 + "é igual a" + modulo);

    }
}
