package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valorA, valorB, valorC, soma;

        System.out.println(">>> Descubra se A + B é maior do que C <<<");

        System.out.print("Entre com o valor de A: ");
        valorA = ler.nextInt();

        System.out.print("Entre com o valor de B: ");
        valorB = ler.nextInt();

        System.out.print("Entre com o valor de C: ");
        valorC = ler.nextInt();

        soma = valorA + valorB;

        if (soma > valorC){
            System.out.printf("A + B = %d é maior que C: %d", soma, valorC);
        } else {
            System.out.printf("A + B = %d não é maior que C: %d", soma, valorC);
        }
    }
}
