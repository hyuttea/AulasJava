package Desafios;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {

        //DESAFIO AULA 06

        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você deseja cadastrar?");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();

        String[] cabecalho = {"ID","Nome","Telefone","Email"};
        String[][] matrizCadastro = new String[qtdPessoas+1][cabecalho.length];
        matrizCadastro[0] = cabecalho;

        for (int linhas = 1; linhas <= qtdPessoas; linhas++) {
            System.out.println("Preencha as informaçoes a seguir");
            System.out.println("ID- " + linhas);
            matrizCadastro[linhas][0] = String.valueOf(linhas); //converte numero para string

            System.out.print("Nome- ");
            matrizCadastro[linhas][1] = scanner.nextLine();

            System.out.print("Telefone- ");
            matrizCadastro[linhas][2] = scanner.nextLine();

            System.out.print("Email- ");
            matrizCadastro[linhas][3] = scanner.nextLine();

        }
        String tabela = "";
        for (String[] linhas : matrizCadastro){ //Matriz de String
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++){
                 tabela += linhas[coluna] + "\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
        scanner.close();
    }
}
