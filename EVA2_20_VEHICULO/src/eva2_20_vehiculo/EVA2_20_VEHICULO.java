/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author carlo
 */
public class EVA2_20_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil(4, "Diesel", "Standar", 10, "Toyota", "Rojo", "Toyota GR Yaris");
        System.out.println("Auto 1");
        auto1.acelerar();
        auto1.acelerar();
        auto1.imprimirVelo();
        
        System.out.println("------------------------------");


        Automovil auto2 = new Automovil(4, "Gasolina", "Automatico", 0, "Volksgawen", "Negro", "Amarok");
        System.out.println("Auto 2");
        auto2.acelerar();
        auto2.acelerar();
        auto2.detener();
        auto2.acelerar();
        auto2.imprimirVelo();

        System.out.println("------------------------------");

        Bicicleta bici1 = new Bicicleta(2, 21, 100, "Argon 18", "Plata", "E-112");
        System.out.println("Bici 1");
        bici1.detener();
        bici1.acelerar();
        bici1.detener();
        bici1.acelerar();
        bici1.imprimirVelo();

    }

}
