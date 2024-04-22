package Desafio3.Alternativas;

public class alternativaE {
    public static void letraE(int n) {
        int primeiro = 1, segundo = 1;
        System.out.print(primeiro + " " + segundo + " ");
        for (int i = 2; i < n; i++) {
            int proximo = primeiro + segundo;
            System.out.print(proximo + " ");
            primeiro = segundo;
            segundo = proximo;
        }
    }
}
