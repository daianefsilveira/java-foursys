package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int valorA, valorB, soma;
        char resposta = 's';

        Scanner ler = new Scanner(System.in);

        System.out.println(">>> Soma de valores <<<");

        while (resposta == 's' || resposta == 'S') {

            System.out.print("Digite o valor de A: ");
            valorA = ler.nextInt();

            System.out.print("Digite o valor de B: ");
            valorB = ler.nextInt();

            soma = valorA + valorB;

            System.out.println("A soma dos valores é: " + soma);
            System.out.print("\nDeseja calcular novamente? [S / N]: ");
            resposta = ler.next().charAt(0);
        }
    }
}
