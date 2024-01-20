package holamundo;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        Scanner datoUser = new Scanner(System.in);
        //guardando los datos del user
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                System.out.println("ingrese el dato para el indice : " + fila + columna);
                matriz[fila][columna] = datoUser.nextInt(); // guardando el dato del user
            }
        }

        //mostrando los datos del user
        for (int fila = 0; fila < 2; fila++) {
            for (int columna = 0; columna < 2; columna++) {
                System.out.println("indice : " + fila + columna);
                System.out.println("tengo guardado un : " + matriz[fila][columna]);
            }
        }
    }
}
