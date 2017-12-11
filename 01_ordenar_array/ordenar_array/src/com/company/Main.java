package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();


        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {

            array[i] = r.nextInt(10);

        }

        visualizar(array);
        System.out.println();
        visualizar(ordenar(array));
        


    }

    private static int[] ordenar(int[] array) {
        int[] arrayOrdenado = new int[10];

        for (int i = 0; i < 10; i++) {
            arrayOrdenado[i] = 12;
        }
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2[i] = array[i];
        }


        int a = 0;
        int b = 0;
        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10; i++) {
                if (array[i] != 11)
                    array[i] = array2[i];
            }

            for (int k = 0; k < 10; k++) {
                if (arrayOrdenado[j] == 12) {
                    arrayOrdenado[j] = array[j];
                    a = j;
                }
                if (array[j] == 11) b = 1;
                if (array[j] > array[k]) {
                    arrayOrdenado[j] = array[k];
                    array[j] = array[k];
                    a = k;
                }
            }

            array[a] = 11;
            if (b == 1) array[j] = 11;
            b = 0;
        }


        return arrayOrdenado;
    }

    private static void visualizar(int[] array) {

        for (int i = 0; i < 10; i++) {


            System.out.print(array[i] + " ");
        }
    }
}
