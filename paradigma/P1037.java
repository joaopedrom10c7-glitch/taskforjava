package paradigma;

import java.util.Scanner;

 
public class P1037 {
 
    public static String verificarIntervalo(double numero) {
        if (numero < 0 || numero > 100) {
            return "Fora de intervalo";
        } else if (numero <= 25) {
            return "Intervalo [0,25]";
        } else if (numero <= 50) {
            return "Intervalo (25,50]";
        } else if (numero <= 75) {
            return "Intervalo (50,75]";
        } else {
            return "Intervalo (75,100]";
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextDouble();
        System.out.println(verificarIntervalo(numero));
        sc.close();
    }
}