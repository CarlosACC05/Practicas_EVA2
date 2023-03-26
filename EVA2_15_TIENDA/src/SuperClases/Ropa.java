/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SuperClases;

/**
 *
 * @author carlo
 */
public abstract class Ropa extends Producto {

    private String marca;
    private String color;

    public Ropa() {
        super();
        this.marca = "-----";
        this.color = "-----";
    }

    public Ropa(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public Ropa(double precio, String nombre, String unidad, String marca, String color) {
        super(precio, nombre, unidad);
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Fabricante: " + marca + "\n"
                + "Modelo: " + color;
    }

}
