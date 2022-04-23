package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double peso, altura, imc;

        System.out.println(">>> Cálculo do IMC <<<");

        System.out.print("Informe o seu peso (kg): ");
        peso = ler.nextDouble();

        System.out.print("Informe a sua altura (ex: 1,65): ");
        altura = ler.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC = %.2f ", imc);
        if ((imc > 18.5) && (imc < 25)) {
            System.out.print("Parabéns! Você está dentro do padrão considerado normal");
        } else {
            System.out.print("Atenção! Você está fora do padrão considerado normal");
        }
    }
}
