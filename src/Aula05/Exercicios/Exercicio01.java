package Aula05.Exercicios;

public class Exercicio01 {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) {
            if (i == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}