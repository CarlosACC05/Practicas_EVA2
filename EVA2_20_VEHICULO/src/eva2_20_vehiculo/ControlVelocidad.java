/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_20_vehiculo;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public interface ControlVelocidad {
    Scanner leer = new Scanner (System.in);

    public abstract int acelerar();
    public abstract int detener();
    public abstract void imprimirVelo();
}
