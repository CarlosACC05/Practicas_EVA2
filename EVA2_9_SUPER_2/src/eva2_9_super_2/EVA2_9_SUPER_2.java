/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_super_2;

/**
 *
 * @author carlo
 */
public class EVA2_9_SUPER_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Carlos","Carrillo",18,"22550332");
        estudiante.imprimirDatos();
        
        
        System.out.println("----------------");
        
        Proveedores proveedor = new Proveedores("Carlos","Cancino",18,"BB7YHT3H");
        proveedor.imprimirDatos();
        
        
        System.out.println("----------------");

        Docentes docente = new Docentes("Alberto","Amaya",39,"Educacion fisica");
        docente.imprimirDatos();
        
    }
    
}
