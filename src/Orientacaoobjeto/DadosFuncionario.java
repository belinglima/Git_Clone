package Orientacaoobjeto;

import java.util.Scanner;

public class DadosFuncionario {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Scanner teclado = new Scanner(System.in);
        funcionario.cadastrarFuncionario();
        int n;
        while (true) {
            System.out.println("===== Funcionário " + funcionario.nome + " =====");
            System.out.println("1. Tomar Café");
            System.out.println("2. Trabalhar");
            System.out.println("3. Pedir aumento");
            System.out.println("4. Dormir");
            System.out.println("5. Resenha");
            System.out.println("6. Verificar Status");
            int escolha = teclado.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("Digite quantidade de cafe: ");
                    n = teclado.nextInt();
                    System.out.println(funcionario.tomarCafe(n));
                    break;
                case 2:
                    System.out.println("Digite o numero de horas Trabalhadas: ");
                    n = teclado.nextInt();
                    System.out.println(funcionario.dormir(n));
                    break;
                case 3:
                    System.out.println("Digite o aumento: ");
                    n = teclado.nextInt();
                    System.out.println(funcionario.solicitarAumento(n));
                    break;
                case 4:
                    System.out.println("Digite tempo de sono: ");
                    n = teclado.nextInt();
                    System.out.println(funcionario.dormir(n));
                    break;
                case 5:
                    System.out.println("Digite quanto tempo de resenha:");
                    n = teclado.nextInt();
                    System.out.println(funcionario.resenha(n));
                    
                    break;
                case 6:
                    funcionario.verificarStatus();
                    break;
                default:
                    System.out.println("Ação inválida!");
            }

        }
    }
}
