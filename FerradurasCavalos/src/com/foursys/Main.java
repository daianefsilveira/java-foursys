package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int cavalo;
        double valor_final;
        double valor_ferradura = 4 * 9.90;

        System.out.print("Quantos cavalos precisam de ferraduras? ");
        cavalo = ler.nextInt();

        valor_final = cavalo * valor_ferradura;

        System.out.printf("O total em ferraduras é R$ %.2f", valor_final);
    }
}
