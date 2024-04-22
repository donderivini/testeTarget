package Desafio5;

public class stringInvertida {
    public static String Invertida(String str) {
        String invertida = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i);
        }
        return invertida;
    }

}
