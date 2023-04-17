package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        /* Faça um programa que lê 5 números e informa o maior número e
          a média desses números.*/
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        double media;

        int contador = 0;
do {
        System.out.println("Número: ");
        numero = scan.nextInt();
        soma = soma + numero;
        media = soma/5;

        contador++;

        if (numero > maior) maior = numero;

} while (contador < 5);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média entre os números digitados é: " + media);
    }
}
