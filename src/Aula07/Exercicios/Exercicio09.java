package Aula07.Exercicios;

public class Exercicio09 {
    public static int calcularPotencia(int x, int y){
        int r= x;

        if (y==0){return 1;}

        while (y<0){
            r = x*x;
            y--;
        }

        return 0;

    }
}
