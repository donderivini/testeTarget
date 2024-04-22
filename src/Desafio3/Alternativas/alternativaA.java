package Desafio3.Alternativas;

public class alternativaA {
    public static void letraA(int n) {
        int primeiro = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " ");
            primeiro += 2;
        }
    }
}
