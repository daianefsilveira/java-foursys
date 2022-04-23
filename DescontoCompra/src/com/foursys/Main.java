package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valor, desconto;
        int pagamento;

        System.out.println(">>> Desconto a vista ou outros <<<");

        System.out.print("Qual o valor da compra? ");
        valor = ler.nextDouble();

        System.out.print("Escolha a forma de pagamento: 1 = a vista, 2 = outros ");
        pagamento = ler.nextInt();

        if(pagamento == 1) {
            desconto = (valor / 100) * 10;
            System.out.println("O seu desconto foi de 10%, valor a pagar: R$ " +  (valor - desconto));
        } else {
            desconto = (valor / 100) * 5;
            System.out.println("O seu desconto foi de 5%, valor a pagar: R$ " + (valor - desconto));
        }
    }
}
