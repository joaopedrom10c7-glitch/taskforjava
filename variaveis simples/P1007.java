import java.util.Scanner;

public class mediana {
   public mediana() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double var2 = (double)var1.nextInt();
      double var4 = (double)var1.nextInt();
      double var6 = (double)var1.nextInt();
      double var8 = (var2 * 2.0 + var4 * 3.0 + var6 * 5.0) / 10.0;
      System.out.printf("MEDIA = %.5f%n", var8);
   }
}
