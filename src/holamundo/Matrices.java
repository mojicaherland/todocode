package holamundo;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Matrices n = new Matrices();
//        int matriz[][] = new int[3][3];
//
//        Scanner datoUser = new Scanner(System.in);
//        //guardando los datos del user
//        for (int fila = 0; fila < 2; fila++) {
//            for (int columna = 0; columna < 2; columna++) {
//                System.out.println("ingrese el dato para el indice : " + fila + columna);
//                matriz[fila][columna] = datoUser.nextInt(); // guardando el dato del user
//            }
//        }
//
//        //mostrando los datos del user
//        for (int fila = 0; fila < 2; fila++) {
//            for (int columna = 0; columna < 2; columna++) {
//                System.out.println("indice : " + fila + columna);
//                System.out.println("tengo guardado un : " + matriz[fila][columna]);
//            }
//        }
        int matriz[][] = new int[4][4];
        //System.out.println(n.retornaNumeroRandom(100, 1));
        //cargarDatosMatriz(matriz);
        System.out.println(promedioElementos(matriz));

        int vector[] = new int[3];
        vector[0] = 1;
        vector[1] = 2;
        vector[2] = 3;
    }

    //Funcion que retorna un numero random
    public static int retornaNumeroRandom(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    //CARGANDO DATOS Y PONIENDO DATOS A LA MATRIZ MANUALMENTE
    public static void cargarDatosMatriz(int matriz[][]) {
        Scanner datoUser = new Scanner(System.in);
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                System.out.println("ingrese dato para la pos : " + fila + " " + +columna);
                matriz[fila][columna] = datoUser.nextInt();
                System.out.println("indice : " + fila + columna + " tengo guardado un : " + matriz[fila][columna]);
            }
        }
    }

    // CARGANDO DATOS , PONIENDO DATOS Y MOSTRANDO DATOS A LA MATRIZ RANDOMICAMENTE
    public static void cargarDatosMatrizRandom(int matriz[][]) {
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                matriz[fila][columna] = retornaNumeroRandom(5, 1);
                System.out.println("Pos : " + fila + " " + columna + "; Dato: " + matriz[fila][columna]);
            }
        }
    }

    // EJERCICIOS

    //1. Sumar todos los datos de una matriz
    public static int sumarElementosMatriz(int matrizSuma[][]) {
        cargarDatosMatrizRandom(matrizSuma);
        int suma = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                suma = suma + matrizSuma[fila][columna];
            }
        }
        return suma;
    }

    //2. determinar cuantos elementos pares hay en la matriz
    public static int elementosParesMatriz(int matriz[][]) {
        cargarDatosMatrizRandom(matriz);
        int c = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columna = 0; columna < 4; columna++) {
                if (matriz[fila][columna] % 2 == 0) {
                    c++;
                }
            }
        }
        return c;
    }

    //2. determinar el promedio de todos los elementos de la matriz
    public static float promedioElementos(int matriz[][]) {
        cargarDatosMatrizRandom(matriz);
        float suma = 0;
        for (int fila = 0; fila < 4; fila++) {
            for (int columa = 0; columa < 4; columa++) {
                suma = suma + matriz[fila][columa];
            }
        }             // num filas   *   num columnas
        return suma / (matriz.length * matriz[0].length);
    }


}
