package Aula04.Exemplos;

public class Exemplo07 {
    public static void main(String[] args) {
        //Desconto usando Operador Ternário

        float valorCompra = 150.50f;
        float desconto = 0.2f;
        float valorFinal;

        valorFinal = valorCompra > 100.0f ? valorCompra-valorCompra*desconto : valorCompra; //True : False
        System.out.println(valorFinal);
    }
}
