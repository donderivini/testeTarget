package Desafio3.Alternativas;

public class alternativaF {
    public static void letraF(int n) {
        int numero = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                numero += 8;
            } else if (i % 3 == 0) {
                numero += 2;
            } else {
                numero += 1;
            }
            System.out.print(numero + " ");
        }
    }
}
