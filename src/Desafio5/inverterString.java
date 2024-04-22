package Desafio5;

import java.util.Scanner;

public class inverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String invertida = stringInvertida.Invertida(entrada);

        System.out.println("String invertida: " + invertida);

        scanner.close();
    }
}
