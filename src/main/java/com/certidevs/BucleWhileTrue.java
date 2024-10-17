package com.certidevs;

import java.util.Scanner;

public class BucleWhileTrue {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("""
                    Te damos la bienvenida al cajero automático. Elige una opción:
                    1 - Ingresar
                    2 - Retirar
                    3 - Salir
                    """);
        while (true) {
            System.out.println("Seleccione una opción.");
            int opcionElegida = consola.nextInt();

            if (opcionElegida == 1) {
                System.out.println("Has elegido ingresar dinero");
            } else if (opcionElegida == 2) {
                System.out.println("Has elegido retirar dinero");
            } else if (opcionElegida == 3) {
                System.out.println("Has elegido salir");
                break;
            } else
                System.out.println("La opción seleccionada no es correcta");
        }
    }

}
