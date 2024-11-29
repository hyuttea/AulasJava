package Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //DESAFIO AULA 07

        String menu = """
                --------------------------------------
                |   Escolha uma opção:               |
                |      1- Exibir Cadatro Completo    |
                |      2- Inserir novo usuário       |
                |      3- Atualizar cadastro por id  |
                |      4- Deletar cadastro por id    |
                |      5- Sair                       |
                |------------------------------------|
                """;
        int opcao;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuario();
                    break;
                case 2:
                    cadstrarUsuario();
                    break;
                case 3:
                    atualizarUsuario();
                    break;
                case 4:
                    deletarUsuario();
                    break;
                case 5:
                    System.out.println("Fim de Programa");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }  while (opcao!=5);
    }
    public static void exibirUsuario(){
        System.out.println("Exibir");
    }
    public static void cadstrarUsuario(){
        System.out.println("Cadastrar");
    }
    public static void atualizarUsuario(){
        System.out.println("Atualizar");
    }
    public static void deletarUsuario(){
        System.out.println("Deletar");
    }
}
