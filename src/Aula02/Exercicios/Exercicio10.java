package Aula02.Exercicios;

public class Exercicio10 {

    public static void main(String[] args) {
        short valorS = 5;
        int valorI = valorS;
        byte valorB = (byte) valorI;

        System.out.println("Valor Short: " +valorS);
        System.out.println("Valor Int: " +valorI);
        System.out.println("Valor Byte: " +valorB);
    }
}
