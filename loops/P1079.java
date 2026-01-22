import java.util.Scanner;

public class P1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCasos = sc.nextInt();

        for (int i = 0; i < nCasos; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int inicio = Math.min(x, y) + 1;
            int fim = Math.max(x, y);
            int soma = 0;

            for (int j = inicio; j < fim; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }
            System.out.println(soma);
        }
        sc.close();
    }
}