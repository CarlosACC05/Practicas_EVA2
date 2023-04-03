/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author carlo
 */
public class Automovil extends Vehiculo  {
    private int cilindros;
    private String combustible;
    private String tipo;

    public Automovil() {
    }

    public Automovil(int cilindros, String combustible, String tipo, int velocidad, String marca, String color, String modelo) {
        super(velocidad, marca, color, modelo);
        this.cilindros = cilindros;
        this.combustible = combustible;
        this.tipo = tipo;
    }

    @Override
    public void imprimirVelo() {
        super.imprimirVelo();
        System.out.println("Cilindros: "+ cilindros +"\n"+ "Combustible: " +combustible+"\n"+ "Tipo: "+ tipo+ "\n"+ "Velocidad: "+ velocidad);
        
        
    }
}
