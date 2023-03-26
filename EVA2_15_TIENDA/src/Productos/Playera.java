/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author carlo
 */
public class Playera extends Ropa {

    private String talla;
    private String tipo;

    public Playera() {
        super();
        this.talla = "----";
        this.tipo = "----";
    }

    public Playera(double precio, String nombre, String unidad, String marca, String color, String talla, String tipo) {
        super(precio, nombre, unidad, marca, color);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double precioVenta(int cant) {
        //10 unidades ---> el precio es de 50%
        if (cant < 10) {
            return getPrecio() * cant;
        } else {
            return (getPrecio() * 0.50) * cant;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Talla: " + talla + "\n"
                + "Tipo: " + tipo + "\n"+"Precio de venta: " + precioVenta(12);
    }
}
