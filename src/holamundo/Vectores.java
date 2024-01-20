package holamundo;

import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {
        Scanner datoUser = new Scanner(System.in);
        int vector[] = new int[4];
        //cargando datos
        for (int i = 0 ; i<vector.length;i++){
            System.out.println("ingrese el valor para el indice : " + i);
            vector[i] = datoUser.nextInt(); // en la posicion del indice ingresa el dato del user
        }

        //recorrido
        for (int i = 0; i < vector.length; i++) {
            System.out.println("estoy en el indice : " + i);
            System.out.println("tengo guardado un " + vector[i]); // muestra el dato que esta en la pos del vector
        }
    }
}
