/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisClases;

/**
 *
 * @author carlo
 */
public class Vehiculo {

    private String marca;
    private String modelo;
    private int año;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String valor) {
        marca = valor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String valor) {
        modelo = valor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public void imprimirDatos() {
        System.out.println("La marca es :"+ marca);
        System.out.println("El modelo es :"+ modelo);
        System.out.println("El año es :"+ año);

    }
}
