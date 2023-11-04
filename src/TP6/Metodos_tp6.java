package TP6;

import java.util.Random;
import java.util.Scanner;
public class Metodos_tp6 {
    public static int[] llenar_array_aleat(int desde, int hasta, int size) {
        Random random = new Random();
        int[] num = new int[size];

        for (int i = 0; i < size; i++) {
            num[i] = random.nextInt((hasta - desde) + 1) + desde;
        }
        return (num);
    }

    public static int leerEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número para longitud: ");
        return scanner.nextInt();
    }

    public static int[][] crearMatriz(int filas, int columnas) {
        return new int[filas][columnas];
    }

    public static void llenarMatriz(int[][] matriz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static int[][] obtenerMatrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizTranspuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }

        return matrizTranspuesta;
    }

    public static void mostrar_matriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


