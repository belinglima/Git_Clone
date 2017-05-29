package repeticoes;

import java.util.Scanner;

public class e07 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        int i;
        int conta = 0;

        System.out.println("Numero: ");
        num = entrada.nextInt();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                conta = conta + 1;
            }
        }
        if (conta == 2) {
            System.out.println(num + " É primo");
        } else {
            System.out.println(num + " Não é primo");
        }
    }

}
