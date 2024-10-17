package com.certidevs;

import java.util.Scanner;

public class BucleDoWhileConReintento {
    public static void main(String[] args) {
        // LA DIFERENCIA ENTRE WHILE Y DO-WHILE ES QUE DO-WHILE SE EJECUTA AL MENOS UNA VEZ

        String password = "Betanzos";
        var consola = new Scanner(System.in);
        String passwordLeida;
        int intento = 0;

        do {
            System.out.println("Para poder continuar, introduzca la contraseña");
            passwordLeida = consola.next();
            intento ++;
        } while (!password.equals(passwordLeida) && intento < 5); // Sólo permite 3 intentos
        System.out.println("Te damos la bienvenida a Betanzos");
    }
}
