/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_14_clases_abstractas_2;

/**
 *
 * @author carlo
 */
public class Estudiante extends Persona{
    private String noControl;

    public Estudiante() {
        super();
        this.noControl = "-----";
    }


    public Estudiante(String nombre, int edad, String noControl) {
        super(nombre, edad);
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: "+ super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Numero de control: "+ this.getNoControl());
    
    }
}
