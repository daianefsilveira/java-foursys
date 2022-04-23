package com.foursys;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        boolean infoValida = false;
        String nome, email, rg, cpf;

        System.out.println(">>> Validação de dados <<<");

        do {
            System.out.print("Informe o seu nome (completo): ");
            nome = ler.nextLine();

            if (nome.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("Nome inválido! Informe o seu nome completo");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Seu e-mail: ");
            email = ler.nextLine();
            ler.nextLine();
            if (email.length() > 3) {
                infoValida = true;
            } else {
                System.out.println("E-mail inválido! ex: email@teste.com");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Informe o seu RG (somente números): ");
            rg = ler.nextLine();

            if (rg.length() == 10) {
                infoValida = true;
            } else {
                System.out.println("RG inválido! Informe o RG com 10 dígitos");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.print("Informe o seu CPF (somente números): ");
            cpf = ler.nextLine();

            if (cpf.length() == 11) {
                infoValida = true;
            } else {
                System.out.println("CPF inválido! Informe o CPF com 11 dígitos");
            }
        } while (!infoValida);

        System.out.println("\n>>> Dados preenchidos! <<<");
        System.out.println("Nome: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}
