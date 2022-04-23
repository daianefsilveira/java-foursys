package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double moeda_1c, moeda_5c, moeda_10c, moeda_25c, moeda_50c, moeda_1r, valor_economizado;

        System.out.println(">>> Contador de moedas em R$ <<<");

        System.out.print("Informe a quantidade de moedas de 1 centavo: ");
        moeda_1c = ler.nextDouble();

        System.out.print("Informe a quantidade de moedas de 5 centavos: ");
        moeda_5c = ler.nextDouble();

        System.out.print("Informe a quantidade de moedas de 10 centavos: ");
        moeda_10c = ler.nextDouble();

        System.out.print("Informe a quantidade de moedas de 25 centavos: ");
        moeda_25c = ler.nextDouble();

        System.out.print("Informe a quantidade de moedas de 50 centavos: ");
        moeda_50c = ler.nextDouble();

        System.out.print("Informe a quantidade de moedas de 1 real: ");
        moeda_1r = ler.nextDouble();

        valor_economizado = (moeda_1c * 0.01) + (moeda_5c * 0.05) + (moeda_10c * 0.10) + (moeda_25c * 0.25) + (moeda_50c * 0.50) + (moeda_1r * 1);

        System.out.printf("Valor economizado R$: %.2f", valor_economizado);
    }
}
