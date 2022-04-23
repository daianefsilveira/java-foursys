package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;

        System.out.println(">>> Tabuada <<<");

        System.out.print("Digite um número de 1 a 10 para saber a tabuada do mesmo: ");
        numero = ler.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(i + " X " + numero + " = " + (numero * i));
        }
    }
}
