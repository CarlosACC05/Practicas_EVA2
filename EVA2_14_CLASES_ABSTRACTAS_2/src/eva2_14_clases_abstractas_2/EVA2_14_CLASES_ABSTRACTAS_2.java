/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_clases_abstractas_2;

/**
 *
 * @author carlo
 */
public class EVA2_14_CLASES_ABSTRACTAS_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante();
        
        estudiante1.imprimirDatos();
        
        Estudiante estudiante2 = new Estudiante("Carlos",18, "22550332");
        
        estudiante2.imprimirDatos();
        
    }
    
}
