package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] tablero = new String[8][8];
        String[][] piezas = new String[8][8];


        tablero[0][0] = "0";
        tablero[0][1] = "1";
        tablero[0][2] = "0";
        tablero[0][3] = "1";
        tablero[0][4] = "0";
        tablero[0][5] = "1";
        tablero[0][6] = "0";
        tablero[0][7] = "1";
        tablero[1][0] = "1";
        tablero[1][1] = "0";
        tablero[1][2] = "1";
        tablero[1][3] = "0";
        tablero[1][4] = "1";
        tablero[1][5] = "0";
        tablero[1][6] = "1";
        tablero[1][7] = "0";
        tablero[2][0] = "0";
        tablero[2][1] = "1";
        tablero[2][2] = "0";
        tablero[2][3] = "1";
        tablero[2][4] = "0";
        tablero[2][5] = "1";
        tablero[2][6] = "0";
        tablero[2][7] = "1";
        tablero[3][0] = "1";
        tablero[3][1] = "0";
        tablero[3][2] = "1";
        tablero[3][3] = "0";
        tablero[3][4] = "1";
        tablero[3][5] = "0";
        tablero[3][6] = "1";
        tablero[3][7] = "0";
        tablero[4][0] = "0";
        tablero[4][1] = "1";
        tablero[4][2] = "0";
        tablero[4][3] = "1";
        tablero[4][4] = "0";
        tablero[4][5] = "1";
        tablero[4][6] = "0";
        tablero[4][7] = "1";
        tablero[5][0] = "1";
        tablero[5][1] = "0";
        tablero[5][2] = "1";
        tablero[5][3] = "0";
        tablero[5][4] = "1";
        tablero[5][5] = "0";
        tablero[5][6] = "1";
        tablero[5][7] = "0";
        tablero[6][0] = "0";
        tablero[6][1] = "1";
        tablero[6][2] = "0";
        tablero[6][3] = "1";
        tablero[6][4] = "0";
        tablero[6][5] = "1";
        tablero[6][6] = "0";
        tablero[6][7] = "1";
        tablero[7][0] = "1";
        tablero[7][1] = "0";
        tablero[7][2] = "1";
        tablero[7][3] = "0";
        tablero[7][4] = "1";
        tablero[7][5] = "0";
        tablero[7][6] = "1";
        tablero[7][7] = "0";

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                piezas[i][j] = tablero[i][j];
            }
        }

        piezas[0][0] = "13";
        piezas[0][1] = "14";
        piezas[0][2] = "15";
        piezas[0][3] = "16";
        piezas[0][4] = "17";
        piezas[0][5] = "15";
        piezas[0][6] = "14";
        piezas[0][7] = "13";
        piezas[1][0] = "12";
        piezas[1][1] = "12";
        piezas[1][2] = "12";
        piezas[1][3] = "12";
        piezas[1][4] = "12";
        piezas[1][5] = "12";
        piezas[1][6] = "12";
        piezas[1][7] = "12";
        piezas[6][0] = "2";
        piezas[6][1] = "2";
        piezas[6][2] = "2";
        piezas[6][3] = "2";
        piezas[6][4] = "2";
        piezas[6][5] = "2";
        piezas[6][6] = "2";
        piezas[6][7] = "2";
        piezas[7][0] = "3";
        piezas[7][1] = "4";
        piezas[7][2] = "5";
        piezas[7][3] = "6";
        piezas[7][4] = "7";
        piezas[7][5] = "5";
        piezas[7][6] = "4";
        piezas[7][7] = "3";


            //visualizarTablero(tablero);
        System.out.println();
            visualizarTablero(piezas);

        System.out.print("Origen Fila: ");
        int OFila=Integer.parseInt(br.readLine());

        System.out.print("Origen Columna: ");
        char OColumna2=br.readLine().charAt(0);
int OColumna=Integer.valueOf(OColumna2)-97;

        System.out.print("Destino Fila: ");
        int DFila=Integer.parseInt(br.readLine());

        System.out.print("Destino Columna: ");
        char DColumna2=br.readLine().charAt(0);
        int DColumna=Integer.valueOf(OColumna2)-97;

