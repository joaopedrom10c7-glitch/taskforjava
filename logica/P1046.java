import java.util.Scanner;

public class P1046 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int  h1 = sc.nextInt();
    int fim = sc.nextInt();
    int diferenca;
    if(fim>h1){
        diferenca = fim - h1;
    }else {
     diferenca =((24 - h1) + fim);}

  

    System.out.println("O JOGO DUROU " + diferenca +" HORA(S)");
    sc.close();

        }
}
