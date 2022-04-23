package com.foursys;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        char sexo;
        double altura, pesoIdeal;

        System.out.println(">>> Descubra o seu pedo ideal <<<");

        System.out.print("Informe o seu sexo [M / F]: ");
        sexo = (char)System.in.read();

        System.out.print("Informe a sua altura (ex: 1,65): ");
        altura = ler.nextDouble();

        if ((sexo == 'M') || (sexo == 'm')) {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44.7;
        }
        System.out.printf("Peso Ideal = %.2f kgs", pesoIdeal);
    }
}
