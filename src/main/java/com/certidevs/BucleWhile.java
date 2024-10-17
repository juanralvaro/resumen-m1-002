package com.certidevs;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {

        //BUCLE WHILE CON ENTRADA DE CONSOLA PARA EDAD
        var consola = new Scanner(System.in);
        int edad = 0;

        // Si edad es menos de 65 entonces entra dentro del bucle
        // Si edad es 65 o mayor entonces NO ENTRA al bucle
        while (edad < 65) {
            System.out.println("Introduzca su edad. Obligatorio 65 o más años");
            edad = consola.nextInt();
        }
    }
}
