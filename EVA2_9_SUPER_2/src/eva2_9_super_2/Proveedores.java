/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author carlo
 */
            //Proveedores is-a (es-un) Persona
public class Proveedores extends Persona{
    private String rfc;

    
     public Proveedores() {
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.rfc= "------";
    } 
     public Proveedores(String nombre, String apellido, int edad, String rfc) {
        super(nombre, apellido, edad);//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this.rfc=rfc;
    } 
     
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();//PERSONA
        System.out.println("RFC: " + rfc);
    }
}
