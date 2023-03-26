/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Electronica;

/**
 *
 * @author carlo
 */
public final class Computadora extends Electronica {

    private double tamaño;
    private int memoria;
    private String procesador;
    private String DD;

    public Computadora() {
        super();
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "";
        this.DD = "";
    }

    public Computadora(double precio, String nombre, String unidad, String fabricante, String modelo, int garantia, double tamaño, int memoria, String procesador, String DD) {
        super(precio, nombre, unidad, fabricante, modelo, garantia);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.DD = DD;
    }

    @Override
    public double precioVenta(int cant) {
        //10 unidades ---> el precio es de 80%
        if (cant < 10) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * 0.80) * cant;
        }
    }

    public String toString() {
        return super.toString() + "\n" + "Tamaño: " + tamaño + "\n"
                + "Memoria: " + memoria + "\n"
                + "Procesador: " + procesador + "\n" + "DD: " + DD + "\n"+"Precio de venta: " + precioVenta(10);
    }
}
//Computadora es una clase final:
//ya no se puede heredar de una clase final
//class Laptop extends Computadora{}