
import java.io.IOException;
import java.util.Scanner;

public class uri11500 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int A = entrada.nextInt();
        int N;
        long soma = 0;
        int count = 0;
        while (true) {
            N = entrada.nextInt();
            if (N > A) {
                break;
            }
        }
        for (int i = A; true; i++) {
            soma += i;
            count += 1;
            if (soma > N) {
                break;
            }
        }
        System.out.println(count);
    }
}
