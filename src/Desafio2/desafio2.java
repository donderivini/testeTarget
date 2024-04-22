package Desafio2;
import java.util.Locale;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean encerrar = false;

        do{
            System.out.println("Vamos descobrir os números da sequência de Fibonaci?");
            System.out.println("Digite um número:");

            int entrada = scanner.nextInt();

            if (desafio2metodo.pertenceSequencia(entrada)){
                System.out.println("O número " + entrada + " pertence a sequência!");
            } else {
                System.out.println("O número " + entrada + " não pertence a sequência!");
            } 

            System.out.println("Deseja verificar outro número? \n(Pressione 1 para sim e 2 para não.)");
            int resp = scanner.nextInt();

            if (resp == 2) {
                encerrar = true;
                System.out.println("Fim da operação!");
            }
        } while (!encerrar);
        
        scanner.close();
        }
    }

