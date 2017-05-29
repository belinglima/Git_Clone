package Orientacaoobjeto;

import java.util.Scanner;

public class DadosCachorro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Cachorro auau = new Cachorro();
        int opcao = 0;
            
            System.out.println("=======================");
            System.out.println(" Dados do seu Cachorro");
            System.out.println("========================");
            System.out.print("Digite o nome do seu cachorro: ");
            auau.nome = auau.nome + entrada.nextLine();
            System.out.print("Digite a Raça: ");
            auau.raca = auau.raca + entrada.nextLine();
            System.out.print("Digite o Porte: ");
            auau.porte = auau.porte + entrada.nextLine();
            System.out.print("Digite o Pedigree: ");
            auau.pedigree = auau.pedigree + entrada.nextLine();
            System.out.println("====================================");
            System.out.println("Digite a data de Nascimento: DD/MM/YYYY: ");
            System.out.print("Dia: DD: ");
            auau.dia = auau.dia + entrada.nextInt();
            System.out.print("Mês: MM: ");
            auau.mes = auau.mes + entrada.nextInt();
            System.out.print("Ano: YYYY: ");
            auau.ano = auau.ano + entrada.nextInt();
            System.out.println("====================================");
            System.out.print("Digite a Energia: ");
            auau.energia = auau.energia + entrada.nextInt();
            System.out.print("Digite o peso: ");
            auau.peso = auau.peso + entrada.nextDouble();
           
            System.out.println("=======================================");
            System.out.println("Deseja imprimir os dados ?: ");
            System.out.println("Opçoes:  (1 = SIM) OU (2 = SAIR) ");
            System.out.print("Digite sua Opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("================================");
                    System.out.println("Nome: "+auau.nome);
                    System.out.println("Pedigree: "+auau.pedigree);
                    System.out.println("Data de Nascimento: "+auau.dia+"/"+auau.mes+"/"+auau.ano);
                    System.out.println("Peso: "+auau.peso+" Kg.");
                    System.out.println("Porte: "+auau.porte);
                    System.out.println("Raça: "+auau.raca);
                    System.out.println("Energia: "+auau.energia);
                    System.out.println("===============================");
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