package Aula04.Exemplos;

import java.util.Scanner;

public class Exemplo07 {
    public static void main(String[] args) {
        //Desconto usando Operador Ternário
        Scanner scanner = new Scanner(System.in);

        float valorFinal = 0;
        float desconto = 0.2f;
        System.out.println("Digite o valor da compra: ");

        float valorCompra = scanner.nextFloat();
        valorFinal = valorCompra >= 100 ? valorCompra-valorCompra*desconto : valorCompra; //True : False
        System.out.println("O valor final da compra será de: " + valorFinal);
        scanner.close();
    }
}
