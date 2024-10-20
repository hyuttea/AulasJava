package Aula02.Exercicios;

public class Exercicio07 {
    public static void main(String[] args) {

        boolean cond1 = true;
        boolean cond2 = false;
        boolean cond3 = true;

        boolean resultadoAnd = cond1 && cond2 && cond3;
        boolean resultadoOr = cond1 || cond2 || cond3;

        System.out.println("&&: " + resultadoAnd);
        System.out.println("||: " + resultadoOr);
    }
}
