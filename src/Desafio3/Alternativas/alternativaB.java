package Desafio3.Alternativas;

public class alternativaB {
    public static void letraB(int n) {
        int numero = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(numero + " ");
            numero *= 2;
        }
    }
}
