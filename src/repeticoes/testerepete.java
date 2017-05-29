package repeticoes;

import java.util.Scanner;

public class testerepete {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        String a = " ";
        
        System.out.print("Numero: ");
        num = entrada.nextInt();

        for (int i = 1; i <= num; i = i + 1) {
            a = a + "*";
            System.out.println(a);

        }

    }

}
