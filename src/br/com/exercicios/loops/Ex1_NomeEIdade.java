package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex1_NomeEIdade {
    public static void main(String[] args) {
        /* Faça um programa que recebe valores de nome e idade, este programa precisa ter como critério de
         parada a inserção de "0" ao digitar um nome. */

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }

        System.out.println("Sistema interrompido.");
    }
}
