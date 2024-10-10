package Aula02.Exemplos;
import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digitar um numero inteiro: ");
        int varInt = scanner.nextInt();
        long varlong = varInt;
        float varFloat = varInt;

        System.out.println("O numero Inteiro digitado é: " + varInt);
        System.out.println("varlong = " + varlong );
        System.out.println("varFloat = " + varFloat);

        System.out.println("digitar um numero decimal: ");
        varFloat = scanner.nextFloat();
        System.out.println("O numero decimal digitado é: " + varFloat);

        scanner.close();

    }
}
