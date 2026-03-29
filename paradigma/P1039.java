package paradigma;

import java.util.Scanner;
 

 
public class P1039 {
 
    public static double calcularDistancia(int x1, int y1, int x2, int y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx * dx + dy * dy);
    }
 
    public static boolean cacadorFicaRico(int r1, int x1, int y1, int r2, int x2, int y2) {
        double distancia = calcularDistancia(x1, y1, x2, y2);
        return r1 >= distancia + r2;
    }
 
    public static String verificarResultado(int r1, int x1, int y1, int r2, int x2, int y2) {
        return cacadorFicaRico(r1, x1, y1, r2, x2, y2) ? "RICO" : "MORTO";
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        while (sc.hasNextInt()) {
            int r1 = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r2 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
 
            System.out.println(verificarResultado(r1, x1, y1, r2, x2, y2));
        }
 
        sc.close();
    }
}
 