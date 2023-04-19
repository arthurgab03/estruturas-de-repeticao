package br.com.exercicios.arrays;

import java.util.Random;

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {

        // Faça um programa que lê 20 números de 1 até 100 em um array e mostre os números e seus sucessores.

        Random random = new Random();

        int[] numerosAleatorios= new int[20];

        for (int i=0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;

        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.println("\n Sucessores dos números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print( (numero + 1) + " ");
        }


    }
}
