package Orientacaoobjeto;

import java.util.Scanner;

public class PrincipalCarro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Carro carro = new Carro();
        int opcao = 0;
        carro.cadastrarCarro();

        while (true) {
            System.out.println("Carro: " + carro.modelo + " Marca: " + carro.marca);
            System.out.println("1. Ligar. ");
            System.out.println("2. Acelerar. ");
            System.out.println("3. Parar. ");
            System.out.println("4. Aumentar Marcha. ");
            System.out.println("5. Diminuir Marcha. ");
            System.out.println("6. Buzinar. ");
            System.out.println("7. Verificar Dados. ");
            System.out.println("8. Abastecer. ");
            System.out.println("Digite Sua Opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    carro.ligar();
                    break;
                case 2:
                    carro.acelerar();
                    break;
                case 3:
                    carro.Parar();
                    break;
                case 4:
                    carro.aumentarMarcha();
                    break;
                case 5:
                    carro.diminuirMarcha();
                    break;
                case 6:
                    carro.Buzinar();
                    break;
                case 7:
                    carro.verificarDados();
                    break;
                case 8:
                    carro.Abastecer();
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }

        }

    }
}
