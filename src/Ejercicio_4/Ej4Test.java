package Ejercicio_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej4Test {
    public static void main(String[] args) {

        // USER DECIDES MATRIX SIZE
        Scanner userInput = new Scanner(System.in);
        System.out.print("Introduce el tamaño de la columna del matriz: ");
        int col = userInput.nextInt();
        System.out.print("Introduce el tamaño de la fila del matriz: ");
        int fil = userInput.nextInt();

        int[][] matriz = new int[col][fil];
//        ArrayList<Integer> matriz = new ArrayList<>();

//        for (int i=0; i<matriz.size();i++) {

        for (fil = 0; fil < matriz.length; fil++) {
            for (col = 0; col < matriz[fil].length; col++) {
                int value = matriz[fil][col] = (int) (Math.random() * 10);
                System.out.println(" " + fil + ", " + col + ", " + value);
            }
        }


    }
}
