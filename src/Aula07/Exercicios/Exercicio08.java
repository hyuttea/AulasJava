package Aula07.Exercicios;

public class Exercicio08 {
    public static int calculoFatatorial(int numero) {
        int r = numero;
        while (numero > 0) {
            r*= numero-1;
            numero--;
        }
        return r;
    }
}
