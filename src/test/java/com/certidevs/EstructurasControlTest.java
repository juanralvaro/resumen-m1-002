package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstructurasControlTest {

    @Test
    void estructurasControlIf() {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }


        if (edad >= 18)
            System.out.println("Eres mayor de edad"); //Sin llaves al ser sólo una sentencia


        boolean esMenorDeEdad = false;
        if (esMenorDeEdad) {
            System.out.println("Eres menor de edad"); // No se ejecuta
        }

    }

    @Test
    void estructurasControlIfElse() {
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        if (edad < 18) {
            return;
        }
        System.out.println("Eres mayor de edad");
    }
    @Test
    void estructurasControlIfElseIf() {
        int edad = 43;

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad > 18 && edad < 65) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Estás jubilado");
        }
    }

    @Test
    void estructurasControlIfAnidados() {

        int edad = 43;
        boolean esSocio = true;
        String turno = "A";

        if (esSocio) {
            System.out.println("Tiene descuento");

            if (esSocio || turno.equals("B")) {
                System.out.println("Se le atenderá pronto");
            }

        }else {
            System.out.println("No se le atenderá pronto");
        }
    }

    @Test
    void estructurasControlSwitchRetornoVariable() {
        int mes = 9;
        String diaMes = switch (mes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "No existe ese mes";
        };

        System.out.println(diaMes); //
        assertEquals("Septiembre", diaMes);
    }

    @Test
    void estructurasControlSwitchSinVariable() {
        int mes = 9;
        switch (mes) {
            case 1 -> System.out.println("Enero");
            case 2 -> System.out.println("Febrero");
            case 3 -> System.out.println("Marzo");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Mayo");
            case 6 -> System.out.println("Junio");
            case 7 -> System.out.println("Julio");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Septiembre");
            case 10 -> System.out.println("Octubre");
            case 11 -> System.out.println("Noviembre");
            case 12 -> System.out.println("Diciembre");
            default -> System.out.println("No existe ese mes");
        }
    }
}