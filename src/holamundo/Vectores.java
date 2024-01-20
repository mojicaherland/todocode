package holamundo;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
//        Scanner datoUser = new Scanner(System.in);
//        int vector[] = new int[4];
//        //cargando datos
//        for (int i = 0 ; i<vector.length;i++){
//            System.out.println("ingrese el valor para el indice : " + i);
//            vector[i] = datoUser.nextInt(); // en la posicion del indice ingresa el dato del user
//        }
//
//        //recorrido
//        for (int i = 0; i < vector.length; i++) {
//            System.out.println("estoy en el indice : " + i);
//            System.out.println("tengo guardado un " + vector[i]); // muestra el dato que esta en la pos del vector
//        }

        int vector[] = new int[4];
        cargarVectorRandom(vector);
    }

    //CARGA DATOS MANUALMENTE AL VECTOR Y LOS MUESTRA
    public static void cargarVectorManual(int vector[]) {
        Scanner datoUser = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese dato para la pos : " + i);
            vector[i] = datoUser.nextInt();
            System.out.println("Pos : " + i + "; Dato : " + vector[i]);
        }
    }

    // CARGA DATOS RANDOMICAMENTE AL VECTOR Y LOS MUESTRA
    public static void cargarVectorRandom(int vector[]) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Matrices.retornaNumeroRandom(100, 1);
            System.out.println("Pos : " + i + "; Dato: " + vector[i]);
        }
    }
}
