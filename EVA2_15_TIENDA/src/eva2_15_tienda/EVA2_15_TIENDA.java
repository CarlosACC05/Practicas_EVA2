/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_tienda;

import Productos.Computadora;
import Productos.Playera;

/**
 *
 * @author carlo
 */
public class EVA2_15_TIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Computadora compu = new Computadora(99.0,"Computadora Gamer","Paquete","Dell","D234B",1,15.6,12,"i7","2TB");
        
        System.out.println(compu.toString());
        
        System.out.println("--------------------------------------------------------------");
        
        Playera playera = new Playera(60.0,"Playera 1","Paquete","Adidas","Rojo","XXL","Corta");
        
        System.out.println(playera);
        
    }
    
}
