/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author carlo
 */
//Docentes is-a (es-un) Persona
public class Docentes extends Persona {

    private String plaza;

    public Docentes() {
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.plaza = "------";
    }

    public Docentes(String nombre, String apellido, int edad, String plaza) {
        super(nombre, apellido, edad);//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.plaza = plaza;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();//PERSONA
        System.out.println("Plaza: " + plaza);
    }
}
