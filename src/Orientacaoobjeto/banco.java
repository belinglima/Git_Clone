package Orientacaoobjeto;

import java.util.Scanner;

public class banco {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        int escolha = 0;

        do {
            System.out.println("######## Banco da Praça 23 #######");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Verificar Saldo");
            System.out.println("4. Verificar total disponível para saque");
            System.out.println("9. Sair");
            
            System.out.println("Digite a Opção desejada:");
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor do saque: ");
                    double valor = entrada.nextDouble();
                    if (valor <= 0) {
                        System.out.println("O valor de saque deve ser positivo");
                    } else if (valor > (conta.saldo + conta.limite)) {
                        System.out.println("Saldo insuficiente!");
                    } else if (valor > 1500) {
                        System.out.println("Valor limite excedido!");
                    } else {
                        conta.saldo = conta.saldo - valor;
                    }
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    conta.saldo = conta.saldo + entrada.nextDouble();
                    break;
                case 3:
                    if (conta.saldo < 0) {
                        System.err.println("Saldo: " + conta.saldo);
                    } else {
                        System.out.println("Saldo: " + conta.saldo);
                    }
                    break;
                case 4:
                    System.out.println("Disponível: " + (conta.saldo + conta.limite));
                    break;
                case 9:
                    System.out.println("Você Saiu com sucesso! - Volte Sempre.");
                    break;
                default:
                    System.err.println("Opção inválida!");
            }

        } while (escolha != 9);

    }

}
