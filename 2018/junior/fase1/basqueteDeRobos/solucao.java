// OBI 2018 (Basquete de Robos) - Bruno Alves <brunosalves3@gmail.com>

import java.util.Scanner;

class solucao {

    private static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        double D = in.nextDouble();
        if (D < 0 || D > 2000) System.exit(0);
        if (D <= 800) System.out.println(1);
        if (D > 800 && D <= 1400) System.out.println(2);
        if (D > 1400 && D <= 2000) System.out.println(3);
    }    
}