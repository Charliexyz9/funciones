/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Charlie
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
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

        producto = n1 * n2;

        System.out.println("El resultado es: " + producto);
        
        System.out.println("El resultado es: " + multiplicar(n1,n2));
        
        

    }

    public static int multiplicar(int a, int b) {
        return a * b;

    }

}
