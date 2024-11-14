package Aula07.Exemplos;

public class Exemplo02 {
    public static void main(String[] args) {
        //publico

        funcaoComParametroSemRetorno(5, "Teste"); //obedecer a sequencia de invocacao
        Exemplo01.funcaoSemParametroSemRetorno(); //invocamos a funçao do exemplo01
    }
    static void funcaoComParametroSemRetorno(int parametro1, String parametro2){
        System.out.println("Parametro 1 = " + parametro1);
        System.out.println("Parametro 2 = " + parametro2);
    }
}

