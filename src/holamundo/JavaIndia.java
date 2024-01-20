package holamundo;

import javax.swing.*;

public class JavaIndia {
    public static void main(String[] args) {
//        System.out.println("hola mundo");
//        JOptionPane.showMessageDialog(null, "hola");
        JavaIndia n = new JavaIndia();
        n.numeros();
    }

    // Ejercicios de bucles
    //1. leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
    // introduzca un numero negativo
    public static void numeroCuadrado() {
        int cuadrado;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));
        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "el nmero : " + numero + "elevado es : " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero : "));
        }
    }

    //2. leer un numero e iundicar si es positivo o negativo.
    // el proceso se repetira hasta que se introduzca un 0
    public static void indicarNumeroNegativoPositivo(int numero) {
        while (numero != 0) {
            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "positvo");
            } else {
                JOptionPane.showMessageDialog(null, "negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("introdusca otro numero : "));
        }
    }

    public static void indicarNumerosParesImpares(int numero) {
        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, "par");
            } else {
                JOptionPane.showMessageDialog(null, "impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero : "));
        }
    }

    //4. pedir numeros negativos hasta que se teclee uno negativo, y mostrar cuantos se han intorudcido
    public void numeros() {
        int contador = 0;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));
        while (numero >= 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero : "));
            contador++;
            JOptionPane.showMessageDialog(null,"numeros introducidos : " + contador++);
        }
    }
}
