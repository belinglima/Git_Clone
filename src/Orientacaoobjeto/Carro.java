package Orientacaoobjeto;

import java.util.Random;
import java.util.Scanner;

public class Carro {

    String modelo;
    String marca;
    String potencia;
    String estado;
    int ano;
    int numMarchas;
    int marchaAtual;
    int tamTanque;
    int nivelCombustivel;
    int velocidade;

    void ligar() {
        marchaAtual = 1;
        estado = "Ligado";
        
        System.out.println("carro Ligado!");
    }

    void acelerar() {
        if (estado.equalsIgnoreCase("Desligado")) {
            System.out.println("Seu Carro Esta Desligado.");
        } else {
            if (nivelCombustivel == 2) {
                System.out.println("Você Não Tem Combustivel Suficiente Para Ficar Acelerando Muito.");
                System.out.println("Abasteça: no Proximo Posto!");
                System.err.println("Nivel Combustivel: " + nivelCombustivel);
            } else if (estado.equalsIgnoreCase("Ligado")) {
                nivelCombustivel = nivelCombustivel - 1;
                velocidade = velocidade + 4;
                System.out.println("Velocidade Atual: " + velocidade);
            }
        }
    }

    void Parar() {
        if (nivelCombustivel == 2) {
            System.out.println("Você Não Tem Combustivel Suficiente Para Ficar Parado.");
            System.out.println("Abasteça: no Proximo Posto!");
            System.err.println("Nivel Combustivel: " + nivelCombustivel);

        } else if (estado.equalsIgnoreCase("Ligado")) {
            nivelCombustivel = nivelCombustivel - 1;
            velocidade = 0;
            System.out.println("O Carro Parou! - Curta a Paizagem.");
        } else {
            System.out.println("O Carro Precisa estar Ligado! Para Executar Esta Acao.");
        }
    }

    void aumentarMarcha() {
        if (marchaAtual == 5) {
            System.out.println("Você ja Esta Na ultima marcha!");
        } else {
            marchaAtual = marchaAtual + 1;
            nivelCombustivel = nivelCombustivel - 1;
            System.out.println("Nova Marcha: " + marchaAtual);
        }
    }

    void diminuirMarcha() {
        if (marchaAtual == 1) {
            System.out.println("Você Não Pode Diminuir Mais a Marcha!");
        } else {
            marchaAtual = marchaAtual - 1;
            nivelCombustivel = nivelCombustivel - 1;
            System.out.println("Nova Marcha: " + marchaAtual);
        }
    }

    void Buzinar() {
        System.out.println("BeeBee.. BeeBee.. ");
    }

    void verificarDados() {

        System.out.println("Modelo.................: " + modelo);
        System.out.println("Marca..................: " + marca);
        System.out.println("Ano....................: " + ano);
        System.out.println("Potencia...............: " + potencia + " CV");
        System.out.println("Estado.................: " + estado);
        System.out.println("Numero de Marchas......: " + numMarchas);
        System.out.println("Marcha Atual...........: " + marchaAtual);
        System.out.println("Tamanho do Tanque......: " + tamTanque + " Litro(s).");
        System.out.println("Nivel de Combustivel...: " + nivelCombustivel + " Litro(s).");
        System.out.println("Velocidade Atual.......: " + velocidade + " Km/h");

    }

    void cadastrarCarro() {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Modelo: ");
        modelo = teclado.nextLine();
        System.out.print("Marca: ");
        marca = teclado.nextLine();
        System.out.print("Potencia: ");
        potencia = teclado.nextLine();
        System.out.print("Estado: ");
        estado = teclado.nextLine();
        System.out.print("Ano: ");
        ano = teclado.nextInt();
        numMarchas = 5;
        marchaAtual = 1 + r.nextInt(5);
        tamTanque = 50;
        nivelCombustivel = 2 + r.nextInt(49);

    }

    void Abastecer() {
        if (nivelCombustivel == 50) {
            System.out.println("Você Ja esta com o Tanque Cheio!");
            System.out.println("Não é Nescessario Abastecer.");
            System.out.println("Ja Sei Veio Ver o Frentista.- Bixona Véia hahahaha");
        } else if (nivelCombustivel <= 2) {
            nivelCombustivel = nivelCombustivel + 20;
            System.out.println("Bem Vindo Ao Abastecimento. ");
            System.out.println("Você Abasteceu 20 litros. ");
        } else {
            nivelCombustivel = nivelCombustivel + 1;
            System.out.println("Bem Vindo Ao Abastecimento. ");
            System.out.println("Você Abasteceu 1 litro. ");
            System.out.println("Você é um Motorista consiente! Abastecendo mesmo sem Precisar!");
        } 
    }
}
