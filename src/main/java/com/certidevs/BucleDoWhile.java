package com.certidevs;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        // LA DIFERENCIA ENTRE WHILE Y DO-WHILE ES QUE DO-WHILE SE EJECUTA AL MENOS UNA VEZ

        String password = "Betanzos";
        var consola = new Scanner(System.in);
        String passwordLeida;

        do {
            System.out.println("Para poder continuar, introduzca la contraseña");
            passwordLeida = consola.next();
        } while (!password.equals(passwordLeida));
        System.out.println("Te damos la bienvenida a Betanzos");
    }
}
