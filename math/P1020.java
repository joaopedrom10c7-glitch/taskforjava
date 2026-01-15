import java.util.Scanner;

public class P1020 {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
    
        int idadedias = sc.nextInt();
        int ano = 365;
        int mes = 30;
     int anos= (idadedias/ano);
    System.out.println(anos + "ano(s)" );
    int sobra= (idadedias%ano);
     
     int meses= (sobra/mes);
        System.out.println(meses + "mes(es)");
     
     int dia= (sobra%mes);
     System.out.println(dia + "dia(s)");






     sc.close();
     
     
    }
}
