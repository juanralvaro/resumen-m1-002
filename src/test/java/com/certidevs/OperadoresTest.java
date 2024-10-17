package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OperadoresTest {

    @Test
    void operadoresAritmeticos() {
        int numero1 = 30;
        int numero2 = 17;

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        float divisionFloat = numero1 / numero2;
        assertEquals(47, suma);
        assertEquals(13, resta);
        assertEquals(510, multiplicacion);

        double divisionDouble = numero1 / numero2;

        double divisionImposible = numero1 / 0;

        double suma2 = division + 10;

    }

    @Test
    void operadoresComparadoresMayor() {

        int edad = 43;
        boolean esMayorEdad = edad == 18;

        assertTrue(esMayorEdad);
        assertTrue(edad > 18);
    }

    @Test
    void operadoresComparadoresMenor() {

        int edad = 43;
        boolean esMenorEdad = edad < 18;

        assertFalse(esMenorEdad);
        assertTrue(edad < 100);
    }

    @Test
    void operadoresComparadoresIgual() {

        int edad = 43;
        boolean esIgualEdad = edad == 18;

        assertFalse(esIgualEdad);
        assertTrue(edad == 43);
    }

    @Test
    void operadoresComparadoresDiferente() {

        int edad = 43;
        int edad2 = 18;
        boolean esDiferenteEdad = edad != edad2;

        String nombre = "Juan R Álvaro";
        String ocupacion = null;

        boolean tieneOcupacion = ocupacion != null;
        assertFalse(tieneOcupacion);

        assertTrue(esDiferenteEdad);
        assertTrue(edad != 43);


    }

    @Test
    void operadoresComparadoresDiferente2() {
        // Esto tras el sout no se mostraría: error a propósito (no operar con null)

        //String apellido = "Álvaro";
        //String apellidos = apellido + apellido2;
        //System.out.println(apellidos);

        // A partir de aquí esto no se mostrará en la consola
        //boolean tieneOcupacion = ocupacion != null;
        //assertTrue(tieneOcupacion);
    }

    @Test
    void operadoresLogicos() {
        boolean esMayorDeEdad = true;
        boolean estaJubilado = false;
        boolean esMayorDeEdadY = esMayorDeEdad && estaJubilado;
        boolean esMayorDeEdadO = esMayorDeEdad || estaJubilado;
        assertFalse(esMayorDeEdadY);
        assertTrue(esMayorDeEdadO);
    }

    @Test
    void operadorLogicoOr() {
        boolean esMayorDeEdad = true;
        boolean estaJubilado = false;

        boolean esMayorDeEdadO = esMayorDeEdad || estaJubilado;
        assertTrue(esMayorDeEdadO);

        //Los dos falsos

        boolean esMayor2 = false;
        boolean estaJubilado2 = false;

        boolean esMayorDeEdadO2 = esMayor2 || estaJubilado2;
        assertFalse(esMayorDeEdadO2);
    }

    @Test
    void operadorLogicoNot() {
        boolean esMayorDeEdad = true;

        System.out.println(esMayorDeEdad);
        System.out.println(!esMayorDeEdad);
    }

    @Test
    void operadorAsignacion() {

        int sueldo = 20;

        // forma larga de sumar y asignar
        sueldo = sueldo + 2;

        // forma corta de sumar y asignar
        sueldo += 2;

        assertEquals(24, sueldo);

        sueldo -= 2;

        sueldo *= 2;

        sueldo /= 2;
    }
}
