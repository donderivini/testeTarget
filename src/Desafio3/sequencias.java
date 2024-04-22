package Desafio3;

import Desafio3.Alternativas.alternativaA;
import Desafio3.Alternativas.alternativaB;
import Desafio3.Alternativas.alternativaC;
import Desafio3.Alternativas.alternativaD;
import Desafio3.Alternativas.alternativaE;
import Desafio3.Alternativas.alternativaF;

public class sequencias {
    public static void main(String[] args) {
        
        //Para alterar a quantidade de números exibidos nas sequências, é só alterar o "n" de cada alternativa...

        // a)
        System.out.println("Sequência a):");
        alternativaA.letraA(6);

        // b)
        System.out.println("\nSequência b):");
        alternativaB.letraB(8);

        // c)
        System.out.println("\nSequência c):");
        alternativaC.letraC(9);

        // d)
        System.out.println("\nSequência d):");
        alternativaD.letraD(6);

        // e)
        System.out.println("\nSequência e):");
        alternativaE.letraE(8);

        // f)
        System.out.println("\nSequência f):");
        alternativaF.letraF(9);
    }
}
