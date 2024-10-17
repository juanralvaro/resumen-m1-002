package com.certidevs;

import java.util.Scanner;

public class EjerciciosTest {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("""
                Bienvenido a la app de Certidevs. Elige un curso:
                1 - Python
                2 - Java
                3 - C++
                4 - JavaScript
                5 - PHP
                6 - Ruby
                7 - Go
                """);

        while (true) {
            System.out.println("Seleccione una opción.");
            int opcionElegida = consola.nextInt();

            if (opcionElegida == 1) {
                System.out.println("Has elegido Python");
            } else if (opcionElegida == 2) {
                System.out.println("Has elegido Java");
            } else if (opcionElegida == 3) {
                System.out.println("Has elegido C++");
            } else if (opcionElegida == 4) {
                System.out.println("Has elegido JavaScript");
            } else if (opcionElegida == 5) {
                System.out.println("Has elegido PHP");
            } else if (opcionElegida == 6) {
                System.out.println("Has elegido Ruby");
            } else if (opcionElegida == 7) {
                System.out.println("Has elegido Go");
            } else {
                System.out.println("La opción seleccionada no es correcta");
            }
        }
    }

    void opcionSwitch() {
        Scanner console = new Scanner(System.in);
        int opcionElegida = console.nextInt();

        switch (opcionElegida) {
            case 1 -> System.out.println("Has elegido Python");
            case 2 -> System.out.println("Has elegido Java");
            case 3 -> System.out.println("Has elegido C++");
            case 4 -> System.out.println("Has elegido JavaScript");
            case 5 -> System.out.println("Has elegido PHP");
            case 6 -> System.out.println("Has elegido Ruby");
            case 7 -> System.out.println("Has elegido Go");
            default -> System.out.println("La opción seleccionada no es correcta");
        };
        System.out.println(opcionElegida);
    }


    void imprimirDatosArray() {
        String[] leyes = {"Python", "Java", "C++", "JavaScript", "PHP", "Ruby", "Go"};
        for (String ley : leyes) {
            System.out.println(ley);
        }
    }

    void guardarUnNombre() {
        Scanner console = new Scanner(System.in);
        String nombre = console.nextLine();
        System.out.println("Hola " + nombre);
    }

}
