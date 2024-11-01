package Aula05.Exercicios;

public class Exercicio06 {
    public static void main(String[] args) {
        //0,1, 1, 2, 3, 5, 8, 13, 21, 34,

        int n = 10;

        int termo1 = 0;
        int termo2 = 1;
        int c = 0;

        System.out.println("Dez posições da Sequência de Fibonacci ");

        while (c < n) {
            System.out.println(termo1 + " ");

            int proximoTermo = termo1 + termo2;
            termo1 = termo2;
            termo2 = proximoTermo;
            c++;
        }


    }
}
