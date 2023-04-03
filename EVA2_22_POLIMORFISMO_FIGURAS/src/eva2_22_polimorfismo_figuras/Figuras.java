/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

/**
 *
 * @author carlo
 */
//No se pueden instanciar las interfaces 
//on como un ocntrato: estoy obligado a implementar
//solo métodos abstractos y contantes
public interface Figuras {
    public abstract double calcularArea();
    double calcularPeri();
}
