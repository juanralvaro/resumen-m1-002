package com.certidevs;

import org.junit.jupiter.api.Test;

public class FuncionesAlcanceScopeTest {

    String apellido = "Quintana";

    @Test
    void funciones_Alcance() {
        String nombre = "Miguel";
        System.out.println(apellido); // variable a nivel de clase, sí deja
        float edad = Constantes.IVA; // constante a nivel global, sí deja
    }

    void funciones_Alcance2() {
        //System.out.println(nombre); // variable local a nivel de método, no deja en otros métodos
        System.out.println(apellido); // variable a nivel de clase, sí deja
        float precioIVA = Constantes.IVA; // constante a nivel global accesible en todos los lugares

        if (precioIVA > 0.5) {
            int nuevoPrecio = 80;
        }
        //System.out.println(nuevoPrecio); // no deja porque está en el alcance del if, no fuera

    }
}