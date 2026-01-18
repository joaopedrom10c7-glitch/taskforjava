import java.util.Locale;
import java.util.Scanner;

public class P1038 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double [] preco = {0.0, 4.0,4.50, 5.00, 2.0, 1.50};
        double total = preco[codigo] * quantidade;
        System.out.printf("Total: R$ %.2f\n", total);
        sc.close();

    }
}
