/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_extends;

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

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