/*
        switch (OColumna){
            case 'a': OColumna=0;
            break;
            case 'b': OColumna=1;
                break;
            case 'c': OColumna=2;
                break;
            case 'd': OColumna=3;
                break;
            case 'e': OColumna=4;
                break;
            case 'f': OColumna=5;
                break;
            case 'g': OColumna=6;
                break;
            case 'h': OColumna=7;
                break;
        }

        switch (DColumna){
            case 'a': DColumna=0;
                break;
            case 'b': DColumna=1;
                break;
            case 'c': DColumna=2;
                break;
            case 'd': DColumna=3;
                break;
            case 'e': DColumna=4;
                break;
            case 'f': DColumna=5;
                break;
            case 'g': DColumna=6;
                break;
            case 'h': DColumna=7;
                break;
        }
*/
        System.out.println(OFila+" "+OColumna);
        System.out.println(piezas[OFila][OColumna]);
        System.out.println("\u2659");
        //Peones blancos
        if(piezas[OFila][OColumna].equals("\u2659")){
            System.out.println("funciona 1");
if(piezas[DFila][DColumna]==piezas[OFila-1][OColumna]) {
    System.out.println("funciona 2");
    piezas[DFila][DColumna]="2";
    piezas[OFila][OColumna]=tablero[OFila][OColumna];
}
visualizarTablero(piezas);
            System.out.println("Funciona 3");









        }
    }

    private static void visualizarTablero(String[][] tablero) {
        String torre="\u2656";
        String cuadradoBlanco="\u2B1C";
        String cuadradoNegro="\u2B1B";
        String peonBlanco="\u2659";
        String peonNegro="\u265F";
        String torreBlanco="\u2656";
        String caballoBlanco="\u2658";
        String alfilBlanco="\u2657";
        String reinaBlanco="\u2655";
        String reyBlanco="\u2654";
        String torreNegro="\u265C";
        String caballoNegro="\u265E";
        String alfilNegro="\u265D";
        String reinaNegro="\u265B";
        String reyNegro="\u265A";


        boolean blanco=false;

        System.out.println("  a b c d e f g h");

        for (int i = 0; i < 8; i++) {
            System.out.print(i);
            blanco=!blanco;
            for (int j = 0; j < 8; j++) {

                blanco=!blanco;

                if(tablero[i][j].equals("0")) tablero[i][j]=cuadradoBlanco;
                if(tablero[i][j].equals("1")) tablero[i][j]=cuadradoNegro;
                if(tablero[i][j].equals("12")) tablero[i][j]=peonNegro;
                if(tablero[i][j].equals("2")) tablero[i][j]=peonBlanco;
                if(tablero[i][j].equals("3")) tablero[i][j]=torreBlanco;
                if(tablero[i][j].equals("4")) tablero[i][j]=caballoBlanco;
                if(tablero[i][j].equals("5")) tablero[i][j]=alfilBlanco;
                if(tablero[i][j].equals("6")) tablero[i][j]=reinaBlanco;
                if(tablero[i][j].equals("7")) tablero[i][j]=reyBlanco;
                if(tablero[i][j].equals("13")) tablero[i][j]=torreNegro;
                if(tablero[i][j].equals("14")) tablero[i][j]=caballoNegro;
                if(tablero[i][j].equals("15")) tablero[i][j]=alfilNegro;
                if(tablero[i][j].equals("16")) tablero[i][j]=reinaNegro;
                if(tablero[i][j].equals("17")) tablero[i][j]=reyNegro;





                //System.out.print((char)27+"\033[33m\033[33m");

                if(blanco==true) {System.out.print((char)27+"[34;40m");}
                if (blanco==false) {System.out.print((char)27+"[34;47m");}

                if(tablero[i][j]==cuadradoBlanco || tablero[i][j]==cuadradoNegro)
                System.out.print("  ");
                else System.out.print(" "+tablero[i][j]+"");

                System.out.print("\u001B[0m");


            }
            System.out.println();
        }

    }




    }
