package Aula06.Exemplos;

public class Exemplo06 {
    public static void main(String[] args) {
        int[][] matrizNumeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        for (int i = 0; i < matrizNumeros.length; i++) {
            for (int j = 0; j < matrizNumeros[i].length; j++) {
                System.out.println(matrizNumeros[i][j]);

            }

        }
        String[][] matrizNomes = {{"amongus", "minecraft"}, {"roblox", "genshin"}};
        for (int i = 0; i < matrizNomes.length; i++) {
            for (int j = 0; j < matrizNomes[i].length; j++) {
                System.out.println(matrizNomes[i][j]);
            }
        }
    }
}
