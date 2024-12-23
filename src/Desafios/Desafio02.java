package Desafios;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio02 {
    //DESAFIO AULA 07

    static Scanner scanner = new Scanner(System.in);
    static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
    static String[][] matrizCadastro = {{"", ""}}; //inicializando para nao ter problema no codigo | ultilizando aspas para ser string

    public static void main(String[] args) {
        matrizCadastro[0] = cabecalho;


        String menu = """
                ______________________________________
                |   Escolha uma opção:               |
                |      1- Exibir Cadatro Completo    |
                |      2- Inserir novo usuário       |
                |      3- Atualizar cadastro por id  |
                |      4- Deletar cadastro por id    |
                |      5- Sair                       |
                |____________________________________|
                """;
        int opcao;

        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    exibirUsuarios();
                    break;
                case 2:
                    cadastrarUsuarios();
                    break;
                case 3:
                    atualizarUsuarios();
                    break;
                case 4:
                    deletarUsuarios();
                    break;
                case 5:
                    System.out.println("Fim de Programa");
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);
    }

    private static void exibirUsuarios() {
        StringBuilder tabela = new StringBuilder(); // "StringBuild" prepara a string antes de jogar na memoria
        for (String[] linha : matrizCadastro) { //Matriz de String
            for (int coluna = 0; coluna < matrizCadastro[0].length; coluna++) {
                int tamanhoColuna = coluna == 0 ? 5 : (coluna == 2 ? 12 : 25); //tamanho de caracteres em cada coluna
                tabela.append(String.format("%-" + tamanhoColuna + "s | ", linha[coluna])); //para formatar a String | o simbolo para "String" é "%s"
            }
            tabela.append("\n");
        }
        System.out.println(tabela);
    }

    private static void cadastrarUsuarios() {

        System.out.print("Quantas pessoas você deseja cadastrar?");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine();
        String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][cabecalho.length]; //pegar a matriz global e ver quantas pessoas tem e aumentar a matriz
        for (int linha = 0; linha < matrizCadastro.length; linha++) {
            novaMatriz[linha] = Arrays.copyOf(matrizCadastro[linha], matrizCadastro[linha].length);   //o "Arrays" é uma classe com varias ferramentas, o "Arrays.copyOf" pega a matriz inteira e copia
        }
        System.out.println("Preencha as informaçoes a seguir");
        for (int linha = matrizCadastro.length; linha < novaMatriz.length; linha++) {
            System.out.println(cabecalho[0] + " - " + linha);
            novaMatriz[linha][0] = String.valueOf(linha); //converte numero para string

            for (int coluna = 1; coluna < cabecalho.length; coluna++) {
                System.out.print(cabecalho[coluna] + ": ");
                novaMatriz[linha][coluna] = scanner.nextLine();
            }
        }
        matrizCadastro = novaMatriz;
    }

    private static void atualizarUsuarios() {
        exibirUsuarios();

        System.out.println("\nDigite o ID do Usuario que deseja atualizar: ");
        int idEscolhido = scanner.nextInt();
        scanner.nextLine();
        System.out.println(cabecalho[0] + " - " + idEscolhido);
        for (int coluna = 1; coluna < cabecalho.length; coluna++) {
            System.out.print(cabecalho[coluna] + ": ");
            matrizCadastro[idEscolhido][coluna] = scanner.nextLine();
        }

        exibirUsuarios();
    }
    private static void deletarUsuarios () {


        }

    }


