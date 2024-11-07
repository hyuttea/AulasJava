package Aula06.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        int[][] matrizNumeros = new int[2][3]; //linha | coluna

        matrizNumeros[0][0] = 1;
        matrizNumeros[0][1] = 2;
        matrizNumeros[0][2] = 3;
        matrizNumeros[1][0] = 4;
        matrizNumeros[1][1] = 5;
        matrizNumeros[1][2] = 6;

        System.out.println("Valor da matriz na posição [0][2] = " + matrizNumeros[0][2]);

        String [][] matrizNomes = new String[2][2];

        matrizNomes[0][0] = "amongus";
        matrizNomes[0][1] = "minecraft";
        matrizNomes[1][0] = "roblox";
        matrizNomes[1][1] = "genshin";

        System.out.println("Valor da matriz na posição [1][0] = " + matrizNomes[1][0]);
    }
}
