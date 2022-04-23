package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int cavalo;
        double valor_final;
        double valor_ferradura = 4 * 9.90;
        double desconto;

        System.out.println(">>> Compra com ou sem desconto <<<");

        System.out.print("Quantos cavalos precisam de ferraduras? ");
        cavalo = ler.nextInt();

        valor_final = cavalo * valor_ferradura;

        if(valor_final > 100) {
            desconto = (valor_final / 100) * 10;
            System.out.print("Valor com desconto de 10% é R$ " + (valor_final - desconto));
        } else {
            System.out.print("Valor sem desconto é R$ " + valor_final);
        }
    }
}