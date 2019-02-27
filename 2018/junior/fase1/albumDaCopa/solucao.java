// OBI 2018 (Album da Copa) - Bruno Alves <brunosalves3@gmail.com>

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class solucao {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        int N = 0, M = 0;
        N = in.nextInt();
        if (N < 1 || N > 100) System.exit(0);
        M = in.nextInt();
        if (M < 1 || N > 300) System.exit(0);
        Set<Integer> X = new HashSet<Integer>();
        for (int i = 0; i < M; i++) X.add(in.nextInt());
        System.out.println(N - X.size());
    }

}
