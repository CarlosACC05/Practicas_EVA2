/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int[] datos = new int[10];
        /*Circulo[] circulos = new Circulo[10];
        //un arreglo en java va de la posicion 0 a n-1
        //N es la cantidad de elementos del arreglo
        circulos[0] = new Circulo();
        circulos[0].calcularArea();
        for (int i = 0; i < circulos.length; i++) {
            circulos[i] = new Circulo(i);//CREAMOS CADA UNO DE LOS OBJETOS
            circulos[i].imprimirDatos();
        }*/
        Figuras[] figuras;//declaramos un arreglo, pero no lo
                          //hemos creado
        //Con el scanner caputramos por el teclado la cantidad
        //de firuas a utilizar
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantas figuras quieres capturar?");
        int cant = input.nextInt();//nos perimite capturar
        //System.out.println("Cantidad: "+ cant);
        figuras = new Figuras[cant];//creamos el arreglo con la
                                    //cantidad de figuras que 
                                    //quiere el usuario
        for (int   i= 0;  i < cant;  i++) {
            System.out.println("Captura el tipo de figura");
            System.out.println("1. Circulo, 2. Triangulo");
            int figu = input.nextInt();
            if(figu==1){//circulo
            Circulo circu = new Circulo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(input.nextDouble());
                figuras[i] = circu;
            
            }else{//triangulo
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base: ");
                trian.setBase(input.nextDouble());
                
                System.out.println("Introduce la altura: ");
                trian.setAltura(input.nextDouble());
                figuras[i] = trian;
            
            }
            
        }
        //IMPRIMIR LOS RESULTADOS:
        for (int i = 0; i < figuras.length; i++) {
            if(figuras[i] instanceof Circulo){
                //System.out.println("Circulo:");
                Circulo circu = (Circulo)figuras[i];//casting
                circu.imprimirDatos();
            }else{
                
                //System.out.println("Triángulo:");
                Triangulo trian = (Triangulo)figuras[i];
                trian.imprimirDatos();
              }  
            //System.out.println("Figura: "+i+1);
            //System.out.println("ÁREA: " + figuras[i].calcularArea());
            //System.out.println("PERIMETRO: " + figuras[i].calcularPeri());
            System.out.println("");
            
        }
    }
    
}
