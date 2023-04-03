/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author carlo
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1= new Estudiante("Carlos","Carrillo",18,"22550332");
        estudiante1.imprimirDatos();
        
        System.out.println("--------------------------------");
        
        Docentes docente1 = new Docentes();
        docente1.setNombre("Martina");
        docente1.setApellido("Chavez");
        docente1.setEdad(28);
        docente1.setPlaza("Tiempo completo");
        docente1.imprimirDatos();
        //PUEDO TRATAR A LOS OBJETOS DE LAS SUBCLASES
        //COMO OBJETOS DE LA SUPERCLASE
        //AL REVÉS NO SE PUEDE
        //ESTOY ASIGNANDO UN OBJETO DE TIPO PERSONA 
        //A UNA VARIABLE DE TIPO PERSONA
        Persona perso = estudiante1;
        //ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona perso2 = docente1;
        Persona perso3 = new Persona();
        
        //Es imposible convertir una persona en un estudiante
        //no podemos agregar cosas, simplemente ocultamos
        //propiedades
        //Estudiante estudiante = perso3;
    }
    
}
