package Aula06.Exemplos;

public class Exemplo08 {
    public static void main(String[] args) {
        //Matriz bidirecional
        int[][] matrizNumeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        };
        for (int[] matrizNumero : matrizNumeros) {
            for (int i : matrizNumero) {
                System.out.println(i);

            }

        }
        String[][] matrizNomes = {{"amongus", "minecraft"}, {"roblox", "genshin"}};
        for (String[] matrizNome : matrizNomes) {
            for (String s : matrizNome) {
                System.out.println(s);
            }
        }
    }
}

