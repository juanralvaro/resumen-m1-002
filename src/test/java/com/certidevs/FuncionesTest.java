package com.certidevs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionesTest {

    /*
    FUNCIONES SIN PARÁMETROS
     */
    @Test
    void funcionesSinParametrosSinRetorno() {
        imprimir();
        imprimir();
    }
    void imprimir(){
        System.out.println("Buenas tardes.");
    }

    @Test
    void funcionesSinParametrosConRetorno() {
        String sentencia = obtenerSentencia();
        assertEquals("Estás condenado: ", sentencia);

        boolean esCulpable = esCulpable();
        assertEquals(true, esCulpable);

        double[] precios = obtenerPrecios();
        assertEquals(5, precios.length);
    }

    String obtenerSentencia(){
        return "Tirar botellas";
    }

    boolean esCulpable(){
        return true;
    }

    double[] obtenerPrecios(){
        return new double[]{1.45, 1.38, 1.19, 1.10, 1.62};
    }

    @Test
    void funcionesSinParametrosConRetornoConcatenarResultados(){
        String plato = plato1() + " " + plato2() + "\n" + plato3();
        System.out.println(plato);

        String plato1 = plato1();
        String plato2 = plato2();
        String plato3 = plato3();
        String otroplato = plato1() + " " + plato2() + "\n" + plato3();
        System.out.println(otroplato);
    }

    String plato1(){ return "plato1"; }
    String plato2(){ return "plato2"; }
    String plato3(){ return "plato3"; }
    /*
    FUNCIONES CON PARÁMETROS
     */

    @Test
    void funcionesSinRetornoConParametro() {
        viajar("Pedro");
        viajar("Maria");
        viajar("Leandro");

        // 1. Crear un array de países que tenga al menos 5 nombres
        String[] paises = {"España", "Francia", "Alemania", "Italia", "Japón"};
        // 2. Crear un bucle for each que itere por cada país ejecutando la función viajar
        for (String pais : paises) {
            viajar(pais); // pais.for
        }

    }

    void viajar(String pais) {
        System.out.println("He viajado a " + pais);
    }

    @Test
    void funcionesSinRetornoConParametroCalculo() {
        //1. Crear un array de leyes
        int[] leyes = {22, 17, 14, 12, 8};
        //2. Crear una función que reciba el array de leyes como parámetro y calcule la media por año y la imprima por consola
        calcularMediaAno(leyes);
    }

    void calcularMediaAno(int[] leyes) {
        //1. Calcular la suma
        int suma = 0;
        for (int ley : leyes) {
            suma += ley;
        }
        //2. División entre numero de leyes
        float mediaAno = (float) suma / leyes.length;

        //TODO NOTA: si queremos redondear entonces deberemos conservar los decimales y luego aplicar el redondeo

        //3. Imprimir resultado
    }

    //TDD - Test Driven Development
    @Test
    void funcionesConRetornoConParametro() {
        float precio = 7; // 7 €

        float precioConDescuento = calcularPrecioConDescuento(precio); // 7 €
        float precioConDescuento2 = calcularPrecioConDescuento2(precio);
        assertEquals(5.60f, precioConDescuento);
        assertEquals(5.60f, calcularPrecioConDescuento2(precio));
    }

    float calcularPrecioConDescuento(float precio){
        float descuento = (float) (precio * 0.20); // 1.40 €
        float precioTotal =  precio - descuento; // 5.60 €
        return precioTotal;
    }

    float calcularPrecioConDescuento2(float precio){
        return (float) (precio * 0.80);
    }
}
