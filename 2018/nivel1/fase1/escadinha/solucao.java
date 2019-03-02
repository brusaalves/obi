import java.util.Scanner;
import java.lang.Math;

class solucao {

    private static final Scanner IN = new Scanner(System.in);
    private static final int MAX = (int) Math.pow(10, 6);
    private static final int MIN = MAX * -1;

    public static void main(String[] args) {
        int len = IN.nextInt();
        int[] seq = new int[len];
        int escadinhas = 0;

        if (len < 1 || len > 1000) return;

        for (int i = 0; i < len; i++) {
            int el = IN.nextInt();
            if (el < MIN || el > MAX) return;
            seq[i] = el;
        }

        if (len == 1 || len == 2) {
            System.out.println(++escadinhas);
            return;
        }

        int mem = 0;
        int atual = Math.abs(seq[0]);
        for (int i = 1; i < len; i++) {
            int corrente = Math.abs(seq[i]);
            if (mem == atual - corrente) escadinhas++;
            mem = atual - corrente;
            atual = corrente;
        }

        System.out.println(escadinhas);
    }
}