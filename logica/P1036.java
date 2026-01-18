import java.util.Scanner;
import java.util.Locale;
public class P1036 {
    public static void main(String[] args) {
         Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
      double delta = Math.pow(b,2) ;
      double deltax= (delta - 4 *a*c); 
              if (a == 0 || deltax < 0 ){
            
            System.out.println("Impossivel calcular");
          
        }else{
    double baskhara=Math.sqrt(deltax);
      double xbaskhara=((-b + baskhara)/ (2*a));
        System.out.printf("R1" + " = %.5f%n",xbaskhara);    
        double ybaskhara=((-b - baskhara)/(2*a));
        System.out.printf("R2" + " = %.5f%n",ybaskhara); 
                    }

        sc.close();

    }
}
