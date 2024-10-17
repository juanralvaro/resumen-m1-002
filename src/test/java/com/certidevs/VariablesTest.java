package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VariablesTest {

    @Test
    void tiposDeNumero() {
        byte numero1 = 1;
        short numero2 = 10;
        int numero3 = 33;
        long numero4 = 100;
        assertEquals(1, numero1);
    }

    @Test
    void tiposDeNumeroConDecimal() {
        float precio = 13.93f;
        double paga = 450.25;
    }

    @Test
    void tiposTexto() {
        String texto1 = "Éste es un texto de prueba en una línea";

        String textoLargo = """
                Este texto es un texto de varias líneas
                Unas más elaboradas
                que otras
                """;
        char caracter = 'Z';
    }

    @Test
    void booleanosVerdaderoFalso() {
        boolean esMayorDeEdad = true;
        boolean estaJubilado = false;
    }
}
