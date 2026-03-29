package paradigma;

import java.util.Scanner;

public class P1038 {
 
    public static double obterPrecoUnitario(int codigo) {
        switch (codigo) {
            case 1: return 4.00;
            case 2: return 4.50;
            case 3: return 5.00;
            case 4: return 2.00;
            case 5: return 1.50;
            default: return 0.00;
        }
    }
 
    public static double calcularTotal(int codigo, int quantidade) {
        return obterPrecoUnitario(codigo) * quantidade;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
 
        double total = calcularTotal(codigo, quantidade);
        System.out.printf("Total: R$ %.2f%n", total);
 
        sc.close();
    }
}

