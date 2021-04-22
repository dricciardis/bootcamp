package demo;

import java.util.Scanner;

public class LeerPorConsola {
    public static void main (String[] args)
    {
//        Scanner lee input por consola
        Scanner s = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = s.nextInt();

        System.out.print("Ingrese un nombre: ");
        String nombre = s.next();

        System.out.println("Numero: " + numero + " Nombre: " + nombre);

        s.close();
    }
}
