package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex2_Nota {

   public static void main(String[] args){
       /* Faça um programa que pede uma nota entre zero e dez, mostre uma mensagem de
         erro caso a nota seja inválida e continue pedindo até que uma nota válida seja inserida. */

       Scanner scan = new Scanner(System.in);
       int nota;

       System.out.println("Nota: ");
       nota = scan.nextInt();

       while (nota < 0 || nota > 10) {
           System.out.println("Nota inválida! Digite novamente:");
           nota = scan.nextInt();
           if (nota >= 0 || nota <= 10 ){
               System.out.println("Você digitou a nota " + nota + ", sua nota é válida!");
           }
       }


   }
}
