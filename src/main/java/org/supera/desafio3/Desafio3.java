package org.supera.desafio3;


import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        int k = 0;
        int n = 0;

        Scanner scanner = new Scanner(System.in);

        n = scanner.nextInt();
        k = scanner.nextInt();
        Integer[] numeros = new Integer[n];
        for(int i = 0; i < n; i++){
            numeros[i] = i + 1;
        }


        int count = 0;

        for (int i = 0; i < numeros.length; i++){
            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] - numeros[j] == k){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}