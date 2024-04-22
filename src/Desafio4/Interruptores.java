package Desafio4;
import java.util.Scanner;

public class Interruptores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Para descobrir a resposta, usei a seguinte lógica:

        System.out.println("Você está na sala das lâmpadas.");

        //Ligar o primeiro interruptor e esperar alguns minutos e depois desligá-lo:
        System.out.println("Ligar o interruptor 1 e esperar alguns minutos. Depois, desligá-lo.");

        //Ligar o segundo interruptor e entrar na sala:
        System.out.println("Ligar o interruptor 2 e entrar na sala das lâmpadas.");

        //A lâmpada que estiver acesa é referente ao interruptor 2.
        System.out.print("Qual lâmpada está acesa? (Digite o número correspondente): ");
        int lampadaAcesa = scanner.nextInt();

        //Agora, devemos observar qual lâmpada está quente:
        System.out.print("Qual lâmpada está quente? (Digite o número correspondente): ");
        int lampadaQuente = scanner.nextInt();

        // Determinando os interruptores com base nas lâmpadas acesa e quente:
        int interrupQuente = 1; // O interruptor que controla a lâmpada quente sempre será o 1;
        int interrupAcesa = 2; // O interruptor que controla a lâmpada acesa sempre será o 2;
        int interrupRest = 3; // O terceiro interruptor controla a lâmpada restante.

        // Imprimindo os resultados:
        System.out.println("O interruptor que controla a Lâmpada " + lampadaAcesa + " é o Interruptor " + interrupAcesa + ".");
        System.out.println("O interruptor que controla a Lâmpada " + lampadaQuente + " é o Interruptor " + interrupQuente + ".");
        System.out.println("O interruptor que controla a Lâmpada restante é o Interruptor " + interrupRest + ".");

        scanner.close();
    }
}