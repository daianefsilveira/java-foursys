package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float valorA, valorB, valorC, media;
        char resposta = 's';

        System.out.println(">>> Descubra a média de 3 valores <<<");

        do {
            System.out.print("Digite o valor de A: ");
            valorA = ler.nextFloat();

            System.out.print("Digite o valor de B: ");
            valorB = ler.nextFloat();

            System.out.print("Digite o valor de C: ");
            valorC = ler.nextFloat();

            media = (valorA + valorB + valorC) / 3;

            System.out.println("A média dos valores é: " + media);
            System.out.print("\nDeseja continuar? [S / N]: ");
            resposta = ler.next().charAt(0);

        } while(resposta == 'S' || resposta == 's');
    }
}
