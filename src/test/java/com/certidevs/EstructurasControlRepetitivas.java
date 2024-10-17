package com.certidevs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstructurasControlRepetitivas {

    @Test
    void estructurasForI() {
        // START: i = 0;
        // STOP: i < 10;
        // STEP: i++

        // OPCIÓN: bucle por defecto, empieza en 0 y termina en 9
        for (int i = 2; i < 22; i += 2) {
            System.out.println("Iteración número " + i);
        }
    }

    @Test
    void estructurasForIConArray() {
        double[] marcas = {0.85, 0.96, 0.79, 0.95, 0.92, 1.02, 1};

        System.out.println(marcas); // no imprime el contenido del array, imprime su asignación en memoria
        System.out.println(marcas.length); // Imprime el número de elementos del array, es decir, su longitud
        System.out.println(marcas[0]); // 7
        System.out.println(marcas[1]); // 4
        System.out.println(marcas[2]); // 8

        // Bucle para poder imprimir el contenido del array
        for (int i = 0; i < marcas.length; i++) {
            // System.out.println("Iteración número " + i);
            System.out.println("Marca número " + i + " cuesta " + marcas[i]);
        }
    }

    @Test
    void estructurasForIArrayString() {
        String[] localidades = {"Betanzos", "Bergondo", "Culleredo"};

        for (int i = 0; i < localidades.length; i++) {
            System.out.println(localidades[i]);
        }
    }

    @Test
    void estructurasForICalcularPrecioMedio() {
        double[] precios = {0.85, 0.96, 0.79, 0.95, 0.92, 1.02, 1};

        double suma = 0;
        for (int i = 0; i < precios.length; i++) {
            suma += precios[i];
        }
        System.out.println(suma);

        double media = (double) suma / precios.length;

        assertEquals(0.92, media);
    }

    @Test
    void estructurasForEach() {
        String[] localidades = {"Betanzos", "Bergondo", "Oleiros", "Iñás"};
        for (String localidad : localidades) { // for ((tipo de dato) (variable) : (nombre del array))
            System.out.println(localidad);
        }
        for (var localidad : localidades) {
            System.out.println(localidad);
        }

        // Imprimir todo el contenido del array de forma correcta, sin tener que hacerlo nosotros
        System.out.println(Arrays.toString(localidades)); // [Betanzos, Bergondo, Oleiros, Iñás]
    }

    @Test
    void estructurasForEachconContinue() {
        String[] concejales = {"Vanessa", "Pablo", "María", "Diego", "Manuel"};
        for (String concejal : concejales) {
            if (concejal.equals("María")) continue;
            System.out.println("Felicidades, " + concejal + " , por su cargo");
        }
        //Resto bucles: ver BucleJava.java y similares
    }

}
