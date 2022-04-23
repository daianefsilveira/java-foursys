package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(">>> Compra de refrigerantes <<<");

        int lata_350ml, garrafa_600ml, garrafa_2l;
        double total;

        System.out.print("Informe a quantidade de latas de 350ml de refrigerante: ");
        lata_350ml = ler.nextInt();

        System.out.print("Informe a quantidade de garrafas de 500ml de refrigerante: ");
        garrafa_600ml = ler.nextInt();

        System.out.print("Informe a quantidade de latas de 350ml de refrigerante: ");
        garrafa_2l = ler.nextInt();

        total = (lata_350ml * 0.35) + (garrafa_600ml * 0.60) + (garrafa_2l * 2);

        System.out.printf("O comerciante comprou %.3f litros de refrigerantes", total);
    }
}
