package Aula05;

public class Exemplo06 {
    public static void main(String[] args) {
        // continue (for) força o loop a executar o próximo passo

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}