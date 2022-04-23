package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println(">>> Vamos calcular o seu IMC <<<");

        System.out.print("Informe o seu peso: ");
        peso = ler.nextDouble();

        System.out.print("Informe a sua altura: ");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC= %.2f\n", imc);

        if (imc > 25) {
            System.out.println("Você está acima do peso!");
        } else {
            System.out.println("Você está saudável!");
        }
    }
}
