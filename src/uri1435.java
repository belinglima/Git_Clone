
import java.util.Scanner;

/**
 *
 * @author Family Lima
 */
public class uri1435 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int ordem, i, j, calc;
        while (true) {
            ordem = read.nextInt();
            if (ordem == 0) {
                break;
            }

            for (i = 0; i < ordem; i++) {
                for (j = 0; j < ordem; j++) {
                    calc = (i - j);
                    if (calc < 0) {
                        calc =  - calc;
                    }
                    calc += 1;
                    if (j > 1) {
                        System.out.printf(" %3d", calc);
                    } else {
                        System.out.printf("%3d", calc);
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
