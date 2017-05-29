
import java.util.Scanner;

public class uri1187 {

    public static void leMatriz(double[][] m, Scanner scan) {
        int i, j;
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                m[i][j] = scan.nextDouble();
            }
        }
    }

    public static double soma(double[][] m) {
        int i, j;
        double soma = 0;
        for (i = 0; i < (12 / 2) - 1; i++) {
            for (j = 1 + i; j < 12 - i - 1; j++) {
                soma += m[i][j];
            }
        }
        return soma;
    }

    public static void somaOuMedia(double soma, char escolha) {
        if (escolha == 'M' || escolha == 'm') {
            double media = soma / 30;
            System.out.printf("%.1f\n", media);
        } else {
            System.out.printf("%.1f\n", soma);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char escolha = scan.next().charAt(0);
        double[][] m = new double[12][12];
        leMatriz(m, scan);
        double soma = soma(m);
        somaOuMedia(soma, escolha);
    }
}
