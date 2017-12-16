package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int[][] tablero = new int[6][7];
        int turno=1;
        boolean hayGanador=false;
        int jugadas=0;

        visualizarTablero(tablero);

        do {
            if (turno==1) System.out.println("JUGADOR 1");
            else System.out.println("JUGADOR 2");
            System.out.println("---------");
            System.out.print("Columna: ");
            int columna = Integer.parseInt(br.readLine()) - 1;
            int i = 5;
            do {
                if (tablero[i][columna] == 1 || tablero[i][columna] == 2) i--;
            } while (i>=0 && tablero[i][columna] != 0);
            if(i<0) System.out.println("Columna llena!! Intentelo otra vez!");
            if (turno == 1 && i>=0) tablero[i][columna] = 1;
            else if (turno==2 && i>=0) tablero[i][columna] = 2;
            visualizarTablero(tablero);
            if (turno == 1 && i>=0) turno = 2;
            else if(turno == 2 && i>=0) turno = 1;
            hayGanador=hayGanador(tablero);
            if (i>=0) jugadas++;
        }while (hayGanador==false && jugadas<42);

        if (jugadas>41) System.out.println("EMPATE!!!!");
        else if(turno==2) System.out.println("JUGADOR 1 HAS GANADO!!!!!");
        else if(turno==1) System.out.println("JUGADOR 22 HAS GANADO!!!!!");

    }

    private static boolean hayGanador(int[][] tablero) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (tablero[i][j]==1 && tablero[i][j+1]==1 && tablero[i][j+2]==1 && tablero[i][j+3]==1) return true;
                if (tablero[i][j]==2 && tablero[i][j+1]==2 && tablero[i][j+2]==2 && tablero[i][j+3]==2) return true;
            }
        }
        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < 3; i++) {
                if (tablero[i][j]==1 && tablero[i+1][j]==1 && tablero[i+2][j]==1 && tablero[i+3][j]==1) return true;
                if (tablero[i][j]==2 && tablero[i+1][j]==2 && tablero[i+2][j]==2 && tablero[i+3][j]==2) return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (tablero[i][j]==1 && tablero[i+1][j-1]==1 && tablero[i+2][j-2]==1 && tablero[i+3][j-3]==1) return true;
                if (tablero[i][j]==2 && tablero[i+1][j-1]==2 && tablero[i+2][j-2]==2 && tablero[i+3][j-3]==2) return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >=0; j--) {
                if (tablero[i][j]==1 && tablero[i+1][j+1]==1 && tablero[i+2][j+2]==1 && tablero[i+3][j+3]==1) return true;
                if (tablero[i][j]==2 && tablero[i+1][j+1]==2 && tablero[i+2][j+2]==2 && tablero[i+3][j+3]==2) return true;
            }
        }

        return false;
    }

    private static void visualizarTablero(int[][] tablero) {

        System.out.print("1     2     3     4     5     6     7");
        System.out.println();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <7 ; j++) {
                if(tablero[i][j]==0) {
                    System.out.print((char)27+"[34;44m");
                    System.out.print("   ");
                System.out.print("\u001B[0m");}

                if(tablero[i][j]==1) {
                    System.out.print((char)27+"[34;43m");
                    System.out.print("   ");
                    System.out.print("\u001B[0m");}
                if(tablero[i][j]==2) {
                    System.out.print((char)27+"[34;41m");
                    System.out.print("   ");
                    System.out.print("\u001B[0m");}
                System.out.print((char)27+"[34;44m");
                System.out.print(" ");
                System.out.print("\u001B[0m");
                System.out.print("|");
                System.out.print((char)27+"[34;44m");
                System.out.print(" ");
                System.out.print("\u001B[0m");
            }
            System.out.println();
            for (int j = 0; j < 7; j++) {
                System.out.print("------");
            }
            System.out.println();
        }



    }
}
