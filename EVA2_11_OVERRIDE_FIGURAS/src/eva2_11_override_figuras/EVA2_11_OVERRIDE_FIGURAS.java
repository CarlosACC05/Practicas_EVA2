/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_override_figuras;

/**
 *
 * @author carlo
 */
public class EVA2_11_OVERRIDE_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Circulo circu = new Circulo();
        System.out.println("Área: " + circu.calcularArea());
        System.out.println("Perimetro: " + circu.calcularPerimetro());
        System.out.println("----------------------------------------");

        Circulo circu2 = new Circulo(5);
        System.out.println("Área: " + circu2.calcularArea());
        System.out.println("Perimetro: " + circu2.calcularPerimetro());
        System.out.println("----------------------------------------");

        Triangulo trian = new Triangulo();
        System.out.println("Área: " + trian.calcularArea());
        System.out.println("Perimetro: " + trian.calcularPerimetro());
        System.out.println("----------------------------------------");
        
        Triangulo trian2 = new Triangulo(5, 5);
        System.out.println("Área: " + trian2.calcularArea());
        System.out.println("Perimetro: " + trian2.calcularPerimetro());
    }

}
