package repeticoes;

import java.util.Scanner;

public class repeticaowhile {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade;
        int numMaiores = 0;
        int numMenores = 0;

        System.out.println("Digite o nome  ou 'Fim' para Sair");
        do {
            System.out.print("Nome: ");
            nome = entrada.nextLine();

            if (nome.equalsIgnoreCase("Fim")) {
                break;       // sai da repeticao
            }
            System.out.print("Idade: ");
            idade = entrada.nextInt();

            if (idade >= 18) {
                System.out.println(nome + " voce é maior de idade");
                numMaiores = numMaiores + 1;
            } else {
                numMenores = numMenores + 1;
                System.out.println(nome + " voce é menor de idade");
            }
            // evita erro de leitura na entrada
            entrada.nextLine();
        } while (true);
        System.out.print("");
        System.out.println("N° Maiores: " + numMaiores);
        System.out.println("N° Menores: " + numMenores);
    }

}
