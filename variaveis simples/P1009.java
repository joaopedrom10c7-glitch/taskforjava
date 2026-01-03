import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double vendas = sc.nextDouble();

        double total = salarioFixo + (vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        sc.close();
    }
}
