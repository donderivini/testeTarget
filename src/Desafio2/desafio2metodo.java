package Desafio2;

public class desafio2metodo {
    public static boolean pertenceSequencia(int num){
        int pri = 0;
        int seg = 1;

        while (seg <= num) {
            if (seg == num) {
                return true;
            }

            int prox = pri + seg;
            pri = seg;
            seg = prox;
        }

        return false;
    }
}
