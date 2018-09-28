/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionesExternas;

import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class FuncionesExternas {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1,
                n2,
                producto;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        n1 = teclado.nextInt();

        System.out.println("Ingrese otro numero: ");
        n2 = teclado.nextInt();
        
        llamarFunciones(n1, n2);

    }

    private static void llamarFunciones(int c, int d) {

        if (c <= 0 || d <= 0) {
            
            if (c <= 0){
                System.out.println("El primer valor ingresado es " + c +
                        ", debe ser mayor a 0 (cero) ");
            }
            
            if (d <= 0){
                System.out.println("El segundo valor ingresado es " + d + 
                        ", debe ser mayor a 0 (cero)");
            }
                
            System.out.println("Imposible realizar las operaciones");
            
        } else {

            System.out.println("\nLos resultados de las 4 (cuatro) operaciones son\n");

            System.out.println("La suma es: " + sumar(c, d));
            System.out.println("La resta es " + restar(c, d));
            System.out.println("La multiplicacion es " + multiplicar(c, d));
            System.out.println("La division es: " + dividir(c, d));

            System.out.println("\nY al reves seria: \n");

            System.out.println("La suma es: " + sumar(d, c));
            System.out.println("La resta es " + restar(d, c));
            System.out.println("La multiplicacion es " + multiplicar(d, c));
            System.out.println("La division es: " + dividir(d, c));
        }

    }

    private static int multiplicar(int a, int b) {
        int resultado = 0;
        while (a > 0 && b > 0) {
            resultado = a * b;
            a = 0;
        }
        return resultado;

    }

    private static int sumar(int a, int b) {
        int resultado = 0;
        while (a > 0 && b > 0) {
            resultado = a + b;
            a = 0;
        }
        return resultado;
    }

    private static int restar(int a, int b) {
        int resultado = 0;
        while (a > 0 && b > 0) {
            resultado = a - b;
            a = 0;
        }
        return resultado;
    }

    private static float dividir(int a, int b) {
        float resultado = 0;
        while (a > 0 && b > 0) {
            resultado = (float) a / (float) b;
            a = 0;
        }
        return resultado;
    }

}
