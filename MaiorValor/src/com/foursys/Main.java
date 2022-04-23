package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int valorA, valorB;

        System.out.println(">>> Descubra o maior valor <<<");

        System.out.print("Entre com o valor de A: ");
        valorA = ler.nextInt();

        System.out.print("Entre com o valor de B: ");
        valorB = ler.nextInt();

        if (valorA > valorB){
            System.out.println("O valor A é maior: " + valorA);
        } else {
            System.out.println("O valor B é maior: " + valorB);
        }
    }
}
