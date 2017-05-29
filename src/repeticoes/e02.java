package repeticoes;

import java.util.Scanner;

public class e02 {
         public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String produto;
        double preco, total = 0,cont =0;

        System.out.println("Digite o nome  ou 'Fim' para Sair");
        do {
            System.out.print("Produto: ");
            produto = entrada.nextLine();

            if (produto.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Preço R$: ");
            preco = entrada.nextDouble();

            total = total + preco;
            cont = cont + 1;
          
            entrada.nextLine();
        } while (true);
        System.out.println("-------------------------");
        System.out.printf("Total R$: %2.2f\n",total);
        System.out.printf("Media R$: %2.2f\n",(total/cont));
    }
        
     
}
