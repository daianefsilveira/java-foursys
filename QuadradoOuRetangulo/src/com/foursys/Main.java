package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println(">>> Descubra se quadrado ou retângulo <<<");

        float base, altura, area;

        System.out.print("Insira o valor da base: ");
        base = ler.nextFloat();

        System.out.print("Insira o valor da altura: ");
        altura = ler.nextFloat();

        area = base * altura;

        System.out.print("A área é: " + area);
        if (base == altura) {
            System.out.println(", e é um quadrado");
        } else {
            System.out.println(", e não é um quadrado");
        }
    }
}
