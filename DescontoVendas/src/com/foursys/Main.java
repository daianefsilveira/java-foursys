package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int itens;
        double valor_final, valor = 1.99, desconto = 0.05;

        System.out.println(">>> Total de vendas com desconto <<<");

        System.out.print("Informe a quantidade de itens vendidos: ");
        itens = ler.nextInt();

        valor_final = (itens * valor) - (itens * valor * desconto);

        System.out.println("O total com 5% de desconto é R$: " + valor_final);
    }
}
