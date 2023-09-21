package br.senai.sp.roletaRussa;

import java.util.Random;
import java.util.Scanner;

/**
 * Roleta Russa
 * Data: 17/08/2023
 * Autor: Rafael Sena Andrade de Sousa
 */

public class RoletaRussa {
    public static void main(String[] args) {
        /** Declarar as Variaveis */
        int userNumber, numberRandom;
        String nome;
        boolean continuar = true;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instancia Random */
        Random random = new Random();

        while (continuar){

        }

        /** Coleta de Dados */
        System.out.println("Bem vindo");
        System.out.println("Qual é o seu nome");
        nome = teclado.next();
        System.out.println("Olá, " + nome + " Digite seu numero da sorte [1-10]:");
        userNumber = teclado.nextInt();

        /** Lógica do Jogo */

        numberRandom = random.nextInt(10)+1;

        if (userNumber==numberRandom){
            continuar = false;
            System.out.println(" Voce Perdeu !!!");

            System.out.println("Parabens !!! Voce Ganhou !!");

        }


    }
}
