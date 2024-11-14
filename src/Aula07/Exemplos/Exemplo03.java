package Aula07.Exemplos;

public class Exemplo03 {
    public static void main(String[] args) {
        //privado
        int retorno = funcaoComParametroComRetorno(2,3);
        System.out.println(retorno);
    }
    private static int funcaoComParametroComRetorno(int numero1, int numero2){
        return numero1+numero2;

    }
}
