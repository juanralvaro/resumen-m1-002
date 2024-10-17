package com.certidevs;

import java.util.Scanner;

public class BucleWhilePassword {
    public static void main(String[] args) {

        /*
        Pedir al usuario una contraseña y si coincide con la que tenemos entonces puede pasar
        si no se queda iterando en el bucle pidiendo la contraseña otra vez
         */

        String password = "Betanzos";
        var consola = new Scanner(System.in);

        System.out.println("Para poder continuar, introduzca la contraseña");
        String passwordLeida = consola.next();

        while (!password.equals(passwordLeida)) {
            System.out.println("Credenciales incorrectas, introduce password de nuevo");
            passwordLeida = consola.next();
        }
    }
}
