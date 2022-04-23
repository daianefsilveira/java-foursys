package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        float base, altura, area;

        System.out.println(">>> Descubra a área do retângulo <<<");

        System.out.print("Insira o valor da base do retângulo: ");
        base = ler.nextFloat();

        System.out.print("Insira o valor da altura do retângulo: ");
        altura = ler.nextFloat();

        area = base * altura;

        System.out.println("A área do retângulo é: " + area);
    }
}
