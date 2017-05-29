package Orientacaoobjeto;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DadosCliente cliente = new DadosCliente();
        int opcao = 0;
            System.out.println(": Dados do Cliente :");
            System.out.println("========================");
            System.out.print("Nome: ");
            cliente.nome = cliente.nome + entrada.nextLine();
            System.out.print("Cpf: ");
            cliente.cpf = cliente.cpf + entrada.nextLong();
            System.out.print("Data de Nascimento: ");
            cliente.nascimento = cliente.nascimento + entrada.nextInt();
            System.out.print("Quantidade de Dinheiro: ");
            cliente.dinheiro = cliente.dinheiro + entrada.nextDouble();
            System.out.println("=========================");
            System.out.println("Opçoes:  (1 = SIM) OU (2 = SAIR) ");
            System.out.print("Digite sua Opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(".....................................");
                    System.out.println(" : Cliente Cadastrado : ");
                    System.out.println("Nome: " + cliente.nome);
                    System.out.printf("Cpf: %d\n", cliente.cpf);
                    System.out.println("Nascimemnto: " + cliente.nascimento);
                    System.out.printf("Dinheiro: %.2f\n", cliente.dinheiro);
                    System.out.println(".....................................");
                    break;
                case 2:
                    System.out.println("Até Logo!");
                    break;
                default:
                    System.out.println("Opçao Invalida!");
                    break;
            }
            entrada.nextLine();

    }
}
