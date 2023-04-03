/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author carlo
 */
public class Bicicleta extends Vehiculo {

    private int ruedas;
    private int velocidades;

    public Bicicleta() {
    }

    public Bicicleta(int ruedas, int velocidades, int velocidad, String marca, String color, String modelo) {
        super(velocidad, marca, color, modelo);
        this.ruedas = ruedas;
        this.velocidades = velocidades;
    }

    @Override
    public void imprimirVelo() {
        super.imprimirVelo();
        System.out.println("Ruedas: "+ ruedas +"\n"+ "Velocidades: " +velocidades+"\n"+ "Velocidad: "+ velocidad);
    }

}
