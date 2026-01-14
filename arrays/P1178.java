package arrays;
import java.util.Locale;
import java.util.Scanner;

public class P1178 {
    public static void main(String[] args) {
        Locale.setDefault (Locale.US) ;
        Scanner sc = new Scanner(System.in) ;
        
  
    double x = sc.nextDouble();
    double [] N = new double[100];

     for( int i = 0; i < N.length; i++){
        N[i] = x;
        x /=2;
        System.out.printf("N[%d] = %.4f%n", i , N[i]);
        
     }
    
sc.close();

    }
}
