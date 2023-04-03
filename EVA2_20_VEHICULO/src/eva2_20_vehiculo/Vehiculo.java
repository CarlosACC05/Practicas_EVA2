/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author carlo
 */
public abstract class Vehiculo implements ControlVelocidad{
    protected int velocidad;
    private String marca;
    private String color;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(int velocidad, String marca, String color, String modelo) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public int acelerar() {
        System.out.println("Cuánto quieres acelerar?");
        int a = leer.nextInt();
        return velocidad = velocidad + a;
        
    }

    @Override
    public int detener() {
        return velocidad = 0;
    }
    @Override
    public void imprimirVelo() {
        System.out.println("Datos:"+"\n"+"Marca: "+ marca+ "\n"+ "Modelo: " + modelo + "\n"+"Color: "+ color);
    }
    
    
   
}
