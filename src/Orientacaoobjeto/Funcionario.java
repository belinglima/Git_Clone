package Orientacaoobjeto;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Funcionario {

    String nome;
    String cpf;
    LocalDate DataDeNascimento;
    double salario;
    LocalDate DataDeAdmisao;
    String cargo;
    int energia;
    int credibilidade;
    int tempo, horas;

    String trabalhar(int horas) {
        int energiaNecessaria = horas + 5;
        if (energia >= energiaNecessaria) {
//          salario = salario + (15.50 * horas);
            energia = energia - energiaNecessaria;
            credibilidade = (int) (credibilidade + horas);
            if (credibilidade > 100) {
                credibilidade = 100;
            }
            return "Trabalho realizado com sucesso!";
        } else {
            return "Energia Insuficiente";

        }
    }

    String tomarCafe(int cafe) {
        Random valor = new Random();
        int num = cafe * valor.nextInt(21);
        energia = energia + num;
        if (energia > 100) {
            energia = 100;
            return "Sua energia esta" + " Carregada";
        }
        return "erro! Tente denovo!";

    }

    String resenha(int resenha) {
        energia = energia - resenha;
        if (energia < 50) {
            return "Energia Acabando!";
        } else {
            return "Energia Insuficiente!";
        }
    }

    String dormir(int tempo) {
        if (tempo > 8 || tempo < 20) {
            energia = (energia + 40) - 10;
            credibilidade = credibilidade - (tempo - 8) * 5;
            return "Tua batata ta assando, Você esta vagabundiando muito: " + energia;
        }
        if (tempo == 8) {
            energia = energia + 40;
        }
        if (tempo < 8) {
            energia = (energia + 5) * tempo;
            credibilidade = (credibilidade + tempo) * 10;
            return "Você recebeu: " + energia;
        }

        return "erro! contate administrador";
    }

    String solicitarAumento(int almento) {
        Random valor = new Random();
        int num2 = valor.nextInt(141);
        if (num2 <= credibilidade) {
            int aumento = almento;
            salario = salario + (salario + (aumento / 100));
            return "Parabens Voce recebeu R$: " + aumento;

        }
        return "erro! contate administrador";
    }

    void cadastrarFuncionario() {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Nome: ");
        nome = teclado.nextLine();
        System.out.print("CPF: ");
        cpf = teclado.nextLine();
        //System.out.print("Data de admissão: ");
        DataDeAdmisao = LocalDate.now();
        System.out.print("Data de nascimento: ");
        String[] partes = teclado.nextLine().split("/");
        DataDeNascimento = LocalDate.of(Integer.parseInt(partes[2]),
                Integer.parseInt(partes[1]), Integer.parseInt(partes[0]));
        // Energia randomizada
        energia = r.nextInt(101);
        credibilidade = 0;
        System.out.print("Cargo: ");
        cargo = teclado.nextLine();
        System.out.print("Salário: ");
        salario = teclado.nextDouble();

    }

    void verificarStatus() {
        System.out.println("Nome.................:" + nome);
        System.out.println("Data de admissão.....:" + DataDeAdmisao);
        System.out.println("Data de nascimento...:" + DataDeNascimento);
        System.out.println("Cargo................:" + cargo);
        System.out.println("CPF..................:" + cpf);
        System.out.println("Energia..............:" + energia);
        System.out.println("Credibilidade........:" + credibilidade);
        System.out.println("Salário..............:" + salario);
    }

}
