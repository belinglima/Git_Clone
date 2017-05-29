package repeticoes;

import java.util.Scanner;

public class e03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pares = 0, impares = 0, n, cont = 1;

        System.out.println("Informe os números ou 0 para Sair");
        do {
            System.out.printf("%d° Numero: ", cont);
            n = entrada.nextInt();
            cont = cont + 1;
            
             if (n == 0) {
                 break;
             } 
             
            if (n % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }

        } while (true);
        System.out.println("------------------------");
        System.out.println("N° Pares: " + pares);
        System.out.println("N° Impares: " + impares);
    }
}
