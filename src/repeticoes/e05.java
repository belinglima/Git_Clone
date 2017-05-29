package repeticoes;
import java.util.Scanner;

public class e05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, cont = 0, pares = 3, soma = 0;
        System.out.print("Numero: ");
        num = entrada.nextInt();

        System.out.print("Pares entre 1 e " + num + ": ");
        if (num >=2 )
            System.out.print(2);
        do {
            pares++;
            if (pares % 2 == 0) {                
                System.out.printf(", %d", pares);
                soma = soma + pares;
                cont++;
            }
        } while (pares < num);
        System.out.printf("\nNº de Pares: %d", cont);
        System.out.printf("\nSoma dos Pares: %d\n", soma);
    }
}
