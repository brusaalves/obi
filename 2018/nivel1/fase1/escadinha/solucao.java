import java.util.Scanner;
import java.lang.Math;

class solucao {

    private static final Scanner IN = new Scanner(System.in);
    private static final double MIN = Math.pow(-10, 6);
    private static final double MAX = Math.pow(10, 6);

    public static void main(String[] args) {
        int len = IN.nextInt();
        int[] seq = new int[len];
        int escadinhas = 0;

        if (len < 0 || len > 1000) return;

        for (int i = 0; i < len; i++) {
            int el = IN.nextInt();
            if (el < MIN || el > MAX) return;
            seq[i] = el;
        }

        if (len == 1 || len == 2) {
            System.out.println(++escadinhas);
            return;
        }

        int previous = 0;
        for (int i = 0; i < len; i++) {
            if (i == (len - 1)) continue;
            int current = Math.abs(seq[i]);
            int next = Math.abs(seq[i + 1]);
            if ((current - next) == (previous - current)) {
                escadinhas++;
            }
            previous = current;
        }

        System.out.println(escadinhas);
    }
}