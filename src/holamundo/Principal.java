package holamundo;

import javax.swing.*;
import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
//        int numero = 35;
//        int numero2 = 20;
//        System.out.println("----------ANTES--------------");
//        System.out.println("num1 : " + numero);
//        System.out.println("num2 : " + numero2);
//        int aux = numero; //35
//        numero = numero2;
//        numero2 = aux;
//        System.out.println("------------DESPUES-------------");
//        System.out.println("num1 : " + numero);
//        System.out.println("num2 : " + numero2);

        //int datoUser = Integer.parseInt(JOptionPane.showInputDialog("Introduce el valor para el vector"));
//        Scanner datoUser = new Scanner(System.in);
//        Principal n = new Principal();
//        int vector[] = new int[4];
//        //Llenado de datos
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println("ingrese el valor para el indice : " + i);
//            vector[i] = datoUser.nextInt();
//        }
////        // Recorrido
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println("estoy en el indice : " + i);
//            System.out.println("tengo guardado un " + vector[i]);
//            System.out.println("-----------------------------");
//        }
//
//        int vector[] = new int[5];
////        cicloFor();
//        recorrerVector(vector);
        int matriz[][] = new int[3][3]; // matriz
        //asignacion manual
//        matriz[0][0] = 5;
//        matriz[0][1] = 13;
//        matriz[0][2] = 96;
//        matriz[1][0] = 24;
//        matriz[1][1] = 33;
//        matriz[1][2] = 71;
//        matriz[2][0] = 446;
//        matriz[2][1] = 228;
//        matriz[2][2] = 24;
        Scanner datoUser = new Scanner(System.in);
        //ASIGNACION POR DATO DE USUARIO
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese el valor de la posicion f: " + f + " c: " + c);
                matriz[f][c] = datoUser.nextInt();
            }
        }
        //recorrido
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("el valor de la posicion f:" + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
    }

    public void algo() {
        int num1 = 15, num2 = 15;
        if (num2 > num1) {
            System.out.println("mayor num2");
        } else {
            if (num1 == num2) {
                System.out.println("son iguales");
            } else {
                System.out.println("mayor num1");
            }
        }
    }

    public void cicloContador() {
        int c = 0;
        while (c <= 10) {
            System.out.println("estoy en la vuelta " + c);
            c++;
        }
    }

    public static void cicloFor() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("estoy en la vuelta " + i);
        }
    }

    public static void recorrerVector(int[] vector) {
        Scanner datoUser = new Scanner(System.in);
        // recorriendo y mostrando sus datos del vector
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el valor para el indice : " + i);
            vector[i] = datoUser.nextInt();
            System.out.println("pisicion: " + i + " dato: " + vector[i]);
        }
    }
    public static void cargarMatrizManual(int [][] matriz){
        Scanner datoUser = new Scanner(System.in);
        //recorrido y mostrando los datos de la matriz
        //for (int fila= 0; fila<)
    }

}
