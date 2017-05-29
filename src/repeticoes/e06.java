package repeticoes;

import java.util.Scanner;

public class e06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int i;

        System.out.println("Numero: ");
        num = entrada.nextInt();

        System.out.println("Divisores do " + num + ": ");

        for (i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.print(i + ", ");
            }

        }
        System.out.println();
    }

}
