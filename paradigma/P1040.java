package paradigma;

import java.util.Scanner;
 
 
public class P1040 {
 
    public static double calcularMedia(double n1, double n2, double n3, double n4) {
        return (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10.0;
    }
 
    public static double calcularMediaFinal(double media, double notaExame) {
        return (media + notaExame) / 2.0;
    }
 
    public static String verificarSituacao(double media) {
        if (media >= 7.0) {
            return "Aluno aprovado.";
        } else if (media >= 5.0) {
            return "Aluno em exame.";
        } else {
            return "Aluno reprovado.";
        }
    }
 
    public static String verificarSituacaoFinal(double mediaFinal) {
        if (mediaFinal >= 5.0) {
            return "Aluno aprovado.";
        } else {
            return "Aluno reprovado.";
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
 
        double media = calcularMedia(n1, n2, n3, n4);
        System.out.printf("Media: %.1f%n", media);
 
        String situacao = verificarSituacao(media);
        System.out.println(situacao);
 
        if (situacao.equals("Aluno em exame.")) {
            double notaExame = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
 
            double mediaFinal = calcularMediaFinal(media, notaExame);
            System.out.println(verificarSituacaoFinal(mediaFinal));
            System.out.printf("Media final: %.1f%n", mediaFinal);
        }
 
        sc.close();
    }
}