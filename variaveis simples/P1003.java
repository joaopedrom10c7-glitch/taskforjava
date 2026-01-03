import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double raio = scanner.nextDouble();
    double pi = 3.14159;
    double area = pi*raio*raio;
    System.out.printf("A=%.4f%n", area);
    }
    
}
