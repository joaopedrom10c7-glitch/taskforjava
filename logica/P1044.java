import java.util.Scanner;

public class P1044 {
    public static void main(String[] args) {                               Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int maior = Math.max(A, B);
        int menor = Math.min(A,B);
        if(maior%menor ==0 ){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
        sc.close();
    }
}
