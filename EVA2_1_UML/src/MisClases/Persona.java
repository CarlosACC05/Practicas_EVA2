/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author carlo
 */
public class Persona {

    private int ID;
    private String nombre;
    private int edad;

    public int getID() {
        return ID;
    }

    public void setID(int valor) {
        ID = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }

    public void imprimirDatos() {
        System.out.println("El ID es: " +ID);
        System.out.println("El nombre es : "+ nombre);
        System.out.println("La edad es :"+ edad);

    }
}
