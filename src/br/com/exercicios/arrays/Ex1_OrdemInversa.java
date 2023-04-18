package br.com.exercicios.arrays;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        // Crie um array de 6 números inteiros e mostre-os na ordem inversa.

        int[] vetorNumeros = {7, -3, 45, 10, 18, 2};

        int contador = 0;
        int tamanho = vetorNumeros.length;

        System.out.print("Vetor: ");
        while (contador < tamanho){
            System.out.print(vetorNumeros[contador] + " ");
            contador++;
        }

        System.out.print("\nVetor: ");

        for (int i = tamanho -1; i >= 0; i--){
            System.out.print(vetorNumeros[i] + " ");
        }

    }
}
