package br.com.exercicios.loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicador = 1;
        System.out.print(fatorial + "! = ");

        for (int contador = fatorial; contador >= 1; contador--){
            multiplicador = multiplicador * contador;
            System.out.println(contador);


        }

        System.out.print("total = " + multiplicador);
    }
}
