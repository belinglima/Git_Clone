
import java.util.Arrays;
import java.util.Scanner;

public class Angelo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = entrada.nextInt();
        n[1] = entrada.nextInt();
        n[2] = entrada.nextInt();

        Arrays.sort(n);
        for (int i : n) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }

    }

}
