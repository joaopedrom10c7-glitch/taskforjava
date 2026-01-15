import java.util.Locale;
import java.util.Scanner;

public class P1019{
    public static void main(String[]args){
            Locale.setDefault(Locale.US);
            Scanner sc= new Scanner(System.in);

   double x1  = sc.nextDouble();
   double y1  = sc.nextDouble();
   double x2  = sc.nextDouble();
   double y2  = sc.nextDouble();
   Double equacaox=Math.pow(x2-x1,2);
   Double equacaoy=Math.pow(y2-y1,2);
  Double distancia=Math.sqrt(equacaox + equacaoy);
  System.out.printf("%.4f%n",distancia);
}}