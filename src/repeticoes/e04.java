package repeticoes;

import java.util.Scanner;

public class e04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String jogador;
        int idade = 0, cont = 0, media = 0;

        System.out.println("Informe os Jogadores ou 'Fim' para Sair");
        do {
            System.out.print("Jogador: ");
            jogador = entrada.nextLine();

            if (jogador.equalsIgnoreCase("fim")) {
                break;
            }
            System.out.print("Idade: ");
            idade = entrada.nextInt();

            cont = cont + 1;
            media = media + idade;

            entrada.nextLine();
        } while (true);
        System.out.println("---------------------------------");
        System.out.println("Média das Idades: " + (media / cont));

    }

}
