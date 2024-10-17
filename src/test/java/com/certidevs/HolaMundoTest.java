package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HolaMundoTest {

    @Test
    void hola() {
        String respuesta = HolaMundo.BosDias();
        assertEquals("Bos días", respuesta);
    }

}
