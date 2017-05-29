
import java.util.Scanner;

public class uri1150 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0, y = 0, Z = 0;
        int X = sc.nextInt();
        
        while (true) {
            Z = sc.nextInt();
            if (Z > X) {
                break;
            }
        }
        while (soma < Z) {
            soma = soma + X;
            y = y + 1;
            X = X + 1;
        }
        System.out.println(y);
    }
}
