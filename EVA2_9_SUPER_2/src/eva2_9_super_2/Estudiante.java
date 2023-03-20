/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author carlo
 */

            //Clase Derivada extends Clase base
            //SubClase extends SuperClase
            //Hijo extends Padre
            //Estudiante is-a (es-un) Persona
public class Estudiante extends Persona{

    private String noControl;

    //HAY QYE INCLUIR EL CONSTRUCTOR DEFAULT Y LA
    //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
    public Estudiante() {
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        this. noControl= "------";
    }

    public Estudiante(String nombre, String apellido, int edad, String noControl) {
        super(nombre, apellido, edad);//LLAMADA AL CONSTRUCTOR
        this.noControl = noControl;
    }
 
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    //OVERRIDE: REEMPLAZA EL METODO (CON LA MISMA FIRMA) EN LA
    //SUPER CLASE, EN ESTE CASO , REEMPLAZA A imprimirDatos() de
    //Persona
    @Override
    public void imprimirDatos(){
        /*System.out.println("Datos:");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Edad: "+getEdad());
        System.out.println("No de control: " + this.noControl);*/
        
        super.imprimirDatos();//PERSONA
        System.out.println("No de control: " + noControl);
     }
}
