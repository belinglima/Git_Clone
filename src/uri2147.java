
import java.util.Scanner;

public class uri2147 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double result;
        String nome;
        int num = entrada.nextInt();
        for (int i = 0; i < num; i++) {
            nome = entrada.next();
            result = nome.length();
            System.out.printf("%.2f\n", (result / 100));
        }

    }

}
