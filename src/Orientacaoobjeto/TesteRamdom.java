package Orientacaoobjeto;

import java.util.Random;

public class TesteRamdom {

    public static void main(String[] args) {
        Random valor = new Random();
        int num = valor.nextInt(10);
        System.out.println(num);

        int num2 = 10 + valor.nextInt(90);
        System.out.println(num2);

//        Funcionario novo = new Funcionario();
//        novo.solicitarAumento();

    }

}
